package builder_entities;

/**
 * The state of the current buildable level. Contains the selected tool and the string which represents it.
 * @author Alex Wald
 */


public class LevelBuildState {
	public static final String ADD_SQUARE = "Add Square";
	public static final String ADD_RELEASE_SQUARE = "Add Release Square";
	public static final String REMOVE_SQUARE = "Remove Square";
	public static final String ADD_SIX = "Add Six";
	public static final String REMOVE_SIX = "Remove Six";
	
	public static final String[] TOOL_STRINGS = {ADD_SQUARE, ADD_RELEASE_SQUARE, REMOVE_SQUARE, ADD_SIX, REMOVE_SIX};
	
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
