package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import forms.AdjustStarView;
import src.LevelStats;

public class StarPointsController {
	
	AdjustStarView adjustStarView;
	JTextField star1;
	JTextField star2;
	JTextField star3;
	JButton apply;
	LevelStats stats;
	

	public StarPointsController(AdjustStarView asv, LevelStats stats) {
		this.adjustStarView = asv;
		this.star1 = asv.getTextField();
		this.star2 = asv.getTextField_1();
		this.star3 = asv.getTextField_2();
		this.apply = asv.getBtnApplyChanges();
		this.stats = stats;
		
		addListeners();
	}
	
	
	
	private void addListeners() {
		this.apply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int sc1, sc2, sc3;
				sc1 = Integer.parseInt(star1.getText());
				sc2 = Integer.parseInt(star2.getText());
				sc3 = Integer.parseInt(star3.getText());
				
				if (!stats.setStarCounts(sc1, sc2, sc3))
					JOptionPane.showMessageDialog(adjustStarView, "The specified set of star counts is invalid. The star counts must be in ascending order.");
			}	
		});
	}
	
	
}
