package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import entities.Move;
import forms.SpecialMoveView;

public class SelectMoveController implements ActionListener {
	
SpecialMoveView moveView = new SpecialMoveView();
JButton swap;
JButton remove;
JButton reset;

		public SelectMoveController( JButton swap, JButton remove , JButton reset ) {
		
		    
		        this.swap = new JButton("1");
		        this.swap.addActionListener(this);
		        this.swap = swap;
		        
		        this.remove = new JButton("2");
		        this.remove.addActionListener(this);
		        this.remove = remove;
		        
		        this.reset = new JButton("3");
		        this.reset.addActionListener(this);
		        this.remove = remove;
		    }

		public void mousePressed (java.awt.event.MouseEvent me) {

				
			switch(button){
			
			
			
			
			}
		}


	

		
	}	
	
	
	
	

