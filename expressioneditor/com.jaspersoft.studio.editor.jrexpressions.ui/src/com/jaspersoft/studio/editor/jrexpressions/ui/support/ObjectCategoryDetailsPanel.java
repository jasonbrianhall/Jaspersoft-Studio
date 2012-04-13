package com.jaspersoft.studio.editor.jrexpressions.ui.support;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.crosstabs.JRCrosstabColumnGroup;
import net.sf.jasperreports.crosstabs.JRCrosstabMeasure;
import net.sf.jasperreports.crosstabs.JRCrosstabParameter;
import net.sf.jasperreports.crosstabs.JRCrosstabRowGroup;
import net.sf.jasperreports.crosstabs.design.JRDesignCrosstab;
import net.sf.jasperreports.crosstabs.design.JRDesignCrosstabColumnGroup;
import net.sf.jasperreports.crosstabs.design.JRDesignCrosstabMeasure;
import net.sf.jasperreports.crosstabs.design.JRDesignCrosstabParameter;
import net.sf.jasperreports.crosstabs.design.JRDesignCrosstabRowGroup;
import net.sf.jasperreports.engine.JRField;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JRVariable;
import net.sf.jasperreports.expressions.annotations.JRExprFunctionBean;
import net.sf.jasperreports.expressions.functions.util.FunctionsLibraryUtil;

import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.swt.widgets.TreeItem;

import com.jaspersoft.studio.editor.expression.CrosstabTotalVariable;
import com.jaspersoft.studio.editor.expression.ExpObject;
import com.jaspersoft.studio.editor.expression.ExpressionContext;
import com.jaspersoft.studio.editor.jrexpressions.ui.internal.JavaJRExpressionActivator;
import com.jaspersoft.studio.editor.jrexpressions.ui.support.ObjectCategoryItem.Category;
import com.jaspersoft.studio.utils.ResourceManager;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

/**
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 *
 */
public class ObjectCategoryDetailsPanel extends Composite {

	private TreeViewer categoryContent;
	private Composite additionalDetailsCmp;
	private StackLayout additionalDetailsStackLayout;
	private ExpressionContext exprContext;
	private Map<String, Control> additionalDetailControls=new HashMap<String, Control>();
	private ToolItem hideBuiltinParams;
	private ToolItem hideBuiltinVariables;
	private boolean showBuiltinParams=true;
	private boolean showBuiltinVars=true;
	private ObjectCategoryItem selItem;
	private List<Object> categoryDetails;
	
	private boolean functionMode=false;
	private EditingAreaHelper editingAreaInfo;

