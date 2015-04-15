package forms;

import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import javax.management.InstanceNotFoundException;
import javax.management.timer.TimerMBean;
import javax.swing.JLabel;

import entities.Level;

public class LevelSelectView extends SelectView {

	ArrayList<Level> levels = new ArrayList<Level>();
	@Override
	void loadItems() {
		for (Level level : levels) {
			JLabel label = new JLabel();
			items.add(label);
		}
		super.loadItems();//Do this last to add all of the items to the scrollPane
		
		
	}
	


	
}
