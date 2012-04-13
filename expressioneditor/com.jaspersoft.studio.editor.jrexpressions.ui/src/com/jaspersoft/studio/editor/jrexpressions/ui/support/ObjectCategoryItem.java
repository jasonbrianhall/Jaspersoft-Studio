package com.jaspersoft.studio.editor.jrexpressions.ui.support;

import org.eclipse.swt.graphics.Image;

import com.jaspersoft.studio.utils.ResourceManager;

/**
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 *
 */
public class ObjectCategoryItem {

	public static final String ICON_FOLDER_FIELDS = "/resources/icons/fields-16.png";
	public static final String ICON_FOLDER_PARAMETERS = "/resources/icons/parameters-16.png";
	public static final String ICON_FOLDER_VARIABLES = "/resources/icons/variables-16.png";
	public static final String ICON_FOLDER = "/resources/icons/folder.png";
	public static final String ICON_FOLDER_RECENT_EXPRESSIONS = ICON_FOLDER;
	public static final String ICON_FOLDER_FORMULAS = ICON_FOLDER;
	public static final String ICON_CROSSTAB = "/resources/icons/crosstab-16.png";

	private String displayName = null;
	private Image icon = null;
	private Category category=null;
	private Object data; // generic object for application use (i.e: most common case to maintain children)

	public ObjectCategoryItem(Category category) {
		this(category, null);
	}

	public ObjectCategoryItem(Category category, String customDisplayName) {
		this(category, customDisplayName, null);
	}

	public ObjectCategoryItem(Category category, String customDisplayName, String iconPath) {
		this.category=category;
		this.displayName=(customDisplayName!=null)?customDisplayName:category.getDisplayName();
		if(iconPath==null){
			iconPath=category.getIconPath();
		}
		this.icon=ResourceManager.getPluginImage(
				"com.jaspersoft.studio.editor.jrexpressions.ui", iconPath);
	}
	
	public Category getCategory(){
		return this.category;
	}
	
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Image getIcon() {
		return icon;
	}

	public void setIcon(Image icon) {
		this.icon = icon;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return displayName;
	}
	
	public enum Category {
		PARAMETERS("Parameters",ICON_FOLDER_PARAMETERS),
		FIELDS("Fields", ICON_FOLDER_FIELDS),
		VARIABLES("Variables", ICON_FOLDER_VARIABLES),
		BUILT_IN_FUNCTIONS("Built-in Functions", ICON_FOLDER),
		FUNCTION_CATEGORY("Sub-category",ICON_FOLDER),
		USER_DEFINED_EXPRESSIONS("User Defined Expressions", ICON_FOLDER),
		RECENT_EXPRESSIONS("Recent Expressions", ICON_FOLDER),
		CROSSTAB("Crosstab", ICON_CROSSTAB);
		
		private String dislayName;
		private String iconPath;
		
		private Category(String displayName, String iconPath){
			this.dislayName=displayName;
			this.iconPath=iconPath;
		}
		
		public String getDisplayName(){
			return dislayName;
		}
		
		public String getIconPath(){
			return iconPath;
		}
	}
}
