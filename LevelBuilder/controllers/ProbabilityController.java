package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import src.LevelStats;
import src.LevelStatsView;
import entities.Probability;
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
	

	public ProbabilityController(ProbabilityView probabilityView, final Probability probability) {
	
			this.one = probabilityView.getTextField();
			this.two = probabilityView.getTextField_1();
			this.three = probabilityView.getTextField_2();
			this.four = probabilityView.getTextField_3();
			this.five = probabilityView.getTextField_4();
			this.six = probabilityView.getTextField_5();
			this.apply = probabilityView.getBtnApplyChanges();
			
			
			final int[] numbers;
			numbers = new int[5];
			
			
			probabilityView.getBtnApplyChanges().addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					
			
			int sum =0;
	        numbers[0] = Integer.parseInt(one.getText());
	      	numbers[1] = Integer.parseInt(two.getText());
	      	numbers[2]  = Integer.parseInt(three.getText());
	      	numbers[3]  = Integer.parseInt(four.getText());
	      	numbers[4]  = Integer.parseInt(five.getText());
	      	numbers[5]  = Integer.parseInt(six.getText());
	      	
	      	for ( int i=0; i<=6; i++){
	      		if (numbers[i] == (int)numbers[i]){
	      			sum+=numbers[i];
	      		}
	      		else{
	      			System.out.println(numbers[i]+ "is not a number");
	      			
	      		}
	      	}
	      	if(sum != 100){
	      		System.out.println("Your numbers do not add up to 100.");
	      	}
	      	
	      	else{
	      		// use probabilities
	      	probability.setProb1(numbers[0]);
	      	probability.setProb2(numbers[1]);
	      	probability.setProb3(numbers[2]);
	      	probability.setProb4(numbers[3]);
	      	probability.setProb5(numbers[4]);
	      	probability.setProb6(numbers[5]);
	      		   		
	      	}
				}
			});
		}
		
	}


