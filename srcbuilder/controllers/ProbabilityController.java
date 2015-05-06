package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import entities.Probability;
import forms.ProbabilityBlockView;
import forms.ProbabilityMultiplierView;
import forms.TypeSelectView;

/**
 * The controller that readjusts the GUI that allows the user to set the probability.
 * Readjusts the probability for individual block values and informs the user when
 * those probabilities do not add up to 100 percent.
 * @author Alex Wald
 * @author Agyness Liao
 *
 */
public class ProbabilityController {

	TypeSelectView typeSelectView = new TypeSelectView();
	Probability probability;
	JTextField one;
	JTextField two;
	JTextField three;
	JTextField four;
	JTextField five;
	JTextField six;
	JTextField xone;
	JTextField xtwo;
	JTextField xthree;
	JTextField total;
	JTextField xtotal;
	JButton apply;
	JButton xapply;
	

	public ProbabilityController(final ProbabilityBlockView probabilityBlockView, final ProbabilityMultiplierView probabilityMultiplierView,  final Probability probability) {
	
			this.one = probabilityBlockView.getTextField();
			this.two = probabilityBlockView.getTextField_1();
			this.three = probabilityBlockView.getTextField_2();
			this.four = probabilityBlockView.getTextField_3();
			this.five = probabilityBlockView.getTextField_4();
			this.six = probabilityBlockView.getTextField_5();
			this.total = probabilityBlockView.getTextField_6_1();
			this.apply = probabilityBlockView.getBtnApplyChanges();
			
			this.xone = probabilityMultiplierView.getTextField();
			this.xtwo = probabilityMultiplierView.getTextField_1();
			this.xthree = probabilityMultiplierView.getTextField_2();
			this.xtotal = probabilityMultiplierView.getTextField_3();
			this.xapply = probabilityMultiplierView.getBtnApplyChanges();
			
			this.probability = probability;
			
			
			final int[] numbers;
			numbers = new int[6];
			final int[] multi;
			multi = new int[3];
			
			// listens for input in the value probability text fields, and returns error messages if the case does not match
			probabilityBlockView.getBtnApplyChanges().addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
								
					int sum = 0;
					
					try {
				        numbers[0] = Integer.parseInt(one.getText());
				      	numbers[1] = Integer.parseInt(two.getText());
				      	numbers[2] = Integer.parseInt(three.getText());
				      	numbers[3] = Integer.parseInt(four.getText());
				      	numbers[4] = Integer.parseInt(five.getText());
				      	numbers[5] = 0;
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(probabilityBlockView, "One or more of the inputs is not a number.");	
						return;
					}
					
					for (int n = 0; n < 5; n++)
						sum += numbers[n];					
			      	
			      	total.setText(Integer.toString(sum));
			      	
			      	if(sum != 100){
			      		System.out.println("Your numbers do not add up to 100.");
			      		JOptionPane.showMessageDialog(probabilityBlockView, "Your numbers do not add up to 100.");
			      	}
			      	
			      	else{
			      		probability.setValueProbs(numbers);
			      		System.out.println("New Probability: " + probability);
			      		initializeTextFields();
			      	}
						}
			});
			
			// listens for input in the multiplier probability text fields, and returns error messages if the case does not match
			probabilityMultiplierView.getBtnApplyChanges().addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					int sum = 0;
					
					try {
						multi[0] = Integer.parseInt(xone.getText());
						multi[1] = Integer.parseInt(xtwo.getText());
						multi[2] = Integer.parseInt(xthree.getText());
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(probabilityMultiplierView, "One or more of the inputs is not a number.");	
						return;
					}
					
					for (int n = 0; n < 3; n++)
						sum += multi[n];
					
					xtotal.setText(Integer.toString(sum));
					
					if(sum != 100){
						System.out.println("Your numbers do not add up to 100.");
						JOptionPane.showMessageDialog(probabilityMultiplierView, "Your numbers do not add up to 100.");
					}
					
					else{
			      		probability.setMultProbs(multi);
			      		System.out.println("New Probability: " + probability);
			      		initializeTextFields();
					}				
				}
				
			});
			
			initializeTextFields();
		}
	
	
		public void initializeTextFields() {
			this.one.setText(Integer.toString(this.probability.getValueProb(1)));
			this.two.setText(Integer.toString(this.probability.getValueProb(2)));
			this.three.setText(Integer.toString(this.probability.getValueProb(3)));
			this.four.setText(Integer.toString(this.probability.getValueProb(4)));
			this.five.setText(Integer.toString(this.probability.getValueProb(5)));
			
			this.xone.setText(Integer.toString(this.probability.getMultProb(1)));
			this.xtwo.setText(Integer.toString(this.probability.getMultProb(2)));
			this.xthree.setText(Integer.toString(this.probability.getMultProb(3)));
			
			total.setText("100");
			xtotal.setText("100");
		}
		
}


