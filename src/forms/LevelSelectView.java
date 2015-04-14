package forms;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.management.timer.TimerMBean;
import javax.swing.JLabel;

import entities.Level;

public class LevelSelectView extends SelectView  implements TimerMBean{

	ArrayList<Level> levels = new ArrayList<Level>();
	@Override
	void loadItems() {
		for (Level level : levels) {
			JLabel label = new JLabel();
			label.setIcon(level.getIcon().getImage());
			items.add(label);
		}
		super.loadItems();//Do this last to add all of the items to the scrollPane
		Timer tmr = new Timer();
		tmr.schedule(thisTask(), 10000);
		
	}
	
	
	public TimerTask thisTask(){
		
		
		return null;
		
	}
	
}
