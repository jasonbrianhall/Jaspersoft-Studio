package com.jaspersoft.studio.editor.jrexpressions.ui.support;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.expressions.functions.util.FunctionsLibraryUtil;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;

import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.Arguments;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.ExpressionList;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.MethodInvocation;
import com.jaspersoft.studio.editor.jrexpressions.javaJRExpression.QualifiedName;

import de.itemis.xtext.utils.jface.viewers.StyledTextXtextAdapter;

/**
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 *
 */
public class EditingAreaHelper {

	// FIXME - Refactor the code of the methods, many of them share the same logic to find
	// the interesting node and perform actions on it.
	// TODO - Add comments
	
	private boolean update;
	private StyledTextXtextAdapter xtextAdapter;
	private StyledText textArea;
	private List<ObjectCategorySelectionListener> categorySelectionListeners=new ArrayList<ObjectCategorySelectionListener>();

	public EditingAreaHelper(StyledTextXtextAdapter xtextAdapter, StyledText textArea) {
		super();
		this.xtextAdapter = xtextAdapter;
		this.textArea = textArea;
	}

	public StyledTextXtextAdapter getXtextAdapter() {
		return xtextAdapter;
	}

	public StyledText getTextArea() {
		return textArea;
	}
	
	/**
	 * Returns the current function name using the cursor position in the text editor.
	 * 
	 * <p>
	 * This method seeks for library functions so no dotted identifier is considered 
	 * for now. This means that when other kind of method invocation are found this
	 * method returns <code>null</code>.
	 * 
	 * @return the name of the currently selected function, <code>null</code> otherwise
	 */
	public String getCurrentLibraryFunctionName(){
		
		// TODO - When dotted library functions will be allowed this method must be improved
		
		if(xtextAdapter.getXtextParseResult()!=null){
			int caretOffset = textArea.getCaretOffset();
			EObjectAtOffsetHelper eobjHelper=new EObjectAtOffsetHelper();
			EObject resolvedEObj = eobjHelper.resolveElementAt(xtextAdapter.getFakeResourceContext().getFakeResource(), caretOffset);
			ICompositeNode actualNode = NodeModelUtils.findActualNodeFor(resolvedEObj);

			
			if(actualNode!=null){
				INode tmpParentNode=actualNode;
				boolean foundParentNode=false;
				while(!foundParentNode && tmpParentNode!=null){
					if(tmpParentNode.getSemanticElement() instanceof MethodInvocation){
						foundParentNode=true;
					}
					else{
						tmpParentNode=tmpParentNode.getParent();
					}
				}
				if(foundParentNode && tmpParentNode.getSemanticElement() instanceof MethodInvocation){
					final QualifiedName methodName = ((MethodInvocation)tmpParentNode.getSemanticElement()).getMethodName();
					if(methodName.getIdentifier().size()==1){
						final String name = methodName.getIdentifier().get(0);
						if(FunctionsLibraryUtil.existsFunction(name)){
							return name;
						}
					}
				}
			}
		}

		return null;
	}
	
	public int getArgumentPosition(){
		if(xtextAdapter.getXtextParseResult()!=null){
			int caretOffset = textArea.getCaretOffset();
			EObjectAtOffsetHelper eobjHelper=new EObjectAtOffsetHelper();
			EObject resolvedEObj = eobjHelper.resolveElementAt(xtextAdapter.getFakeResourceContext().getFakeResource(), caretOffset);
			ICompositeNode actualNode = NodeModelUtils.findActualNodeFor(resolvedEObj);
			int actualNodeOffset = actualNode.getOffset();
			
			if(actualNode!=null){
					INode tmpParentNode=actualNode;
					boolean foundParentNode=false;
					while(!foundParentNode && tmpParentNode!=null){
						if(tmpParentNode.getSemanticElement() instanceof Arguments){
							foundParentNode=true;
						}
						else{
							tmpParentNode=tmpParentNode.getParent();
						}
					}
					if(foundParentNode && tmpParentNode.getSemanticElement() instanceof Arguments){
					final ExpressionList exprLst=((Arguments)tmpParentNode.getSemanticElement()).getExprLst();
						if(exprLst!=null){
							ICompositeNode expressionsLst = NodeModelUtils.getNode(exprLst);
							if(actualNodeOffset>=expressionsLst.getOffset()){
								int argumentPos=1;
								for (INode child : expressionsLst.getChildren()){
									if(child.getOffset()<actualNodeOffset && 
											child.getGrammarElement() instanceof RuleCall){
										AbstractRule rule = ((RuleCall)child.getGrammarElement()).getRule();
										if(rule!=null && rule.getName().equals("COMMA")){
											argumentPos++;
										}
									}
								}
								
								return argumentPos; 
							}
						}
						else{
							// No arguments found.
							// Potential position for argument 1 (excluded the '(' char)
							if(actualNodeOffset>=tmpParentNode.getOffset()+1){
								return 1;
							}
						}
					}
			}

		}
		
		return -1;
	}

