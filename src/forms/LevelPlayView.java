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
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					LevelPlayView w = new LevelPlayView();
					w.setVisible(true);
					//Thread.sleep(10000);
					//frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			}
		});
	}
	public LevelPlayView() {
		
		SixesWildWindow sixesWildWindow = new SixesWildWindow();
		add(sixesWildWindow);
		
		GameGridView gameGridView = new GameGridView();
		add(gameGridView);

	}

}
