/*******************************************************************************
 * Copyright (C) 2005 - 2014 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com.
 * 
 * Unless you have purchased  a commercial license agreement from Jaspersoft,
 * the following license terms  apply:
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package com.jaspersoft.studio.background;

import org.eclipse.core.expressions.EvaluationResult;
import org.eclipse.core.expressions.Expression;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.CompoundContributionItem;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;
import org.eclipse.ui.menus.ExtensionContributionFactory;
import org.eclipse.ui.menus.IContributionRoot;
import org.eclipse.ui.services.IServiceLocator;

import com.jaspersoft.studio.messages.Messages;

public class BackgroundMenuContributior extends ExtensionContributionFactory {

	@Override
	public void createContributionItems(IServiceLocator serviceLocator, IContributionRoot additions) {
    additions.addContributionItem(getBackgroundMenu(), new Expression() {
			
			@Override
			public EvaluationResult evaluate(IEvaluationContext context) throws CoreException {
				return EvaluationResult.TRUE;
			}
		});
	}

	public static MenuManager getBackgroundMenu(){
	   MenuManager submenu = new MenuManager(Messages.MBackgroundImage_menuLabel, "com.jaspersoft.studio.background.backgroundmenu"); //$NON-NLS-2$
	    IContributionItem dynamicItem = new CompoundContributionItem("org.eclipse.ui.views.problems.groupBy.items") { //$NON-NLS-1$
	        protected IContributionItem[] getContributionItems() {
	          IContributionItem[] list = new IContributionItem[4];
	          list[0] = new CommandContributionItem(new CommandContributionItemParameter(PlatformUI.getWorkbench(), "SelectBackgroundHandler", "com.jaspersoft.studio.background.commands.SelectBackgroundHandler", CommandContributionItem.STYLE_PUSH)); //$NON-NLS-1$ //$NON-NLS-2$
	          list[1] = new CommandContributionItem(new CommandContributionItemParameter(PlatformUI.getWorkbench(), "TransformBackgroundCommand",  "com.jaspersoft.studio.background.commands.TransformBackgroundCommand", CommandContributionItem.STYLE_CHECK)); //$NON-NLS-1$ //$NON-NLS-2$
	          list[2] = new CommandContributionItem(new CommandContributionItemParameter(PlatformUI.getWorkbench(), "ShowBackgroundHandler",  "com.jaspersoft.studio.background.commands.ShowBackgroundHandler", CommandContributionItem.STYLE_CHECK)); //$NON-NLS-1$ //$NON-NLS-2$
	          list[3] = new CommandContributionItem(new CommandContributionItemParameter(PlatformUI.getWorkbench(), "DeleteBackgroundHandler",  "com.jaspersoft.studio.background.commands.DeleteBackgroundHandler", CommandContributionItem.STYLE_PUSH)); //$NON-NLS-1$ //$NON-NLS-2$
	        	return list;
	        }
	    };
	    submenu.add(dynamicItem);
	    return submenu;
	}
}
