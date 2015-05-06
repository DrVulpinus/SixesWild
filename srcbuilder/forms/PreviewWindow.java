package forms;

import java.io.File;

import javax.swing.JDialog;
import javax.swing.JFrame;

import boundaries.GameGridView;
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
			this.level.shuffleBoard();
			this.previewView = new GameGridView(this.level.getGrid());
			this.setContentPane(this.previewView);
		} catch (Exception e) {
			e.printStackTrace();
		}

		this.setTitle("Level Preview");
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	private Level duplicate(Level lvl) throws Exception {
		File tmp = SaveLoadLevel.getInstance().saveTempLevel(lvl, "preview_level");
		return SaveLoadLevel.getInstance().getTempLevel(tmp);
	}
}