	public String getTextForArgument(int position) {
		if(xtextAdapter.getXtextParseResult()!=null){
			int caretOffset = textArea.getCaretOffset();
			EObjectAtOffsetHelper eobjHelper=new EObjectAtOffsetHelper();
			EObject resolvedEObj = eobjHelper.resolveElementAt(xtextAdapter.getFakeResourceContext().getFakeResource(), caretOffset);
			ICompositeNode actualNode = NodeModelUtils.findActualNodeFor(resolvedEObj);
			
			if(actualNode!=null){
					INode tmpParentNode=actualNode;
					boolean foundParentNode=false;
					while(!foundParentNode && tmpParentNode!=null){
						if(/*tmpParentNode.getSemanticElement() instanceof Arguments ||*/ tmpParentNode.getSemanticElement() instanceof MethodInvocation){
							foundParentNode=true;
						}
						else{
							tmpParentNode=tmpParentNode.getParent();
						}
					}
					if(foundParentNode){
						Arguments args=null;
						if(tmpParentNode.getSemanticElement() instanceof MethodInvocation){
							args=((MethodInvocation)tmpParentNode.getSemanticElement()).getArgs();
						}
						else{
							args=(Arguments)tmpParentNode.getSemanticElement();
						}
						
						if(args!=null){
							final ExpressionList exprLst=args.getExprLst();
							if(exprLst!=null){ 
								if(exprLst.getCommas().size()>0){
									if(position>exprLst.getCommas().size()+1){
										// already out of scope: parameter position not valid
										return "";
									}
							
									int commasNum = exprLst.getCommas().size();
									ICompositeNode argsNode = NodeModelUtils.getNode(args);
									int argsStart = argsNode.getOffset();	// left parenthesis position
									int argsEnd = argsNode.getTotalEndOffset();	// right parenthesis position
									int selectionStart=-1;
									int selectionEnd=-1;
									
									// The parameter index is comprised in the available locations
									// Comma separated expressions (or even blank chars) => get all comma positions
									List<Integer> commasOffsets=new ArrayList<Integer>();									
									for(INode c : NodeModelUtils.findActualNodeFor(exprLst).getChildren()){
										if(GrammarUtil.isTerminalRuleCall(c.getGrammarElement()) && 
												((RuleCall)c.getGrammarElement()).getRule().getName().equals("COMMA")){
											commasOffsets.add(c.getOffset());
										}
									}
									
									if(position==1){
										selectionStart=argsStart+1;
										selectionEnd=commasOffsets.get(0);
									}
									else if (position == commasNum+1){
										selectionStart=commasOffsets.get(commasNum-1)+1;
										selectionEnd=argsEnd-1;
									}
									else {
										selectionStart=commasOffsets.get(position-2)+1;
										selectionEnd=commasOffsets.get(position-1);
									}
									
									if((selectionStart!=-1 && selectionEnd!=-1) &&
											selectionEnd>selectionStart){
										try{
											return textArea.getText(selectionStart, selectionEnd-1);
										}
										catch(IllegalArgumentException ex){
											// Text modification is occurred while
											// we were updating the text widget content
											// in the function detail panel => ignore it
											return "";
										}
									}
									else {
										return "";
									}
									
								}
								else{
									// One single potential parameter
									if(exprLst.getExpressions().size()==1 && position==1){
										ICompositeNode exprNode = NodeModelUtils.getNode(exprLst.getExpressions().get(0));
										return NodeModelUtils.getTokenText(exprNode);
									}
								}
							}
						}
					}
			}

		}
		return "";
	}

