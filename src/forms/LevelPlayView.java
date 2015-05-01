package forms;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import src.PuzzleStats;
import src.StatsView;
import Interfaces.MoveControlListener;
import entities.Level;
public class LevelPlayView extends JPanel {
	private JButton btnBack;
	
	StatsView statsView;
	GameGridView gridView;
	SpecialMoveView specialMoveView;
	MoveControlListener moveControlListener;
	Level level;
	
	
	public LevelPlayView(Level level, MoveControlListener moveControlListener) {
		this.moveControlListener = moveControlListener;
		
		setLayout(new MigLayout("", "[150px:175px:175px][150px:175px,grow,fill][150px:n:150px,left]", "[150px:n,grow,fill][]"));
		
		statsView = new StatsView();
		statsView.setBackground(new Color(255, 255, 255, 50));
		add(statsView, "cell 0 0,grow");
		
		if (level == null)
			gridView = new GameGridView(level.getGrid());
		else
			gridView = new GameGridView(level.getGrid(), moveControlListener);
		
		gridView.setBackground(new Color(255, 255, 255, 50));
		add(gridView, "cell 1 0");
		
		specialMoveView = new SpecialMoveView();
		specialMoveView.setBackground(new Color(255, 255, 255, 50));
		add(specialMoveView, "cell 2 0,grow");
		
		//btnBack.setBounds(395, 20, 117, 29);
		add(getbtnBack(), "cell 2 1,growx,aligny bottom");
		
		//GameGridView gameGridView = new GameGridView();
		//getContentPane().add(gameGridView);
	}

	public JButton getbtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
		}
		return btnBack;
	}

	public StatsView getStatsView() {
		return statsView;
	}

	public GameGridView getGridView() {
		return gridView;
	}

	public SpecialMoveView getSpecialMoveView() {
		return specialMoveView;
	}
	
	public void setLevel(Level level) {
		this.level = level;
		
	}
	
	public Level getLevel() {
		return this.level;
	}
}

