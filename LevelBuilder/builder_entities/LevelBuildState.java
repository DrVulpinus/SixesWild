package builder_entities;

public class LevelBuildState {
	public static final String ADD_SQUARE = "Add Square";
	public static final String ADD_RELEASE_SQUARE = "Add Release Square";
	public static final String REMOVE_SQAURE = "Remove Square";
	public static final String ADD_SIX = "Add Six";
	public static final String REMOVE_SIX = "Add Six";
	
	public static final String[] TOOL_STRINGS = {ADD_SQUARE, ADD_RELEASE_SQUARE, REMOVE_SQAURE, ADD_SIX, REMOVE_SIX};
	
	int selectedTool;
	
	public LevelBuildState() {
		this.selectedTool = 0;
	}
	
	public String getSelectedTool() {
		return TOOL_STRINGS[this.selectedTool];
	}
	
	public void setSelectedTool(int n) {
		this.selectedTool = n;
	}
	
	public String[] getToolStrings() {
		return TOOL_STRINGS;
	}
	
}
