package controllers;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import src.LevelStats;
import src.LevelStatsView;
import forms.ProbabilityView;
import forms.TypeSelectView;

public class ProbabilityController {

	TypeSelectView typeSelectView = new TypeSelectView();
	JTextField one;
	JTextField two;
	JTextField three;
	JTextField four;
	JTextField five;
	JTextField six;
	JButton apply;
	

	public ProbabilityController(ProbabilityView probabilityView, Probability probability) {
	
			this.one = probabilityView.getTextField();
			this.two = probabilityView.getTextField_1();
			this.three = probabilityView.getTextField_2();
			this.four = probabilityView.getTextField_3();
			this.five = probabilityView.getTextField_4();
			this.six = probabilityView.getTextField_5();
			this.apply = probabilityView.getBtnApplyChanges();
			
			
	      	int int1 = Integer.parseInt(one.getText());
	      	int int2 = Integer.parseInt(two.getText());
	    	int int3 = Integer.parseInt(three.getText());
	      	int int4 = Integer.parseInt(four.getText());
	    	int int5 = Integer.parseInt(five.getText());
	      	int int6 = Integer.parseInt(six.getText());
		}
		
	}


