package com.jaspersoft.studio.editor.jrexpressions.ui.support;

import net.sf.jasperreports.expressions.annotations.JRExprFunctionBean;
import net.sf.jasperreports.expressions.annotations.JRExprFunctionParameterBean;

import org.eclipse.core.runtime.Assert;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.jaspersoft.studio.editor.jrexpressions.ui.JRExpressionsActivator;
import com.jaspersoft.studio.utils.Misc;
import com.jaspersoft.studio.utils.ResourceManager;
import com.jaspersoft.studio.utils.UIUtils;

/**
 * Details panel composite for a specific function ({@link JRExprFunctionBean}).
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 * @see ObjectCategoryDetailsPanel
 *
 */
public class FunctionDetailsComposite extends Composite {
	
	private JRExprFunctionBean function;	// the function 
	private ScrolledComposite contentArea;	// the composite containing the parameters
	private EditingAreaHelper editingAreaInfo;	// support information on the editing area

	/**
	 * Creates the function details composite.
	 * 
	 * @param parent a widget which will be the parent of the new instance (cannot be null)
	 * @param the style of widget to construct 
	 * @param function the selected function
	 */
	public FunctionDetailsComposite(Composite parent, int style, JRExprFunctionBean function) {
		super(parent, style);
		Assert.isNotNull(function);
		this.function=function;
		
		final GridLayout gl = new GridLayout(1,false);
		gl.marginHeight=0;
		gl.verticalSpacing=5;
		this.setLayout(gl);
		
		createTitleArea(this);
		createReturnTypeArea(this);
		createContentArea(this,true);
	}

