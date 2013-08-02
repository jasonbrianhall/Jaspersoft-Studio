/*******************************************************************************
 * Copyright (C) 2010 - 2013 Jaspersoft Corporation. All rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jaspersoft Studio Team - initial API and implementation
 ******************************************************************************/

package com.jaspersoft.studio.jasper;

import net.sf.jasperreports.engine.JRElement;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRImage;
import net.sf.jasperreports.engine.JRPrintElement;
import net.sf.jasperreports.engine.JRPrintImage;
import net.sf.jasperreports.engine.JasperReportsContext;
import net.sf.jasperreports.engine.Renderable;
import net.sf.jasperreports.engine.RenderableUtil;
import net.sf.jasperreports.engine.base.JRBasePrintImage;
import net.sf.jasperreports.engine.convert.ElementConverter;
import net.sf.jasperreports.engine.convert.ReportConverter;
import net.sf.jasperreports.engine.type.OnErrorTypeEnum;
import net.sf.jasperreports.engine.type.ScaleImageEnum;
import net.sf.jasperreports.engine.util.JRExpressionUtil;
import net.sf.jasperreports.engine.util.JRImageLoader;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.widgets.Display;

import com.jaspersoft.studio.editor.AMultiEditor;
import com.jaspersoft.studio.model.util.KeyValue;
import com.jaspersoft.studio.utils.CacheMap;
import com.jaspersoft.studio.utils.ExpressionUtil;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id: ImageConverter.java 5878 2013-01-07 20:23:13Z teodord $
 */
public final class ImageConverter extends ElementConverter {
	private static final Log log = LogFactory.getLog(ImageConverter.class);

	/**
	 *
	 */
	private final static ImageConverter INSTANCE = new ImageConverter();

	/**
	 *
	 */
	private ImageConverter() {
	}

	/**
	 *
	 */
	public static ImageConverter getInstance() {
		return INSTANCE;
	}

	private CacheMap<JRElement, Renderable> cache = new CacheMap<JRElement, Renderable>(3000000);
	private CacheMap<JRElement, KeyValue<String, Long>> running = new CacheMap<JRElement, KeyValue<String, Long>>(3000);

	/**
	 *
	 */
	public JRPrintElement convert(final ReportConverter reportConverter, final JRElement element) {
		final JRImage image = (JRImage) element;
		final JRBasePrintImage printImage = new JRBasePrintImage(reportConverter.getDefaultStyleProvider());
		Renderable cacheRenderer = cache.get(element);
		if (image.getExpression() != null) {
			String expr = image.getExpression().getText();
			KeyValue<String, Long> last = running.get(element);
			if (cacheRenderer == null || last == null || !last.key.equals(expr)
					|| (last.value != null && System.currentTimeMillis() - last.value.longValue() > 1000)) {
				final KeyValue<String, Long> kv = new KeyValue<String, Long>(expr, null);
				Job job = new Job("load image") {
					protected IStatus run(IProgressMonitor monitor) {
						final JasperReportsContext jrContext = reportConverter.getJasperReportsContext();
						final Renderable r = getRenderable(jrContext, image, printImage);
						Display.getDefault().asyncExec(new Runnable() {

							@Override
							public void run() {
								cache.put(element, r);
								kv.value = System.currentTimeMillis();
								AMultiEditor.refresh(jrContext);
							}

						});
						return Status.OK_STATUS;
					}
				};
				job.setSystem(true);
				job.setPriority(Job.SHORT);
				job.schedule();
				running.put(element, kv);
			}
		} else {
			KeyValue<String, Long> last = running.get(element);
			if (last != null && last.key != null) {
				cacheRenderer = getRenderableNoImage(reportConverter.getJasperReportsContext(), image, printImage);
				cache.put(element, cacheRenderer);
				last.key = null;
			}
		}
		copyGraphicElement(reportConverter, image, printImage);

		printImage.copyBox(image.getLineBox());

		printImage.setAnchorName(JRExpressionUtil.getExpressionText(image.getAnchorNameExpression()));
		printImage.setBookmarkLevel(image.getBookmarkLevel());
		printImage.setHorizontalAlignment(image.getOwnHorizontalAlignmentValue());
		printImage.setLazy(image.isLazy());
		printImage.setLinkType(image.getLinkType());
		printImage.setOnErrorType(OnErrorTypeEnum.ICON);
		printImage.setVerticalAlignment(image.getOwnVerticalAlignmentValue());
		if (cacheRenderer == null)
			cacheRenderer = getRenderableNoImage(reportConverter.getJasperReportsContext(), image, printImage);
		printImage.setRenderable(cacheRenderer);
		printImage.setScaleImage(image.getOwnScaleImageValue());

		return printImage;
	}

	/**
	 * 
	 */
	private Renderable getRenderable(JasperReportsContext jasperReportsContext, JRImage imageElement,
			JRPrintImage printImage) {
		Renderable r = null;
		String location = ExpressionUtil.eval(imageElement.getExpression(),
				(JasperReportsConfiguration) jasperReportsContext);
		// JRExpressionUtil.getSimpleExpressionText(imageElement.getExpression());
		if (location != null) {
			try {
				r = RenderableUtil.getInstance(jasperReportsContext).getRenderable(location, OnErrorTypeEnum.ERROR, false);
			} catch (JRException e) {
				if (log.isDebugEnabled())
					log.debug("Creating location renderer for converted image failed.", e);
			}
		}
		if (r == null)
			r = getRenderableNoImage(jasperReportsContext, imageElement, printImage);
		return r;
	}

	private Renderable getRenderableNoImage(JasperReportsContext jasperReportsContext, JRImage imageElement,
			JRPrintImage printImage) {
		Renderable r = null;
		try {
			printImage.setScaleImage(ScaleImageEnum.CLIP);
			r = RenderableUtil.getInstance(jasperReportsContext).getRenderable(JRImageLoader.NO_IMAGE_RESOURCE,
					imageElement.getOnErrorTypeValue(), false);
		} catch (Exception e) {
			if (log.isDebugEnabled())
				log.debug("Creating icon renderer for converted image failed.", e);
		}
		return r;
	}

}
