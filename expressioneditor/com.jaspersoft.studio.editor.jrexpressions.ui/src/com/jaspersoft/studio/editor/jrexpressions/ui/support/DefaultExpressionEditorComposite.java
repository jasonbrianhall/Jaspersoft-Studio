package com.jaspersoft.studio.editor.jrexpressions.ui.support;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.crosstabs.design.JRDesignCrosstab;
import net.sf.jasperreports.engine.JRExpression;
import net.sf.jasperreports.engine.JRField;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JRVariable;
import net.sf.jasperreports.engine.design.JRDesignDataset;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.expressions.functions.CategoryKeys;
import net.sf.jasperreports.expressions.functions.util.FunctionsLibraryUtil;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.custom.CaretListener;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import com.google.inject.Injector;
import com.jaspersoft.studio.editor.expression.ExpressionContext;
import com.jaspersoft.studio.editor.expression.ExpressionEditorComposite;
import com.jaspersoft.studio.editor.jrexpressions.ui.internal.JavaJRExpressionActivator;
import com.jaspersoft.studio.editor.jrexpressions.ui.support.ObjectCategoryItem.Category;

import de.itemis.xtext.utils.jface.viewers.StyledTextXtextAdapter;

/**
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 *
 */
public class DefaultExpressionEditorComposite extends ExpressionEditorComposite {

	// TODO - Add comments
	
	private JRDesignExpression expression;
	private ExpressionContext exprContext;
	private StyledText editorArea;
	private StyledTextXtextAdapter xtextAdapter;
	private TreeViewer objectsNavigator;
	private Composite objectCategoryDetailsCmp;
	private StackLayout detailsPanelStackLayout;
	private Map<String, ObjectCategoryDetailsPanel> detailPanels=new HashMap<String, ObjectCategoryDetailsPanel>();
	private EditingAreaHelper editingAreaInfo;
	
	private String currentWidgetText;
	private ObjectCategoryItem builtinFunctionsItem;
	private ObjectCategoryItem parametersCategoryItem;
	private ObjectCategoryItem fieldsCategoryItem;
	private ObjectCategoryItem variablesCategoryItem;
	
	public DefaultExpressionEditorComposite(Composite parent, int style) {
		super(parent, style);
		GridLayout gdl=new GridLayout(1,true);
		this.setLayout(gdl);
		createEditorArea(this);
		
		final SashForm sashForm=new SashForm(this,SWT.HORIZONTAL);
		GridData gdsash=new GridData(SWT.FILL,SWT.FILL,true,true);
		sashForm.setLayoutData(gdsash);
		
		createObjectsNavigator(sashForm);
		createCustomPanel(sashForm);
		
		sashForm.setWeights(new int[]{25,75});
	}

