package forms;

import java.awt.EventQueue;

public class ShowPlayLevelView {
	public static void main(String[] args) {
		 EventQueue.invokeLater(new Runnable() {
	         public void run() {
	        
		LevelPlayView level = new LevelPlayView();
		level.setVisible(true);
		
	   
	        	 
	     	} });
	}
}