	public void selectParameter(int paramIndex) {
		if(xtextAdapter.getXtextParseResult()!=null){
			int caretOffset = textArea.getCaretOffset();
			EObjectAtOffsetHelper eobjHelper=new EObjectAtOffsetHelper();
			EObject resolvedEObj = eobjHelper.resolveElementAt(xtextAdapter.getFakeResourceContext().getFakeResource(), caretOffset);
			ICompositeNode actualNode = NodeModelUtils.findActualNodeFor(resolvedEObj);
			
			if(actualNode!=null){
					INode tmpParentNode=actualNode;
					boolean foundParentNode=false;
					while(!foundParentNode && tmpParentNode!=null){
						if(tmpParentNode.getSemanticElement() instanceof Arguments || tmpParentNode.getSemanticElement() instanceof MethodInvocation){
							foundParentNode=true;
						}
						else{
							tmpParentNode=tmpParentNode.getParent();
						}
					}
					if(foundParentNode){
						Arguments args=null;
						if(tmpParentNode.getSemanticElement() instanceof MethodInvocation){
							args=((MethodInvocation)tmpParentNode.getSemanticElement()).getArgs();
						}
						else{
							args=(Arguments)tmpParentNode.getSemanticElement();
						}
						
						if(args!=null){
							final ExpressionList exprLst=args.getExprLst();
							ICompositeNode argsNode = NodeModelUtils.getNode(args);
							int argsStart = argsNode.getOffset();	// left parenthesis position
							int argsEnd = argsNode.getTotalEndOffset();	// right parenthesis position

							int selectionStart=-1;
							int selectionEnd=-1;
							int newPlaceHoldersNum=0;
							
							if(exprLst!=null){
								int commasNum = exprLst.getCommas().size();
								
								if(commasNum==0){	// No commas ==> only one location available i.e FUNCTION() or FUNCTION(arg1)
									if(paramIndex==1){
										// Select all parentheses content
										selectionStart=argsStart+1;
										selectionEnd=argsEnd-1;										
									}
									else{
										// Must add commas and spaces as much as needed
										newPlaceHoldersNum=paramIndex-1;
									}
								}
								else{
									if(paramIndex>commasNum+1){
										// A location for the specified parameter index is not available
										// We need to add the remaining locations 
										newPlaceHoldersNum=paramIndex-(commasNum+1);
									}
									else{
										// The parameter index is comprised in the available locations
										// Comma separated expressions (or even blank chars) => get all comma positions
										List<Integer> commasOffsets=new ArrayList<Integer>();									
										for(INode c : NodeModelUtils.findActualNodeFor(exprLst).getChildren()){
											if(GrammarUtil.isTerminalRuleCall(c.getGrammarElement()) && 
													((RuleCall)c.getGrammarElement()).getRule().getName().equals("COMMA")){
												commasOffsets.add(c.getOffset());
											}
										}
										
										if(paramIndex==1){
											selectionStart=argsStart+1;
											selectionEnd=commasOffsets.get(0);
										}
										else if (paramIndex == commasNum+1){
											selectionStart=commasOffsets.get(commasNum-1)+1;
											selectionEnd=argsEnd-1;
										}
										else {
											selectionStart=commasOffsets.get(paramIndex-2)+1;
											selectionEnd=commasOffsets.get(paramIndex-1);
										}
									}
								}
								
							}
							else{
								newPlaceHoldersNum=paramIndex-1;
								selectionStart=argsStart+1;
								selectionEnd=argsEnd-1;
							}
							
							if(newPlaceHoldersNum>0){
								String newParams="";
								for(int i=0;i<newPlaceHoldersNum;i++){
									newParams+=", ";
								}
								int newPosition=argsEnd-1;
								textArea.setSelection(newPosition);
								textArea.insert(newParams);
								selectionStart=newPosition+newParams.length()-1;
								selectionEnd=newPosition+newParams.length();
							}
							
							if(selectionStart!=-1 && selectionEnd!=-1){
								textArea.setSelection(selectionStart,selectionEnd);
							}
						}
					}
			}

		}
	}

