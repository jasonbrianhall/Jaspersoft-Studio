/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved. http://www.jaspersoft.com.
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.jasper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.widgets.Display;

import com.jaspersoft.studio.model.MGraphicElement;
import com.jaspersoft.studio.model.util.KeyValue;
import com.jaspersoft.studio.utils.ExpressionUtil;
import com.jaspersoft.studio.utils.ModelUtils;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

import net.sf.jasperreports.engine.JRElement;
import net.sf.jasperreports.engine.JRExpression;
import net.sf.jasperreports.engine.JRImage;
import net.sf.jasperreports.engine.JRPrintElement;
import net.sf.jasperreports.engine.JRPrintImage;
import net.sf.jasperreports.engine.JasperReportsContext;
import net.sf.jasperreports.engine.base.JRBasePrintImage;
import net.sf.jasperreports.engine.convert.ElementConverter;
import net.sf.jasperreports.engine.convert.ReportConverter;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.type.OnErrorTypeEnum;
import net.sf.jasperreports.engine.type.ScaleImageEnum;
import net.sf.jasperreports.engine.util.JRExpressionUtil;
import net.sf.jasperreports.engine.util.JRImageLoader;
import net.sf.jasperreports.renderers.Renderable;
import net.sf.jasperreports.renderers.util.RendererUtil;

/**
 * Special image converter used to load the images in the editor. This one allow the repaint of an element only when a
 * new image is loaded
 * 
 * @author Orlandin Marco
 * 
 */
public class LazyImageConverter extends ElementConverter {

	/**
	 * Timeout time after that an image in the cache is considered old and then is reloaded in case something is changed
	 * (maybe the user has changed an image with another one with the same name). A value of -1 means that the automatic 
	 * refresh is disabled. It is disabled by default because it could have a big overhead when using many images
	 */
	public static long imageRefreshTime = -1;

	/**
	 * 
	 * Class to keep in the map an image and the time when it was saved, so it is easy to check if it is old. In this way
	 * when who has done the request see that the element is old then he can update it with a newer one. This structure is
	 * preferred to the CacheMap because there when the timeout expire the old element is removed and even if there is a
	 * new one there will be a time between the delete and the load of the new one where the image return to the default
	 * "no image" one. With this the old remains until it is replaced, so the transition is smother.
	 * 
	 * @author Orlandin Marco
	 * 
	 */
	private class TimedCache {

		/**
		 * The time when the entry is put inside the map
		 */
		private long newtime = System.currentTimeMillis();

		/**
		 * The timeout time for the entry
		 */
		private long timeout = imageRefreshTime;

		/**
		 * The item handled
		 */
		private Renderable image;

		@SuppressWarnings("unused")
		public TimedCache(Renderable image) {
			this.image = image;
		}

		/**
		 * Create a new instance of the class without item set
		 */
		public TimedCache() {
			this.image = null;
		}

		/**
		 * Update the current item and the time when it was added
		 * 
		 * @param image
		 *          the new item
		 */
		public void update(Renderable image) {
			this.image = image;
			newtime = System.currentTimeMillis();
		}

		/**
		 * Return the current item
		 * 
		 * @return the current item, could be null
		 */
		public Renderable getImage() {
			return image;
		}

		/**
		 * Return true if the actual item is expired. An item is expired when it is undefined or when its the actual time -
		 * its creation time is greater than the timeout
		 * 
		 * @return true if the element is expired, false otherwise
		 */
		public boolean isExpired() {
			long actualTime = System.currentTimeMillis();
			return (image == null || (((actualTime - newtime) > timeout) && timeout != -1));
		}

	}

	/**
	 * the standard printable element when the image is not found, keep static to avoid to reload it after the first time
	 * it is needed
	 */
	private static Renderable noImage;

	/**
	 * Cache where the actually loaded images are saved. The Key is composed by context + expression and the value is a
	 * timed cache that will contains the real image and the methods to know if it is expired
	 */
	private HashMap<KeyValue<JasperReportsContext, String>, TimedCache> imgCache = new HashMap<KeyValue<JasperReportsContext, String>, TimedCache>();

	/**
	 * Pending request for a specific resource, the key is the pair of {@link JasperReportsConfiguration} and the expression of the resource,
	 * this information are an unique identification of the resource. The value is a set of the element that are awaiting for this resource. 
	 * Using this structure allow to queue multiple request from many elements for the same resource, and refresh them all when the resource is
	 * available
	 */
	private HashMap<KeyValue<JasperReportsContext, String>, HashSet<MGraphicElement>> pendingRequests = new HashMap<KeyValue<JasperReportsContext,String>, HashSet<MGraphicElement>>();

	/**
	 * The class can not be build from the outside, so only this instance can be used to request and create the images
	 */
	private final static LazyImageConverter INSTANCE = new LazyImageConverter();

