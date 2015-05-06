package forms;

import java.io.File;

import javax.swing.JDialog;
import javax.swing.JFrame;

import controllers.SaveLoadLevel;
import entities.Grid;
import entities.Level;

public class PreviewWindow extends JDialog {
	
	Level level;
	GameGridView previewView;
	Grid grid;
	
	public PreviewWindow(Level level, JFrame builderWindow) {
		super(builderWindow, true);
		
		try {
			this.level = duplicate(level);
			this.previewView = new GameGridView(level.getGrid());
			this.setContentPane(this.previewView);
		} catch (Exception e) {
			
		}

		this.setTitle("Level Preview");
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	private Level duplicate(Level lvl) throws Exception {
		SaveLoadLevel.getInstance().saveLevel(lvl, "preview_level");
		return SaveLoadLevel.getInstance().getLevel(new File("preview_level"));
	}
}
