package gr.open.client;

public class AdvancedTinyMCEConfiguration extends AbstractTinyMCEConfiguration {

	public AdvancedTinyMCEConfiguration() {
		setThemeAdvancedButtons1(new String[] {"save","newdocument","|","bold","italic","underline","strikethrough","|","justifyleft","justifycenter","justifyright","justifyfull","|","styleselect","formatselect","fontselect","fontsizeselect"});
		setThemeAdvancedButtons2(new String[] {"cut","copy","paste","pastetext","pasteword","|","search","replace","|","bullist","numlist","|","outdent","indent","blockquote","|","undo","redo","|","link","unlink","anchor","image","cleanup","help","code","|","insertdate","inserttime","preview","|","forecolor","backcolor"});
		setThemeAdvancedButtons3(new String[] {"tablecontrols","|","hr","removeformat","visualaid","|","sub","sup","|","charmap","emotions","iespell","media","advhr","|","print","|","ltr","rtl","|","fullscreen"});
		setThemeAdvancedButtons4(new String[] {"insertlayer","moveforward","movebackward","absolute","|","styleprops","spellchecker","|","cite","abbr","acronym","del","ins","attribs","|","visualchars","nonbreaking","template","blockquote","pagebreak","|","insertfile","insertimage"});
	}
}