	public ObjectCategoryDetailsPanel(Composite parent, int style) {
		super(parent, style);
		GridLayout layout = new GridLayout(1,true);
		layout.marginWidth=0;
		layout.marginHeight=0;
		this.setLayout(layout);
		SashForm sashForm=new SashForm(this, SWT.HORIZONTAL);
		final GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
		layoutData.widthHint=600;
		sashForm.setLayoutData(layoutData);
		
		Composite categoryContentCmp=new Composite(sashForm, SWT.NONE);
		final GridLayout layout2 = new GridLayout(1,false);
		layout2.marginWidth=5;
		layout2.marginHeight=0;
		categoryContentCmp.setLayout(layout2);
		categoryContent=new TreeViewer(categoryContentCmp, SWT.BORDER);
		categoryContent.getTree().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		categoryContent.setLabelProvider(new ObjectItemStyledLabelProvider());
		categoryContent.setContentProvider(new TreeArrayContentProvider());
		categoryContent.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				Object selItem = ((IStructuredSelection)event.getSelection()).getFirstElement();
				if(selItem!=null){
					refreshAdditionalDetailsUI(selItem);
					if(functionMode && !editingAreaInfo.isUpdate()){
						showFunctionDetailsPanel();
						functionMode=false;
					}
				}
			}

		});
		categoryContent.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				Object selObject=((IStructuredSelection)categoryContent.getSelection()).getFirstElement();
				if(selObject instanceof ExpObject){
					// Parameters, Variables, Fields
					editingAreaInfo.insertAtCurrentLocation(((ExpObject) selObject).getExpression(),false);
				}
				else if (selObject instanceof JRExprFunctionBean){
					// Functions
					editingAreaInfo.insertAtCurrentLocation(((JRExprFunctionBean) selObject).getName()+"( )",true);
					showFunctionDetailsPanel();
				}
				else if (selObject instanceof String){
					// Recent or user defined expressions
					editingAreaInfo.insertAtCurrentLocation((String)selObject,false);
				}
			}
		});
		
		ToolBar buttonsToolbar=new ToolBar(categoryContentCmp, SWT.FLAT);
		hideBuiltinParams = new ToolItem(buttonsToolbar, SWT.NONE);
		hideBuiltinParams.setImage(
				ResourceManager.getPluginImage(JavaJRExpressionActivator.PLUGIN_ID, "/resources/icons/filter-parameters.png"));
		hideBuiltinParams.setEnabled(false);
		hideBuiltinParams.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showBuiltinParams=!showBuiltinParams;
				additionalDetailsStackLayout.topControl.setVisible(showBuiltinParams);
				refreshPanelUI(selItem);
			}
		});
		hideBuiltinVariables = new ToolItem(buttonsToolbar, SWT.NONE);
		hideBuiltinVariables.setImage(
				ResourceManager.getPluginImage(JavaJRExpressionActivator.PLUGIN_ID, "/resources/icons/filter-variables.png"));
		hideBuiltinVariables.setEnabled(false);
		hideBuiltinVariables.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showBuiltinVars=!showBuiltinVars;
				additionalDetailsStackLayout.topControl.setVisible(showBuiltinVars);
				refreshPanelUI(selItem);
			}
		});
		
		additionalDetailsCmp=new Composite(sashForm, SWT.NONE);
		additionalDetailsCmp.setLayoutData(layoutData);
		additionalDetailsStackLayout=new StackLayout();
		additionalDetailsCmp.setLayout(additionalDetailsStackLayout);
		
		sashForm.setWeights(new int[]{40,60});
	}

	public void refreshPanelUI(ObjectCategoryItem selItem) {
		this.selItem=selItem;
		// Update the list of category children
		categoryContent.getTree().clearAll(true);
		categoryDetails = new ArrayList<Object>();		
		switch (selItem.getCategory()) {
			case PARAMETERS:
				hideBuiltinParams.setEnabled(true);
	            Iterator<JRParameter> parameters = ((List<JRParameter>)selItem.getData()).iterator();
	            while (parameters.hasNext()) {
	                JRParameter parameter = (JRParameter) parameters.next();
	                if(!showBuiltinParams && parameter.isSystemDefined()){
	                	continue;
	                }
	                categoryDetails.add(new ExpObject(parameter));
	            }
				break;
			case VARIABLES:
				hideBuiltinVariables.setEnabled(true);
	            Iterator<JRVariable> variables = ((List<JRVariable>)selItem.getData()).iterator();
	            while (variables.hasNext()) {
	                JRVariable variable = (JRVariable) variables.next();
	                if(!showBuiltinVars && variable.isSystemDefined()){
	                	continue;
	                }
	                categoryDetails.add(new ExpObject(variable));
	            }
	            break;
			case FIELDS:
	            Iterator<JRField> fields = ((List<JRField>)selItem.getData()).iterator();
	            while (fields.hasNext()) {
	                ExpObject eo = new ExpObject(fields.next());
	                categoryDetails.add(eo);
	            }
	            break;
			case FUNCTION_CATEGORY:
				List<JRExprFunctionBean> categoryFunctions = FunctionsLibraryUtil.getFunctionsByCategory((String)selItem.getData());
				categoryDetails.addAll(categoryFunctions);
				break;
			case RECENT_EXPRESSIONS:
				// TODO - Gets the recent expressions (simple string)
				break;
			case USER_DEFINED_EXPRESSIONS:
				// TODO - Gets the user defined expressions (simple string)
				break;
			case CROSSTAB:
                JRDesignCrosstab crosstab = (JRDesignCrosstab) selItem.getData();
                List<JRCrosstabRowGroup> rowGroups = crosstab.getRowGroupsList();
                List<JRCrosstabColumnGroup> columnGroups = crosstab.getColumnGroupsList();

                Iterator<JRCrosstabMeasure> measures = crosstab.getMesuresList().iterator();
                while (measures.hasNext()) {
                    JRDesignCrosstabMeasure measure = (JRDesignCrosstabMeasure)measures.next();
                    categoryDetails.add(new ExpObject(measure.getVariable()));

                    for (int i=0; i<rowGroups.size(); ++i) {
                        JRDesignCrosstabRowGroup rowGroup = (JRDesignCrosstabRowGroup)rowGroups.get(i);
                        categoryDetails.add(new CrosstabTotalVariable(measure, rowGroup, null));

                        for (int j=0; j<columnGroups.size(); ++j) {
                            JRDesignCrosstabColumnGroup columnGroup = (JRDesignCrosstabColumnGroup)columnGroups.get(j);
                            if (j==0) {
                            	categoryDetails.add(new CrosstabTotalVariable(measure, null, columnGroup));
                            }
                            categoryDetails.add(new CrosstabTotalVariable(measure, rowGroup, columnGroup));
                        }
                    }
                }

                for (int i=0; i<rowGroups.size(); ++i) {
                    JRDesignCrosstabRowGroup rowGroup = (JRDesignCrosstabRowGroup)rowGroups.get(i);
                    categoryDetails.add(new ExpObject(rowGroup.getVariable()));
                }

                for (int i=0; i<columnGroups.size(); ++i) {
                    JRDesignCrosstabColumnGroup columnGroup = (JRDesignCrosstabColumnGroup)columnGroups.get(i);
                    categoryDetails.add(new ExpObject(columnGroup.getVariable()));
                }

                List<JRCrosstabParameter> crosstabParameters = crosstab.getParametersList();
                for (int i=0; i<crosstabParameters.size(); ++i) {
                    JRDesignCrosstabParameter parameter = (JRDesignCrosstabParameter)crosstabParameters.get(i);
                    categoryDetails.add(new ExpObject(parameter));
                }
				break;
			case BUILT_IN_FUNCTIONS:
				// Show all functions from all the categories
				List<JRExprFunctionBean> allFunctionsLst=FunctionsLibraryUtil.getAllFunctions();
				Collections.sort(allFunctionsLst);
				categoryDetails.addAll(allFunctionsLst);
				break;
		default:
			break;
		}
		
		categoryContent.setInput(categoryDetails.toArray());
		
		// We are inside a JRFunction
		if(selItem.getCategory()==Category.BUILT_IN_FUNCTIONS && 
				editingAreaInfo!=null && editingAreaInfo.getCurrentLibraryFunctionName()!=null){
			final String currFunctionName = editingAreaInfo.getCurrentLibraryFunctionName();
			for(TreeItem item : categoryContent.getTree().getItems()){
				JRExprFunctionBean function = (JRExprFunctionBean)item.getData();
				if(function.getName().equals(currFunctionName)){
					functionMode=true;
					categoryContent.setSelection(new StructuredSelection(item.getData()),true);
					break;
				}
			}
		}
		// Otherwise preselect the first one (if possible)
		else if(categoryContent.getTree().getItemCount()>0){
			TreeItem item = categoryContent.getTree().getItem(0);
			categoryContent.setSelection(new StructuredSelection(item.getData()),true);
		}
	}
	
	private void refreshAdditionalDetailsUI(Object selItem) {
		String key=getItemKey(selItem);
		Control currentControl = additionalDetailControls.get(key);
		if(currentControl==null){
			if(selItem instanceof ExpObject){
				// (Flat) TreeViewer
				Composite cmp=new Composite(additionalDetailsCmp, SWT.NONE);
				GridLayout gl=new GridLayout(1,true);
				gl.marginHeight=0;
				gl.marginWidth=0;
				cmp.setLayout(gl);
				final TreeViewer tv=new TreeViewer(cmp, SWT.BORDER | SWT.BORDER_SOLID);
				tv.getTree().setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
				currentControl=cmp;
				
				List<String> methodFirms = getExpObjectMethodFirms((ExpObject)selItem);
				tv.setContentProvider(new TreeArrayContentProvider());
				tv.setLabelProvider(new ObjectItemStyledLabelProvider());
				tv.setInput(methodFirms.toArray());
				
				tv.addDoubleClickListener(new IDoubleClickListener() {
					@Override
					public void doubleClick(DoubleClickEvent event) {
						Object selElement=((IStructuredSelection)tv.getSelection()).getFirstElement();
						Object categoryContentSel=((IStructuredSelection)categoryContent.getSelection()).getFirstElement();
						if(selElement instanceof String && categoryContentSel instanceof ExpObject){
							String detailStr=(String)selElement;
							editingAreaInfo.insertAtCurrentLocation(
									((ExpObject)categoryContentSel).getExpression() + "." +
									detailStr.substring(0,detailStr.lastIndexOf(')')+1),false);
						}
					}
				});
			}
			else if(selItem instanceof JRExprFunctionBean){
				FunctionDetailsComposite fdetails=new FunctionDetailsComposite(additionalDetailsCmp, SWT.NONE, (JRExprFunctionBean) selItem);
				fdetails.setLayoutData(new GridData(GridData.FILL_BOTH));
				fdetails.setEditingAreaInfo(this.editingAreaInfo);
				currentControl=fdetails;
			}
			
			if(currentControl!=null){
				additionalDetailControls.put(key, currentControl);
			}
		}
		
		Control[] children = additionalDetailsCmp.getChildren();
		for(int i=0;i<children.length;i++){
			if(children[i]!=currentControl){
				children[i].setVisible(false);
			}
		}
		
		currentControl.setVisible(true);
		additionalDetailsStackLayout.topControl=currentControl;
		additionalDetailsCmp.layout();
	}
	

	private void showFunctionDetailsPanel() {
		FunctionDetailsComposite functionDetails=(FunctionDetailsComposite)additionalDetailsStackLayout.topControl;
		functionDetails.showParametersPanel(true);
	}

	private String getItemKey(Object selItem) {
		String key = selItem.toString();
		if(selItem instanceof ExpObject){
			key=((ExpObject) selItem).getName()+"_"+((ExpObject) selItem).getClassType();
		}
		else if(selItem instanceof JRExprFunctionBean){
			key=((JRExprFunctionBean) selItem).getName()+"_"+((JRExprFunctionBean) selItem).getClass().getCanonicalName();
		}
		return key;
	}

	private List<String> getExpObjectMethodFirms(ExpObject selItem) {
		List<String> methodFirms=new ArrayList<String>();
		
		JasperReportsConfiguration jasperConfiguration = exprContext.getJasperReportsConfiguration();
		Class<?> loadClass=null;
		try {
			loadClass = jasperConfiguration.getClassLoader().loadClass(selItem.getClassType());
		} catch (ClassNotFoundException e) {
		}
		
		if (loadClass != null) {
			Method[] methods = loadClass.getMethods();
			for (int i = 0; i < methods.length; ++i) {
				if ((methods[i].getModifiers() & java.lang.reflect.Modifier.PUBLIC) != 0) {
					String method_firm = methods[i].getName() + "(";
					Class<?>[] params = methods[i].getParameterTypes();
					int j = 0;
					for (j = 0; j < params.length; ++j) {

						if (j > 0)
							method_firm += ", ";
						else
							method_firm += " ";
						method_firm += getPrintableTypeName(params[j].getName());
					}
					if (j > 0)
						method_firm += " ";
					method_firm += ") ";

					String rname = methods[i].getReturnType().getName();
					if (rname.equals("void"))
						continue; // we have to return something always!
					method_firm += getPrintableTypeName(rname);
					methodFirms.add(method_firm);
				}
			}
		}
		
		return methodFirms;
	}

	public void setExpressionContext(ExpressionContext context){
		this.exprContext=context;
	}
	
	public String getPrintableTypeName(String type) {
		if (type == null)
			return "void";

		if (type.endsWith(";"))
			type = type.substring(0, type.length() - 1);

		while (type.startsWith("[")) {
			type = type.substring(1) + "[]";
			if (type.startsWith("["))
				continue;
			if (type.startsWith("L"))
				type = type.substring(1);
			if (type.startsWith("Z"))
				type = "boolean" + type.substring(1);
			if (type.startsWith("B"))
				type = "byte" + type.substring(1);
			if (type.startsWith("C"))
				type = "char" + type.substring(1);
			if (type.startsWith("D"))
				type = "double" + type.substring(1);
			if (type.startsWith("F"))
				type = "float" + type.substring(1);
			if (type.startsWith("I"))
				type = "int" + type.substring(1);
			if (type.startsWith("J"))
				type = "long" + type.substring(1);
			if (type.startsWith("S"))
				type = "short" + type.substring(1);
		}

		if (type.startsWith("java.lang.")) {
			type = type.substring("java.lang.".length());
			if (type.indexOf(".") > 0) {
				type = "java.lang." + type;
			}
		}
		return type;
	}

	@Override
	public void setVisible(boolean visible) {
		if(additionalDetailsStackLayout.topControl!=null){
			if(categoryDetails==null || categoryDetails.isEmpty()){
				additionalDetailsStackLayout.topControl.setVisible(false);
			}
			else{
				additionalDetailsStackLayout.topControl.setVisible(visible);
			}
		}
		super.setVisible(visible);
	}

	public void setEditingAreaInfo(EditingAreaHelper editingAreaInfo){
		this.editingAreaInfo=editingAreaInfo;
	}
	
}