	/**
	 * The constructor can not be used from outside, to use this class call the getInstance() static method
	 */
	protected LazyImageConverter() {
	}

	/**
	 * Return an instance of the class to resolve and get images
	 */
	public static LazyImageConverter getInstance() {
		return INSTANCE;
	}

	/**
	 * The default convert does nothing in this class because this is think to work with the model, instead that with the
	 * jrelement.
	 */
	@Override
	public JRPrintElement convert(ReportConverter reportConverter, JRElement element) {
		return null;
	}

	/**
	 * Return the content for an MImage element
	 * 
	 * @param reportConverter
	 *          the report converter
	 * @param element
	 *          a not null MImage element
	 * @return An image pointed by the expression of the element if it can be found, the standard not found image
	 *         otherwise. it is never null
	 */
	public JRPrintElement convertImage(ReportConverter reportConverter, MGraphicElement element) {
		JRImage image = (JRImage) element.getValue();
		JRBasePrintImage printImage = new JRBasePrintImage(reportConverter.getDefaultStyleProvider());
		Renderable cacheRenderer = getRenderable(reportConverter, image, element);
		copyGraphicElement(reportConverter, image, printImage);

		printImage.copyBox(image.getLineBox());

		printImage.setAnchorName(JRExpressionUtil.getExpressionText(image.getAnchorNameExpression()));
		printImage.setBookmarkLevel(image.getBookmarkLevel());
		printImage.setHorizontalImageAlign(image.getOwnHorizontalImageAlign());
		printImage.setLinkType(image.getLinkType());
		printImage.setOnErrorType(OnErrorTypeEnum.ICON);
		printImage.setVerticalImageAlign(image.getOwnVerticalImageAlign());
		// If it is null load the no image found element
		if (cacheRenderer == null)
			cacheRenderer = getRenderableNoImage(reportConverter.getJasperReportsContext(), image, printImage);
		printImage.setRenderer(cacheRenderer);
		printImage.setScaleImage(image.getOwnScaleImageValue());

		return printImage;
	}

	/**
	 * Extract the requested image from the cache if it is available. If it is available is returned (even if it is
	 * expired). If it is expired is returned but a refresh job is started. Otherwise, if it is unavailable is returned
	 * null but a refresh job to try to get the image is started
	 * 
	 * @param reportConverter
	 *          the report converter
	 * @param image
	 *          the image element
	 * @param modelElement
	 *          the model that encapsulate the image
	 * @return the image to display if it is cached (expired or not), null otherwise
	 */
	private Renderable getRenderable(ReportConverter reportConverter, JRImage image, MGraphicElement modelElement) {
		JasperReportsContext jrContext = reportConverter.getJasperReportsContext();
		JRExpression expr = image.getExpression();
		KeyValue<JasperReportsContext, String> key = new KeyValue<JasperReportsContext, String>(jrContext,
				expr != null ? expr.getText() : "");
		TimedCache imageInfo = imgCache.get(key);

		// Check if the image was cached
		if (imageInfo == null) {
			imageInfo = new TimedCache();
			imgCache.put(key, imageInfo);
		}

		// If the image is expired (it is also expired when is empty, the refresh thread is started)
		if (imageInfo.isExpired())
			refreshImageInfo(imageInfo, modelElement, expr, jrContext, key);

		return imageInfo.getImage();

	}

	/**
	 * Interpret the expression of an element. If the element uses the main dataset then uses the standard evaluation
	 * function (that provides a caching functins) otherwise create a simple interpreter to evaluate the expression. If
	 * that interpreter can not evaluate the expression a more complex one is taken
	 * 
	 * @param jConf
	 *          the configuration of the report
	 * @param modelElement
	 *          the element that contains the expression
	 * @param expr
	 *          the expression
	 * @return the value of the expression or null if it can not be evaluated
	 */
	private String evaluatedExpression(JasperReportsConfiguration jConf, MGraphicElement modelElement,
			JRExpression expr) {
		JRDesignDataset jrd = ModelUtils.getFirstDatasetInHierarchy(modelElement);
		return ExpressionUtil.cachedExpressionEvaluationString(expr, jConf, jrd);
	}

