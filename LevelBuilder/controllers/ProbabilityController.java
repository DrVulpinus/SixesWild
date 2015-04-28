package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import entities.Probability;
import forms.ProbabilityBlockView;
import forms.ProbabilityMultiplierView;
import forms.TypeSelectView;

public class ProbabilityController {

	TypeSelectView typeSelectView = new TypeSelectView();
	JTextField one;
	JTextField two;
	JTextField three;
	JTextField four;
	JTextField five;
	JTextField six;
	JTextField xone;
	JTextField xtwo;
	JTextField xthree;
	JButton apply;
	JButton xapply;
	

	public ProbabilityController(ProbabilityBlockView probabilityBlockView, ProbabilityMultiplierView probabilityMultiplierView,  final Probability probability) {
	
			this.one = probabilityBlockView.getTextField();
			this.two = probabilityBlockView.getTextField_1();
			this.three = probabilityBlockView.getTextField_2();
			this.four = probabilityBlockView.getTextField_3();
			this.five = probabilityBlockView.getTextField_4();
			this.six = probabilityBlockView.getTextField_5();
			this.apply = probabilityBlockView.getBtnApplyChanges();
			
			this.xone = probabilityMultiplierView.getTextField();
			this.xtwo = probabilityMultiplierView.getTextField_1();
			this.xthree = probabilityMultiplierView.getTextField_2();
			this.xapply = probabilityMultiplierView.getBtnApplyChanges();
			
			
			final int[] numbers;
			numbers = new int[6];
			final int[] multi;
			multi = new int[3];
			
			
			probabilityBlockView.getBtnApplyChanges().addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
								
			int sum =0;
	        numbers[0] = Integer.parseInt(one.getText());
	      	numbers[1] = Integer.parseInt(two.getText());
	      	numbers[2]  = Integer.parseInt(three.getText());
	      	numbers[3]  = Integer.parseInt(four.getText());
	      	numbers[4]  = Integer.parseInt(five.getText());
	      	numbers[5]  = Integer.parseInt(six.getText());
	      	
	      	for ( int i=0; i<6; i++){
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
			
			probabilityMultiplierView.getBtnApplyChanges().addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					int sum = 0;
					multi[0] = Integer.parseInt(xone.getText());
					multi[1] = Integer.parseInt(xtwo.getText());
					multi[2] = Integer.parseInt(xthree.getText());
					
					for(int i = 0; i < 3; i++){
						if (multi[i] == (int)multi[i]){
			      			sum+=multi[i];
			      		}
			      		else{
			      			System.out.println(multi[i]+ "is not a number");	      			
			      		}
					}
					
					if(sum != 100){
						System.out.println("Your numbers do not add up to 100.");
					}
					
					else{
						probability.setProbx1(multi[0]);
						probability.setProbx2(multi[1]);
						probability.setProbx3(multi[2]);
					}				
				}
				
			});
		}
		
	}


