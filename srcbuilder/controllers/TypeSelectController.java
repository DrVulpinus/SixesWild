

package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;

import src.StatsView;
import entities.Level;
import entities.LevelStats;
import entities.LevelType;
import forms.TypeSelectView;

/**
 * The controller that updates the GUI that contains the selectable types.
 * When a type is selected, the level entity is then passed that type.
 *
 */
public class TypeSelectController implements ActionListener {
	TypeSelectView typeSelectView = new TypeSelectView();
	JRadioButton puzzle;
	JRadioButton lightning;
	JRadioButton release;
	JRadioButton elimination;
	LevelStats levelStats;
	Level level;

	public TypeSelectController(Level level) {

		this.puzzle = typeSelectView.getRdbtnPuzzle();
		this.lightning = typeSelectView.getRdbtnLightning();
		this.release = typeSelectView.getRdbtnRelease();
		this.elimination = typeSelectView.getRdbtnElimination();

		this.level = level;

		//			        this.swap = new JButton("1");
		this.puzzle.addActionListener(this);
		//			        this.swap = swap;
		//			        
		//			        this.remove = new JButton("2");
		this.lightning.addActionListener(this);
		//			        this.remove = remove;
		//			        
		//			        this.reset = new JButton("3");
		this.release.addActionListener(this);
		//			        this.remove = remove;

		this.elimination.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == puzzle){
			level.setLvlType(LevelType.PUZZLE);
		}

		if (e.getSource() == lightning){
			level.setLvlType(LevelType.LIGHTNING);
		}

		if (e.getSource() == release){
			level.setLvlType(LevelType.RELEASE);
		}	

		if (e.getSource() == elimination){
			level.setLvlType(LevelType.ELIMINATION);
		}	
	}
}	