	/**
	 * Start the thread to refresh a specific image. when the thread has cached a new image then the model and the editor
	 * are notified to ask a refresh. Multiple request for the same resource are queued until the resource is resolved and 
	 * notifed at the same time
	 * 
	 * @param info
	 *          The timed container of the image requested (where it will be placed)
	 * @param modelElement
	 *          the model of the element where the image will be placed
	 * @param expr
	 *          the expression to get the image
	 * @param jrContext
	 *          the context to get the image
	 * @param key
	 *          the key of the image in the cache map.
	 */
	private void refreshImageInfo(TimedCache info, MGraphicElement modelElement, JRExpression expr, JasperReportsContext jrContext, KeyValue<JasperReportsContext, String> key) {
		HashSet<MGraphicElement> resourceRequest = pendingRequests.get(key);
		if (resourceRequest == null){
			resourceRequest = new HashSet<MGraphicElement>();
			pendingRequests.put(key, resourceRequest);
		}
		synchronized (resourceRequest) {
			if (resourceRequest.isEmpty()) {
				//there are not request for this resource, create one
				resourceRequest.add(modelElement);
				startLoadingJob(info, modelElement, expr, jrContext, key);
			} else {
				//there are already request for this resource, queue for the notification
				resourceRequest.add(modelElement);
			}
		}
	}
	
	/**
	 * Start the thread to refresh a specific image. The search of the image will be done in background
	 * 
	 * @param info
	 *          The timed container of the image requested (where it will be placed)
	 * @param modelElement
	 *          the model of the element where the image will be placed
	 * @param expr
	 *          the expression to get the image
	 * @param jrContext
	 *          the context to get the image
	 * @param key
	 *          the key of the image in the cache map.
	 */
	private void startLoadingJob(final TimedCache info, final MGraphicElement modelElement, final JRExpression expr, final JasperReportsContext jrContext, final KeyValue<JasperReportsContext, String> key){
		Job job = new Job("load image") {
			protected IStatus run(IProgressMonitor monitor) {
				try {
					String location = evaluatedExpression((JasperReportsConfiguration) jrContext, modelElement, expr);
					if (location != null) {
						Renderable r = RendererUtil.getInstance(jrContext).getNonLazyRenderable(location, OnErrorTypeEnum.ERROR);
						info.update(r);
						refreshElements(key);
					}
				} catch (Throwable e) {
					e.printStackTrace();
				}
				return Status.OK_STATUS;
			}
		};
		job.setSystem(true);
		job.setPriority(Job.SHORT);
		job.schedule();
	}
	
	/**
	 * Refresh all the elements that are awaiting for a resource to be loaded.
	 * This is called when the resource is loaded and trigger a repaint of the elements
	 * 
	 * @param key the key of the loaded resource
	 */
	protected void refreshElements(KeyValue<JasperReportsContext, String> key){
		HashSet<MGraphicElement> resourceRequest = pendingRequests.get(key);
		synchronized (resourceRequest) {
			if (resourceRequest != null){
				for(final MGraphicElement refreshElement : resourceRequest){
					// The editor refresh must be executed inside the graphic threads
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							//PropertyChangeEvent event = new PropertyChangeEvent(refreshElement.getValue(), JRDesignImage.PROPERTY_EXPRESSION, null, null);
							//refreshElement.setChangedProperty(true);
							//AMultiEditor.refreshElement(refreshElement.getJasperConfiguration(), event);
							refreshElement.setChangedProperty(true);
							refreshElement.getValue().getEventSupport().firePropertyChange(MGraphicElement.FORCE_GRAPHICAL_REFRESH, null, null);
						}
					});
				}
				resourceRequest.clear();
			}
		}
	}

	/**
	 * Return the standard printable element when the image is not found
	 * 
	 * @param jasperReportsContext
	 *          the context
	 * @param imageElement
	 *          the actual element
	 * @param printImage
	 *          the print image
	 * @return return the not printable element
	 */
	private Renderable getRenderableNoImage(JasperReportsContext jasperReportsContext, JRImage imageElement,
			JRPrintImage printImage) {
		try {
			printImage.setScaleImage(ScaleImageEnum.CLIP);
			if (noImage == null)
				noImage = RendererUtil.getInstance(jasperReportsContext).getNonLazyRenderable(JRImageLoader.NO_IMAGE_RESOURCE,
						imageElement.getOnErrorTypeValue());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return noImage;
	}
	
	/**
	 * Remove all the cached images requested by a single report
	 * 
	 * @param jConfig the {@link JasperReportsConfiguration} of the report, must be not null
	 */
	public void removeCachedImages(JasperReportsConfiguration jConfig){
		for(KeyValue<JasperReportsContext, String> key : new ArrayList<KeyValue<JasperReportsContext, String>>(imgCache.keySet())){
			if (key.key == jConfig){
				imgCache.remove(key);
			}
		}
	}
	
	/**
	 * Remove the cached information of a single image 
	 * 
	 * @param jConfig the {@link JasperReportsConfiguration} of the report where the image is used
	 * @param image the image element with the expression pointing to the image we want to remove from the ache
	 */
	public void removeCachedImage(JasperReportsConfiguration jConfig, JRImage image){
		JRExpression expr = image.getExpression();
		KeyValue<JasperReportsContext, String> key = new KeyValue<JasperReportsContext, String>(jConfig, expr != null ? expr.getText() : "");
		imgCache.remove(key);
	}

}
