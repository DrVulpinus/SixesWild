package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import src.SixesWildWindow;
public class LevelPlayView extends JPanel {

	/**
	 * Create the panel.
	 */
	public static void main(String[] args) {
		SixesWildWindow sixesWildWindow = new SixesWildWindow();
		GameGridView gameGridView = new GameGridView();
					sixesWildWindow .setVisible(true);
					gameGridView .setVisible(true);
					//Thread.sleep(10000);
					//frame.setVisible(false);
				
		
	}
	public LevelPlayView() {
		
		SixesWildWindow sixesWildWindow = new SixesWildWindow();
		add(sixesWildWindow);
		
		GameGridView gameGridView = new GameGridView();
		add(gameGridView);

	}

}
