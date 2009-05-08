package gr.open.client;

public abstract class AbstractTinyMCEConfiguration {

	private String mode = "textareas";
	private String theme = "advanced";
	private String skin = "o2k7";
	private String entityEncoding = "raw";
	private String themeAdvancedToolbarLocation = "top";
	private String themeAdvancedToolbarAlign = "left";
	private String themeAdvancedStatusbarLocation = "bottom";
	private String themeAdvancedResizing = "true";
	private String contentCss = "http://www.e-germanos.gr/e-germanos/eshop/css/all.css";
	private String templateExternalListUrl = "editor_stuf/lists/template_list.js";
	private String externalLinkListUrl = "editor_stuf/lists/link_list.js";
	private String externalImageListUrl = "editor_stuf/lists/image_list.js";
	private String mediaExternalListUrl = "editor_stuf/lists/media_list.js";
	
	private String[] plugins = new String[] {"example","safari","pagebreak","style","layer","table","save","advhr","advimage","advlink","emotions","iespell","inlinepopups","insertdatetime","preview","media","searchreplace","print","contextmenu","paste","directionality","fullscreen","noneditable","visualchars","nonbreaking","xhtmlxtras","template"};
	
	private String[] themeAdvancedButtons1 = new String[] {"mymenubutton" , "newdocument" , "|", "bold", "italic", "underline", "strikethrough", "|", "justifyleft", "justifycenter", "justifyright", "justifyfull", "formatselect"};
	private String[] themeAdvancedButtons2 = new String[] {"cut", "copy", "paste", "pastetext", "pasteword", "|", "search,replace", "|", "bullist", "numlist", "|", "outdent", "indent", "blockquote", "|", "undo", "redo", "|", "link", "unlink", "anchor", "cleanup", "code", "|", "insertdate", "inserttime"};
	private String[] themeAdvancedButtons3 = new String[] {"hr", "removeformat", "visualaid", "|", "sub", "sup", "|", "charmap", "iespell", "advhr", "|", "ltr", "rtl", "|", "fullscreen"};
	private String[] themeAdvancedButtons4 = new String[] {"insertlayer", "moveforward", "movebackward", "absolute", "|", "styleprops", "|", "cite", "abbr", "acronym", "del", "ins", "attribs", "|", "visualchars", "nonbreaking", "template", "pagebreak"};
	
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getSkin() {
		return skin;
	}
	public void setSkin(String skin) {
		this.skin = skin;
	}
	public String getEntityEncoding() {
		return entityEncoding;
	}
	public void setEntityEncoding(String entity_encoding) {
		this.entityEncoding = entity_encoding;
	}
	public String getThemeAdvancedToolbarLocation() {
		return themeAdvancedToolbarLocation;
	}
	public void setThemeAdvancedToolbarLocation(String theme_advanced_toolbar_location) {
		this.themeAdvancedToolbarLocation = theme_advanced_toolbar_location;
	}
	public String getThemeAdvancedToolbarAlign() {
		return themeAdvancedToolbarAlign;
	}
	public void setThemeAdvancedToolbarAlign(String theme_advanced_toolbar_align) {
		this.themeAdvancedToolbarAlign = theme_advanced_toolbar_align;
	}
	public String getThemeAdvancedStatusbarLocation() {
		return themeAdvancedStatusbarLocation;
	}
	public void setThemeAdvancedStatusbarLocation(String theme_advanced_statusbar_location) {
		this.themeAdvancedStatusbarLocation = theme_advanced_statusbar_location;
	}
	public String getThemeAdvancedResizing() {
		return themeAdvancedResizing;
	}
	public void setThemeAdvancedResizing(String theme_advanced_resizing) {
		this.themeAdvancedResizing = theme_advanced_resizing;
	}
	public String getContentCss() {
		return contentCss;
	}
	public void setContentCss(String content_css) {
		this.contentCss = content_css;
	}
	public String getTemplateExternalListUrl() {
		return templateExternalListUrl;
	}
	public void setTemplateExternalListUrl(String template_external_list_url) {
		this.templateExternalListUrl = template_external_list_url;
	}
	public String getExternalLinkListUrl() {
		return externalLinkListUrl;
	}
	public void setExternalLinkListUrl(String external_link_list_url) {
		this.externalLinkListUrl = external_link_list_url;
	}
	public String getExternalImageListUrl() {
		return externalImageListUrl;
	}
	public void setExternalImageListUrl(String external_image_list_url) {
		this.externalImageListUrl = external_image_list_url;
	}
	public String getMediaExternalListUrl() {
		return mediaExternalListUrl;
	}
	public void setMediaExternalListUrl(String media_external_list_url) {
		this.mediaExternalListUrl = media_external_list_url;
	}
	
	public String getPlugins() {
		String plug = "";
		int c = 1;
		for (String p : plugins) {
			plug += p;
			if (c < plugins.length) {
				plug += ", ";
			}
		}
		return plug;
	}
	public void setPlugins(String[] plugins) {
		this.plugins = plugins;
	}
	public String getThemeAdvancedButtons1() {
		String button1 = "";
		int c = 1;
		for (String p : themeAdvancedButtons1) {
			button1 += p;
			if (c < themeAdvancedButtons1.length) {
				button1 += ", ";
			}
		}
		return button1;
	}
	public void setThemeAdvancedButtons1(String[] theme_advanced_buttons1) {
		this.themeAdvancedButtons1 = theme_advanced_buttons1;
	}
	public String getThemeAdvancedButtons2() {
		String button2 = "";
		int c = 1;
		for (String p : themeAdvancedButtons2) {
			button2 += p;
			if (c < themeAdvancedButtons2.length) {
				button2 += ", ";
			}
		}
		return button2;
	}
	public void setThemeAdvancedButtons2(String[] theme_advanced_buttons2) {
		this.themeAdvancedButtons2 = theme_advanced_buttons2;
	}
	public String getThemeAdvancedButtons3() {
		String button3 = "";
		int c = 1;
		for (String p : themeAdvancedButtons3) {
			button3 += p;
			if (c < themeAdvancedButtons3.length) {
				button3 += ", ";
			}
		}
		return button3;
	}
	public void setThemeAdvancedButtons3(String[] theme_advanced_buttons3) {
		this.themeAdvancedButtons3 = theme_advanced_buttons3;
	}
	public String getThemeAdvancedButtons4() {
		String button4 = "";
		int c = 1;
		for (String p : themeAdvancedButtons4) {
			button4 += p;
			if (c < themeAdvancedButtons4.length) {
				button4 += ", ";
			}
		}
		return button4;
	}
	public void setThemeAdvancedButtons4(String[] theme_advanced_buttons4) {
		this.themeAdvancedButtons4 = theme_advanced_buttons4;
	}
	
	
}