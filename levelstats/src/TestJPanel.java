package src;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import net.miginfocom.swing.MigLayout;

import java.awt.BorderLayout;

public class TestJPanel extends JPanel {
	public TestJPanel() {
		setLayout(null);
		add(getpanel());
		add(getlblPuzzle());
		add(getpanel_1());
		add(gettextField());
		add(getpanel_2());
		add(getprogressBar());
		add(getpanel_3());
		add(gettextField_1());
		add(getlblStarCount());
		add(getlblPuzzle());
		add(getpanel());
		add(getlblPuzzle());
	}
	
	private JPanel getpanel() {
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBorder(new LineBorder(Color.GREEN, 7, true));
		panel.setBounds(10, 26, 207, 61);
		return panel;
	}
	
	private JLabel getlblPuzzle() {
		JLabel lblPuzzle = new JLabel("Puzzle Mode");
		lblPuzzle.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		return lblPuzzle;
	}
	
	private JPanel getlblMoves() {
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 387, 207, 43);
	
		
		return panel_1;
	}
	
	private JTextField gettextField(){
	JTextField textField = new JTextField();
	textField.setEditable(false);
	textField.setText("0");
	textField.setColumns(10);
	return textField;
	}
	
	private JPanel getpanel_2(){
	JPanel panel_2 =new JPanel();
	panel_2.setBackground(SystemColor.inactiveCaptionBorder);
	panel_2.setBounds(10, 121, 207, 164);
	return panel_2;
	}
	
	private JProgressBar getprogressBar(){
	JProgressBar progressBar = new JProgressBar(JProgressBar.VERTICAL);
	return progressBar;
	}
	
	private JPanel getpanel_3(){
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 496, 207, 34);
		return panel_3;
	}
	
	private JTextField gettextField_1(){
		JTextField textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setText("20");
		textField_1.setColumns(10);	
		return textField_1;
		
	}
	
	private JLabel getlblStarCount(){
	JLabel lblStarCount = new JLabel("Star Count");
	lblStarCount.setFont(new Font("Tahoma", Font.PLAIN, 17));
	lblStarCount.setBounds(79, 282, 100, 34);
	return lblStarCount;
	}
	
	private JLabel getlblMovesLeft(){
	JLabel lblMovesLeft = new JLabel("Moves Left:");
	lblMovesLeft.setBounds(85, 470, 94, 15);
	
	return lblMovesLeft;
	
	}
	private JLabel getlblPoints(){
	JLabel lblPoints = new JLabel("Points:");
	lblPoints.setBounds(95, 362, 74, 14);
	return lblPoints;
	}
	
	
	public static void main(String[] arg) {
		//stats = new LevelStats();
		 //statsview = new LevelStatsView(stats);
		
		TestJPanel w = new TestJPanel();
		//w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setVisible(true);
	}
}