	public void removeUselessParameters(int lastParamIndex) {
		if(xtextAdapter.getXtextParseResult()!=null){
			int caretOffset = textArea.getCaretOffset();
			EObjectAtOffsetHelper eobjHelper=new EObjectAtOffsetHelper();
			EObject resolvedEObj = eobjHelper.resolveElementAt(xtextAdapter.getFakeResourceContext().getFakeResource(), caretOffset);
			ICompositeNode actualNode = NodeModelUtils.findActualNodeFor(resolvedEObj);
			
			if(actualNode!=null){
					INode tmpParentNode=actualNode;
					boolean foundParentNode=false;
					while(!foundParentNode && tmpParentNode!=null){
						if(tmpParentNode.getSemanticElement() instanceof Arguments || tmpParentNode.getSemanticElement() instanceof MethodInvocation){
							foundParentNode=true;
						}
						else{
							tmpParentNode=tmpParentNode.getParent();
						}
					}
					if(foundParentNode){
						Arguments args=null;
						if(tmpParentNode.getSemanticElement() instanceof MethodInvocation){
							args=((MethodInvocation)tmpParentNode.getSemanticElement()).getArgs();
						}
						else{
							args=(Arguments)tmpParentNode.getSemanticElement();
						}
						
						if(args!=null){
							final ExpressionList exprLst=args.getExprLst();
							ICompositeNode argsNode = NodeModelUtils.getNode(args);
							int argsEnd = argsNode.getTotalEndOffset();	// right parenthesis position
							int selectionStart=-1;
							int selectionEnd=-1;
							
							if(exprLst!=null){
								int commasNum = exprLst.getCommas().size();
								if(commasNum>0 && commasNum>=lastParamIndex){
									// Comma separated expressions (or even blank chars) => get all comma positions
									List<Integer> commasOffsets=new ArrayList<Integer>();									
									for(INode c : NodeModelUtils.findActualNodeFor(exprLst).getChildren()){
										if(GrammarUtil.isTerminalRuleCall(c.getGrammarElement()) && 
												((RuleCall)c.getGrammarElement()).getRule().getName().equals("COMMA")){
											commasOffsets.add(c.getOffset());
										}
									}

									// Get the first non useful comma
									selectionStart=commasOffsets.get(lastParamIndex-1);
									selectionEnd=argsEnd-1;
								}
							}
							
							if(selectionStart!=-1 && selectionEnd!=-1){
								textArea.setSelection(selectionStart,selectionEnd);
								textArea.insert("");
							}
						}
					}
			}

		}
	}
	
	
	public void insertAtCurrentLocation(String partialExpression,boolean selectNewText){
		int start=textArea.getSelection().x;
		update=true;
		textArea.insert(partialExpression);
		update=false;
		textArea.setSelection(start, start);
	}
	
	public void setUpdate(boolean update){
		this.update=update;
	}
	
	public boolean isUpdate(){
		return this.update;
	}
	
	public void removeCategorySelectionListener(ObjectCategorySelectionListener listener){
		categorySelectionListeners.remove(listener);
	}
	
	public void addCategorySelectionListener(ObjectCategorySelectionListener listener){
		categorySelectionListeners.add(listener);
	}

	public void notifyCategorySelection(
			ObjectCategorySelectionEvent selectionEvent) {
		for (ObjectCategorySelectionListener l : categorySelectionListeners){
			l.select(selectionEvent);
		}
	}
}