	private void createEditorArea(Composite parent) {
		Composite editorContainer=new Composite(parent, SWT.NONE);
		GridData layoutData = new GridData(SWT.FILL, SWT.FILL, true, false);
		layoutData.heightHint=100;
		editorContainer.setLayoutData(layoutData);
		GridLayout layout = new GridLayout(1,false);
		layout.marginWidth=0;
		editorContainer.setLayout(layout);

		editorArea = new StyledText(editorContainer, SWT.BORDER | SWT.BORDER_SOLID | SWT.MULTI | SWT.WRAP);
		editorArea.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		editorArea.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				currentWidgetText=editorArea.getText();
				synchCurrentFunctionDetails();
			}
		});
		editorArea.addCaretListener(new CaretListener() {
			@Override
			public void caretMoved(CaretEvent event) {
				synchCurrentFunctionDetails();
			}
		});
        xtextAdapter = new StyledTextXtextAdapter(getInjector());
        xtextAdapter.adapt(editorArea);

        editingAreaInfo=new EditingAreaHelper(xtextAdapter, editorArea);
        editingAreaInfo.addCategorySelectionListener(new ObjectCategorySelectionListener() {
			
			@Override
			public void select(ObjectCategorySelectionEvent event) {
				performCategorySelection(event.selectedCategory);
			}

		});
	}
	
	private void performCategorySelection(Category category) {
		if(category==null){
			// No explicit category specified, use the following selection order:
			// 	1) Fields, if any
			// 	2) Variables, if any
			// 	3) Parameters
			if(getAllFields().size()>0){
				objectsNavigator.setSelection(new StructuredSelection(fieldsCategoryItem),true);			}
			else if(getAllVariables().size()>0){
				objectsNavigator.setSelection(new StructuredSelection(variablesCategoryItem),true);
			}
			else{
				objectsNavigator.setSelection(new StructuredSelection(parametersCategoryItem),true);	
			}
		}
		// Otherwise select the right category	
		for(TreeItem item : objectsNavigator.getTree().getItems()){
			Object cat = item.getData();
			if(cat instanceof ObjectCategoryItem && 
					((ObjectCategoryItem)cat).getCategory().equals(category)){
				objectsNavigator.setSelection(null);
				objectsNavigator.setSelection(new StructuredSelection(cat),true);
				return;
			}
		}
	}

	private void synchCurrentFunctionDetails(){
		if(editingAreaInfo.isUpdate())return;
		final String functName = editingAreaInfo.getCurrentLibraryFunctionName();
		if(functName!=null){
			objectsNavigator.setSelection(new StructuredSelection(builtinFunctionsItem),true);
		}
		else{
			Object selElement = ((IStructuredSelection)objectsNavigator.getSelection()).getFirstElement();
			objectsNavigator.setSelection(new StructuredSelection(selElement),true);
		}
	}
		
	private void createObjectsNavigator(Composite parent) {
		objectsNavigator = new TreeViewer(parent, SWT.BORDER);
		Tree tree = objectsNavigator.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		objectsNavigator.setContentProvider(new ObjectsNavigatorContentProvider());
		objectsNavigator.setLabelProvider(new ObjectsNavigatorLabelProvider());
		
		objectsNavigator.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				Object selItem = ((IStructuredSelection)event.getSelection()).getFirstElement();
				if(selItem instanceof ObjectCategoryItem){
					updateDetailsPanel((ObjectCategoryItem)selItem);
				}
			}

		});
	}
	
	private void updateDetailsPanel(ObjectCategoryItem selItem) {
		String key=selItem.getCategory().getDisplayName()+"_"+selItem.getDisplayName();
		ObjectCategoryDetailsPanel currentControl=detailPanels.get(key);
		if(currentControl==null){
			// First time, must create control
			currentControl=new ObjectCategoryDetailsPanel(objectCategoryDetailsCmp, SWT.NONE);
			currentControl.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			currentControl.setExpressionContext(exprContext);
			currentControl.setEditingAreaInfo(editingAreaInfo);
			
			detailPanels.put(key, currentControl);
		}

		// Ensure all other controls are not visible
		Control[] children=objectCategoryDetailsCmp.getChildren();
		for(int i=0;i<children.length;i++){
			if(children[i]!=currentControl){
				children[i].setVisible(false);
			}
		}
		// Make the current selected one visible
		currentControl.setVisible(true);
		currentControl.refreshPanelUI(selItem);
		detailsPanelStackLayout.topControl=currentControl;
		objectCategoryDetailsCmp.layout();
	}
	
	private void refreshExpressionContextUI() {
		List<ObjectCategoryItem> rootCategories=new ArrayList<ObjectCategoryItem>();
		if(exprContext!=null){
			if(exprContext.getDatasets().size()>0){
				parametersCategoryItem = new ObjectCategoryItem(Category.PARAMETERS);
				parametersCategoryItem.setData(getAllParameters());
				fieldsCategoryItem = new ObjectCategoryItem(Category.FIELDS);
				fieldsCategoryItem.setData(getAllFields());
				variablesCategoryItem = new ObjectCategoryItem(Category.VARIABLES);
				variablesCategoryItem.setData(getAllVariables());
				rootCategories.add(parametersCategoryItem);
				rootCategories.add(fieldsCategoryItem);
				rootCategories.add(variablesCategoryItem);
			}
			
			int i=0;
			for (JRDesignCrosstab crosstab : exprContext.getCrosstabs()){
				i++;
				String crosstabKey=crosstab.getKey();
				if(crosstabKey==null) crosstabKey="";
				
				ObjectCategoryItem tmpCrossTabItem = new ObjectCategoryItem(Category.CROSSTAB, Category.CROSSTAB.getDisplayName() + i + ") " + crosstabKey);
				tmpCrossTabItem.setData(crosstab);
				rootCategories.add(tmpCrossTabItem);
			}
			
		}
		builtinFunctionsItem = new ObjectCategoryItem(Category.BUILT_IN_FUNCTIONS);
		// Get all categories for builtin functions
		List<ObjectCategoryItem> functionCategories=new ArrayList<ObjectCategoryItem>();
		for(String categoryKey : FunctionsLibraryUtil.getCategories()){
			String displayName=categoryKey;
			String categoryDisplayName = CategoryKeys.getCategoryDisplayName(categoryKey, null);
			if(categoryDisplayName!=null){
				displayName=categoryDisplayName;
			}
			ObjectCategoryItem objectCategoryItem = new ObjectCategoryItem(Category.FUNCTION_CATEGORY, displayName);
			objectCategoryItem.setData(categoryKey);
			functionCategories.add(objectCategoryItem);
		}
		if(!functionCategories.isEmpty()) {
			builtinFunctionsItem.setData(functionCategories.toArray(new ObjectCategoryItem[functionCategories.size()]));
		}
		
		rootCategories.add(builtinFunctionsItem);
		
		rootCategories.add(new ObjectCategoryItem(Category.USER_DEFINED_EXPRESSIONS));
		rootCategories.add(new ObjectCategoryItem(Category.RECENT_EXPRESSIONS));
		
		objectsNavigator.setInput(rootCategories.toArray(new ObjectCategoryItem[rootCategories.size()]));
		objectsNavigator.expandAll();
		objectsNavigator.setSelection(new StructuredSelection(objectsNavigator.getTree().getItem(0).getData()),true);
	}

	private void createCustomPanel(Composite parent) {
		objectCategoryDetailsCmp=new Composite(parent, SWT.NONE);
		objectCategoryDetailsCmp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		detailsPanelStackLayout = new StackLayout();
		objectCategoryDetailsCmp.setLayout(detailsPanelStackLayout);
	}
	
	@Override
	public void setExpressionContext(ExpressionContext exprContext) {
		this.exprContext=exprContext;
		refreshExpressionContextUI();
	}

	@Override
	public JRExpression getExpression() {
		if("".equals(currentWidgetText)){
			expression=null;
		}
		else{
			expression=new JRDesignExpression(currentWidgetText);	
		}
		return expression;
	}

	@Override
	public void setExpression(JRExpression expression) {
		this.expression=(JRDesignExpression)expression;
		if(this.expression==null){
			editorArea.setText("");
		}
		else{
			editorArea.setText(expression.getText());
		}
	}

	protected Injector getInjector(){
		// TODO -- GENERALIZE THE INJECTOR SELECTION
        JavaJRExpressionActivator activator = JavaJRExpressionActivator.getInstance();
        return activator.getInjector(JavaJRExpressionActivator.COM_JASPERSOFT_STUDIO_EDITOR_JREXPRESSIONS_JAVAJREXPRESSION);
	}
	
	/* Methods to enrich the category items in the navigator */
	
	private List<JRParameter> getAllParameters(){
		JRDesignDataset ds = exprContext.getDatasets().get(0);
        return ds.getParametersList();
	}
	
	private List<JRVariable> getAllVariables(){
		JRDesignDataset ds1 = exprContext.getDatasets().get(0);
        return ds1.getVariablesList();
	}
	
	private List<JRField> getAllFields(){
        JRDesignDataset ds2 = exprContext.getDatasets().get(0);
        return ds2.getFieldsList();
	}

}
