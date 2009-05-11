package gr.open.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TinymceGwt implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
//		TinyMCE simpleEditor = new TinyMCE();
//		simpleEditor.getConfig().setTheme("simple");
//		RootPanel.get().add(simpleEditor);
		
		TinyMCE advancedEditor = new TinyMCE(new AdvancedTinyMCEConfiguration());
		RootPanel.get().add(advancedEditor);
	}
}
