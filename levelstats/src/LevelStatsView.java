package src;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class LevelStatsView extends JPanel {
	LevelStats stats;
	JLabel type;
	JLabel points;
	
	LevelStatsView(LevelStats stats) {
		this.stats = stats;
		add(new JLabel(stats.getType()));
		
		type = new JLabel();
		add(type);
	}
	
	public JLabel getType() {
		return type;
	}
	
}
