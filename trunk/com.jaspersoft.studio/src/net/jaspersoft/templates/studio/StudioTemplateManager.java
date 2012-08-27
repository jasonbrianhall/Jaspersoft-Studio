package net.jaspersoft.templates.studio;

import java.util.ArrayList;
import java.util.List;

import net.jaspersoft.templates.TemplateBundle;
import net.jaspersoft.templates.TemplateManager;

/**
 * This class implements the basic services provided by the template manager inside Jaspersoft Studio.
 * The manager is implemented in JSS as a singleton.
 * 
 * @author gtoffoli
 *
 */
public class StudioTemplateManager implements TemplateManager{

	private static TemplateManager instance = null;
	
	/**
	 * The constructor is private because we just create a singleton
	 */
	private StudioTemplateManager() {
	
		// Initialize the list of template providers...
		templateProviders = new ArrayList<TemplateProvider>();
		templateProviders.add(new DefaultTemplateProvider());
		
	}

	
	/**
	 * Get a shared instance of the template manager.
	 * 
	 * @return
	 */
	public static TemplateManager getInstance()
	{
		if (instance == null)
		{
			instance = new StudioTemplateManager();
		}
		
		return instance;
	}
	
	/**
	 * In Jaspersoft Studio templates are loaded trough a set of pluggable TemplateProviders.
	 * By default there is a template provider that looks for templates inside the
	 * templates directory, and another that allows to contribute templated trough
	 * the preferences.
	 * 
	 */
	private List<TemplateProvider> templateProviders = null;
	
	
	/**
	 *  In Jaspersoft Studio templates are stored inside the directory templates.
	 *  Other directories can then be added trough preferences.
	 * 
	 * 
	 * 
	 */
	@Override
	public List<TemplateBundle> getTemplateBundles() {
		
		List<TemplateBundle> allTemplateBundles = new ArrayList<TemplateBundle>();
		
		for (TemplateProvider tp : templateProviders)
		{
			allTemplateBundles.addAll( tp.getTemplateBundles());
		}

		return allTemplateBundles;
	}

	
	
}
