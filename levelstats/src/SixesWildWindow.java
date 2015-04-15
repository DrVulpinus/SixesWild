package src;

import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;

public class SixesWildWindow extends JFrame{

	static LevelStats stats;
	static LevelStatsView statsview;
	private JTextField textField;
	private JTextField textField_1;
	
	public SixesWildWindow() {
		setSize(800, 600);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBorder(new LineBorder(Color.GREEN, 7, true));
		panel.setBounds(10, 26, 207, 61);
		getContentPane().add(panel);
		
		JLabel lblPuzzle = new JLabel("Puzzle Mode");
		lblPuzzle.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel.add(lblPuzzle);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 387, 207, 43);
		getContentPane().add(panel_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		panel_1.add(textField);
		textField.setText("0");
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2.setBounds(10, 121, 207, 164);
		getContentPane().add(panel_2);
		
		JProgressBar progressBar = new JProgressBar(JProgressBar.VERTICAL);
		panel_2.add(progressBar);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 496, 207, 34);
		getContentPane().add(panel_3);
		
		textField_1 = new JTextField();
		panel_3.add(textField_1);
		textField_1.setEditable(false);
		textField_1.setText("20");
		textField_1.setColumns(10);
		
		JLabel lblStarCount = new JLabel("Star Count");
		lblStarCount.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblStarCount.setBounds(79, 282, 100, 34);
		getContentPane().add(lblStarCount);
		
		JLabel lblMovesLeft = new JLabel("Moves Left:");
		lblMovesLeft.setBounds(85, 470, 94, 15);
		getContentPane().add(lblMovesLeft);
		
		JLabel lblPoints = new JLabel("Points:");
		lblPoints.setBounds(95, 362, 74, 14);
		getContentPane().add(lblPoints);
	}
	
	public static void main(String[] arg) {
		stats = new LevelStats();
		statsview = new LevelStatsView(stats);
		
		SixesWildWindow w = new SixesWildWindow();
		//w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setVisible(true);
	}
}
