package src;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
//import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

//import net.miginfocom.swing.MigLayout;

//import java.awt.BorderLayout;

public class TestJPanel extends JPanel {
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	public TestJPanel() {
		//Image image = icon.getImage().getScaledInstance(contentPane.getWidth(), contentPane.getHeight(), java.awt.Image.SCALE_SMOOTH);
		
		setLayout(null);
		add(getpanel());
		add(getlblPuzzle());
		add(getpanel_1());
		add(getpanel_2());
		add(getpanel_3());
		add(getlblStarCount());
		add(getlblMovesLeft());
		add(getlblPoints());
		
	}
	
	
	private JPanel getpanel() {
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBorder(new LineBorder(Color.GREEN, 7, true));
		panel.setBounds(10, 26, 112, 34);
		{
			JLabel lblNewLabel = new JLabel("Puzzle Mode");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
			panel.add(lblNewLabel);
		}
		return panel;
	}
	
	private JLabel getlblPuzzle() {
		JLabel lblPuzzle = new JLabel("Puzzle Mode");
		lblPuzzle.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		return lblPuzzle;
	}
	
	private JPanel getpanel_1() {
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(28, 225, 73, 28);
		{
			textField_3 = new JTextField();
			textField_3.setHorizontalAlignment(SwingConstants.CENTER);
			panel_1.add(textField_3);
			textField_3.setLocation(10, 387);
			textField_3.setEditable(false);
			textField_3.setText("0");
			textField_3.setColumns(10);
		}
		
		return panel_1;
	}
	

	
	private JPanel getpanel_2(){
	JPanel panel_2 =new JPanel();
	panel_2.setBackground(SystemColor.inactiveCaptionBorder);
	panel_2.setBounds(37, 72, 64, 101);
	{
		JProgressBar progressBar = new JProgressBar();
		progressBar.setOrientation(SwingConstants.VERTICAL);
		panel_2.add(progressBar);
	}
	return panel_2;
	}
	
	private JPanel getpanel_3(){
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 275, 128, 28);
		{
			textField_4 = new JTextField();
			textField_4.setHorizontalAlignment(SwingConstants.CENTER);
			panel_3.add(textField_4);
			textField_4.setEditable(false);
			textField_4.setText("20");
			textField_4.setColumns(10);
		}
		return panel_3;
	}
	
	
	private JLabel getlblStarCount(){
	JLabel lblStarCount = new JLabel("Star Count");
	lblStarCount.setFont(new Font("Tahoma", Font.PLAIN, 12));
	lblStarCount.setBounds(37, 185, 64, 28);
	return lblStarCount;
	}
	
	private JLabel getlblMovesLeft(){
	JLabel lblMovesLeft = new JLabel("Moves Left:");
	lblMovesLeft.setBounds(28, 253, 94, 15);
	
	return lblMovesLeft;
	
	}
	private JLabel getlblPoints(){
	JLabel lblPoints = new JLabel("Points:");
	lblPoints.setBounds(47, 210, 43, 13);
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