	/*
	 * Creates the title area of the composite.
	 */
	private void createTitleArea(Composite parent) {
		Label functionName=new Label(parent, SWT.NONE);
		functionName.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false));
		functionName.setText(function.getDisplayName());
		FontData fd=functionName.getFont().getFontData()[0];
		functionName.setFont(ResourceManager.getFont(fd.getName(), (int) fd.height+2, fd.getStyle() | SWT.BOLD));
		
		Label functionDescription=new Label(parent,SWT.WRAP);
		functionDescription.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false));
		functionDescription.setText(function.getDescription());
		
		Label separator=new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		final GridData sepGD = new GridData(SWT.FILL, SWT.TOP, true, false,2,1);
		separator.setLayoutData(sepGD);
	}

	/*
	 * Creates the return type area of the composite.
	 */
	private void createReturnTypeArea(Composite parent) {
		Label returnTypeText=new Label(parent, SWT.WRAP);
		returnTypeText.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false));
		returnTypeText.setText("This function returns an object of type:");
		
		Label returnType=new Label(parent,SWT.NONE);
		returnType.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false));
		returnType.setText(function.getReturnType().getCanonicalName());
		returnType.setFont(ResourceManager.getBoldFont(returnType.getFont()));
		
		Label separator=new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
	}

	/*
	 * Creates the content area of the composite with all the 
	 * widgets to represent the function arguments.
	 */
	private void createContentArea(Composite parent, boolean hidden) {
		contentArea=new ScrolledComposite(parent,SWT.V_SCROLL | SWT.H_SCROLL);
		contentArea.setLayout(new FillLayout());
		Composite childCmp=new Composite(contentArea,SWT.NONE);
		GridLayout gl=new GridLayout(3,false);
		gl.marginWidth=0;
		gl.horizontalSpacing=5;
		gl.verticalSpacing=10;
		childCmp.setLayout(gl);
		final GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		contentArea.setLayoutData(gd);

		int paramIndex=0;
		for (JRExprFunctionParameterBean p : function.getParameters()){
			int numEl=p.isMulti()?10:1;
			for(int i=1;i<=numEl;i++){
				paramIndex++;
				CLabel paramLbl=new CLabel(childCmp, SWT.NONE);
				paramLbl.setToolTipText(p.getDescription());
				paramLbl.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
				
				String paramLblText=p.getName();
				if(numEl>1){
					 paramLblText+=" " + i;
				}
				if (i==1 && !p.isOptional()){
					paramLblText+=" *";
				}
				paramLbl.setText(paramLblText);
				
				CLabel enterFunctionLbl=new CLabel(childCmp, SWT.NONE);
				enterFunctionLbl.setImage(ResourceManager.getPluginImage(JRExpressionsActivator.PLUGIN_ID, "/resources/icons/enterfunction.gif"));
				GridData enterFunctGD = new GridData(SWT.LEFT, SWT.CENTER, false, false);
				enterFunctGD.horizontalIndent=5;
				enterFunctionLbl.setLayoutData(enterFunctGD);
				enterFunctionLbl.setCursor(ResourceManager.getCursor(SWT.CURSOR_HAND));
				enterFunctionLbl.setToolTipText("Enter complex expression for the argument");
				
				final Text paramValue=new Text(childCmp,SWT.BORDER | SWT.BORDER_SOLID);
				paramValue.setData("PARAM_RELATIVE_POSITION", i);
				paramValue.setData("PARAM_INDEX",paramIndex);
				final GridData pValueGD = new GridData(SWT.LEFT, SWT.CENTER, true, false);
				pValueGD.widthHint=150;
				paramValue.setLayoutData(pValueGD);
				UIUtils.addSelectOnFocusToText(paramValue);
				paramValue.addFocusListener(new FocusListener() {
					@Override
					public void focusLost(FocusEvent e) {
					}
					@Override
					public void focusGained(FocusEvent e) {
						cleanEmptyParameters((Text)e.widget);
						editingAreaInfo.selectMethodArgument((Integer)e.widget.getData("PARAM_INDEX"));
					}
				});
				paramValue.addModifyListener(new ModifyListener() {
					@Override
					public void modifyText(ModifyEvent e) {
						if(editingAreaInfo.isUpdate()) return;
						editingAreaInfo.setUpdate(true);
						editingAreaInfo.insertAtCurrentLocation(((Text)e.widget).getText(), true);
						editingAreaInfo.setUpdate(false);
					}
				});
				
				enterFunctionLbl.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseUp(MouseEvent e) {
						
					}
					
					@Override
					public void mouseDown(MouseEvent e) {
						ObjectCategorySelectionEvent selectionEvent = new ObjectCategorySelectionEvent(e.widget);
						paramValue.setFocus();
						showParametersPanel(false);
						editingAreaInfo.notifyCategorySelection(selectionEvent);
					}
					
					@Override
					public void mouseDoubleClick(MouseEvent e) {
						
					}
				});

			}
		}
		contentArea.setContent(childCmp);
		childCmp.setSize(childCmp.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		contentArea.setVisible(!hidden);
		contentArea.setEnabled(!hidden);
		gd.exclude=hidden;
	}

	/**
	 * Toggles the visualization of the content area containing the 
	 * widgets related to the function arguments (parameters).
	 * 
	 * @param show <code>true</code> to show the panel, <code>false</code> to hide it
	 */
	public void showParametersPanel(boolean show) {
		contentArea.setVisible(show);
		contentArea.setEnabled(show);
		((GridData)contentArea.getLayoutData()).exclude=!show;
		contentArea.getParent().layout();
		if(show) loadFunctionParameters();
	}

	/*
	 * Populate the content of the function details area with
	 * the values of the arguments.
	 * 
	 * NOTE: strictly depending on the Composite layout.
	 * Now for each possible parameter there are a label
	 * and a corresponding text widget.
	 */
	private void loadFunctionParameters() {
		if(editingAreaInfo.isUpdate()) return;
		editingAreaInfo.setUpdate(true);
		Control[] children = ((Composite)contentArea.getChildren()[0]).getChildren();
		for(int i=0;i<children.length;i++){
			// Consider only the text widgets
			if(i%3==2){
				((Text)children[i]).setText(Misc.nvl(editingAreaInfo.getTextForArgument((i+1)/3)).trim());
			}
		}
		editingAreaInfo.setUpdate(false);
	}
	
	/*
	 * Forces the cleaning of (useless) empty parameters
	 * in the editing area.
	 */
	private void cleanEmptyParameters(Text widget){
		editingAreaInfo.setUpdate(true);
		Integer currentParamIndex=(Integer) widget.getData("PARAM_INDEX");
		Integer lastNonEmptyParam=0;
		Control[] children = widget.getParent().getChildren();
		for(int i=0;i<children.length;i++){
			// Consider only the text widgets and find
			// the last parameter with a (non-empty) text value
			if(i%3==2){
				if(!((Text)children[i]).getText().trim().isEmpty()){
					lastNonEmptyParam=(Integer)children[i].getData("PARAM_INDEX");
				}
			}				
		}

		editingAreaInfo.removeUselessParameters(Math.max(currentParamIndex,lastNonEmptyParam));
		editingAreaInfo.setUpdate(false);
	}

	@Override
	public void setVisible(boolean visible) {
		if(!visible){
			// The parameters panel is made visible only
			// after a double-click on the specific function
			// So we need to force the hiding when necessary
			showParametersPanel(false);
		}
		super.setVisible(visible);
	}
	
	/**
	 * Sets the helper reference to the editing area.
	 * 
	 * @param editingAreaInfo helper reference
	 */
	public void setEditingAreaInfo(EditingAreaHelper editingAreaInfo) {
		this.editingAreaInfo=editingAreaInfo;
	}

}
