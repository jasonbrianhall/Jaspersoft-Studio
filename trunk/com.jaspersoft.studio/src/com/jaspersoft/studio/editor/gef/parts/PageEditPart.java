/*
 * Jaspersoft Open Studio - Eclipse-based JasperReports Designer. Copyright (C) 2005 - 2010 Jaspersoft Corporation. All
 * rights reserved. http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of Jaspersoft Open Studio.
 * 
 * Jaspersoft Open Studio is free software: you can redistribute it and/or modify it under the terms of the GNU Affero
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * Jaspersoft Open Studio is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License
 * for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License along with Jaspersoft Open Studio. If not,
 * see <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.editor.gef.parts;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRBand;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.type.BandTypeEnum;

import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.SnapFeedbackPolicy;
import org.eclipse.jface.util.IPropertyChangeListener;

import com.jaspersoft.studio.JaspersoftStudioPlugin;
import com.jaspersoft.studio.editor.gef.figures.PageFigure;
import com.jaspersoft.studio.editor.gef.figures.borders.ShadowBorder;
import com.jaspersoft.studio.editor.gef.figures.borders.SimpleShadowBorder;
import com.jaspersoft.studio.editor.gef.parts.band.BandEditPart;
import com.jaspersoft.studio.editor.gef.parts.editPolicy.PageLayoutEditPolicy;
import com.jaspersoft.studio.model.IGraphicElement;
import com.jaspersoft.studio.model.INode;
import com.jaspersoft.studio.model.MElementGroup;
import com.jaspersoft.studio.model.MFrame;
import com.jaspersoft.studio.model.MReport;
import com.jaspersoft.studio.model.MRoot;
import com.jaspersoft.studio.model.band.MBand;
import com.jaspersoft.studio.preferences.PreferenceConstants;
import com.jaspersoft.studio.utils.ModelUtils;

// TODO: Auto-generated Javadoc
/**
 * The Class PageEditPart.
 * 
 * @author Chicu Veaceslav
 */
public class PageEditPart extends AJDEditPart implements PropertyChangeListener {
	private PreferenceListener preferenceListener;

	private final class PreferenceListener implements IPropertyChangeListener {
		@Override
		public void propertyChange(org.eclipse.jface.util.PropertyChangeEvent event) {
			if (event.getProperty().equals(PreferenceConstants.P_PAGE_DESIGN_BORDER_STYLE))
				setPrefsBorder(getFigure());
		}
	}

	@Override
	public void activate() {
		super.activate();
		preferenceListener = new PreferenceListener();
		JaspersoftStudioPlugin.getDefault().getPreferenceStore().addPropertyChangeListener(preferenceListener);
	}

	@Override
	public void deactivate() {
		JaspersoftStudioPlugin.getDefault().getPreferenceStore().removePropertyChangeListener(preferenceListener);
		super.deactivate();
	}

	private void setPrefsBorder(IFigure rect) {
		String pref = Platform.getPreferencesService().getString(JaspersoftStudioPlugin.getUniqueIdentifier(),
				PreferenceConstants.P_PAGE_DESIGN_BORDER_STYLE, "shadow", null);

		if (pref.equals("shadow"))
			rect.setBorder(new ShadowBorder());
		else
			rect.setBorder(new SimpleShadowBorder());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#getModel()
	 */
	@Override
	public Object getModel() {
		Object model = super.getModel();
		if (model instanceof MRoot)
			return (MReport) ((MRoot) model).getChildren().get(0);
		return model;
	}

	/**
	 * Gets the page.
	 * 
	 * @return the page
	 */
	public MReport getPage() {
		return (MReport) getModel();
	}

	/**
	 * Gets the jasper design.
	 * 
	 * @return the jasper design
	 */
	public JasperDesign getJasperDesign() {
		return (JasperDesign) getPage().getValue();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
	 */
	protected IFigure createFigure() {
		JasperDesign jd = getJasperDesign();
		PageFigure figure = new PageFigure(jd, true);
		setPrefsBorder(figure);
		setupPageFigure(jd, figure);
		// get current display...
		figure.setOpaque(false);
		figure.setBackgroundColor(ColorConstants.white);
		figure.setLayoutManager(new XYLayout());

		// figure.add(gridLayer);

		return figure;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
	 */
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new PageLayoutEditPolicy());
		installEditPolicy("Snap Feedback", new SnapFeedbackPolicy());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#getDragTracker(org.eclipse.gef.Request)
	 */
	@Override
	public DragTracker getDragTracker(Request request) {
		return getRoot().getDragTracker(request);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#getModelChildren()
	 */
	protected List<Object> getModelChildren() {
		List<Object> list = new ArrayList<Object>();
		List<Object> sList = new ArrayList<Object>();
		// put bands first

		for (INode node : getPage().getChildren()) {
			if (node instanceof IGraphicElement && node.getValue() != null) {
				if (node instanceof MBand) {
					MBand band = (MBand) node;
					if (!(band.getBandType().equals(BandTypeEnum.BACKGROUND) || band.getBandType().equals(BandTypeEnum.NO_DATA))) {
						list.add(band);
						getNodeChildren(node, sList);
					}
					continue;
				}
				sList.add(node);
			}
		}
		list.addAll(sList);
		return list;
	}

	/**
	 * Gets the node children.
	 * 
	 * @param node
	 *          the node
	 * @param list
	 *          the list
	 * @return the node children
	 */
	private void getNodeChildren(INode node, List<Object> list) {
		for (INode nod : node.getChildren()) {
			if (nod instanceof IGraphicElement)
				list.add(nod);
			getNodeChildren(nod, list);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#addChildVisual(org.eclipse.gef.EditPart, int)
	 */
	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (childEditPart instanceof BandEditPart) {
			IFigure layer = getLayer(MainDesignerRootEditPart.SECTIONS_LAYER);
			if (layer != null) {
				layer.add(((BandEditPart) childEditPart).getFigure());
			}
		} else if (childEditPart instanceof FigureEditPart) {
			IFigure layer = getLayer(MainDesignerRootEditPart.ELEMENTS_LAYER);
			if (layer != null) {
				layer.add(((FigureEditPart) childEditPart).getFigure());
			}
		}
		super.addChildVisual(childEditPart, index);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
	 */
	public void refreshVisuals() {
		JasperDesign jasperDesign = getJasperDesign();
		PageFigure figure2 = (PageFigure) getFigure();

		setupPageFigure(jasperDesign, figure2);
		for (Object i : getChildren()) {
			if (i instanceof EditPart)
				((EditPart) i).refresh();
		}
		/*
		 * ((GridLayout) figure2.getLayoutManager()).marginHeight = jasperDesign.getTopMargin();
		 * figure2.getLayoutManager().layout(figure2);
		 */
		figure2.repaint();
	}

	/**
	 * Setup page figure.
	 * 
	 * @param jasperDesign
	 *          the jasper design
	 * @param figure2
	 *          the figure2
	 */
	private void setupPageFigure(JasperDesign jasperDesign, PageFigure figure2) {
		List<JRBand> bands = ModelUtils.getAllBands(jasperDesign);
		int designHeight = ModelUtils.getDesignHeight(bands);

		int w = jasperDesign.getPageWidth() + 1000;
		int h = designHeight + 1000;

		figure2.setBandNumber(bands.size());
		figure2.setBandsHeight(designHeight);
		figure2.setSize(w, h);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
	 */
	public void propertyChange(PropertyChangeEvent arg0) {
		Object source = arg0.getSource();
		if (source instanceof MBand || source instanceof MReport || source instanceof MFrame
				|| source instanceof MElementGroup) {
			refreshChildren();
			refreshVisuals();
		}
	}

}
