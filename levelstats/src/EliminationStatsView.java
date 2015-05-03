package src;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import net.miginfocom.swing.MigLayout;
import entities.MoveRegular;


public class EliminationStatsView extends JPanel {
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_5;
	private MoveRegular moveRegular;
	private EliminationStats eliminationStats;
	String score;
	
	public EliminationStatsView(){
		setLayout(new MigLayout("", "[grow,center]", "[center][29.00,grow][27.00,grow][grow][11.00][17.00][29.00][23.00][25.00]"));
		//Image image = icon.getImage().getScaledInstance(contentPane.getWidth(), contentPane.getHeight(), java.awt.Image.SCALE_SMOOTH);
		eliminationStats = new EliminationStats(0,30);
		score = Integer.toString(eliminationStats.getScore());
		add(getpanel(), "cell 0 0,aligny top");
		{
			JPanel panel = new JPanel();
			add(panel, "cell 0 1,grow");
			{
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setIcon(new ImageIcon(EliminationStatsView.class.getResource("/Images/star icon.png")));
				panel.add(lblNewLabel_1);
			}
			{
				textField = new JTextField();
				textField.setText("1000");
				panel.add(textField);
				textField.setColumns(10);
				textField.setEditable(false);
			}
		}
		{
			JPanel panel = new JPanel();
			add(panel, "cell 0 2,grow");
			{
				JLabel lblNewLabel_2 = new JLabel("");
				lblNewLabel_2.setIcon(new ImageIcon(EliminationStatsView.class.getResource("/Images/star icon.png")));
				panel.add(lblNewLabel_2);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("");
				lblNewLabel_3.setIcon(new ImageIcon(EliminationStatsView.class.getResource("/Images/star icon.png")));
				panel.add(lblNewLabel_3);
			}
			{
				textField_1 = new JTextField();
				textField_1.setText("2000");
				panel.add(textField_1);
				textField_1.setColumns(10);
				textField_1.setEditable(false);
			}
		}
		{
			JPanel panel = new JPanel();
			add(panel, "cell 0 3,grow");
			{
				JLabel lblNewLabel_4 = new JLabel("");
				lblNewLabel_4.setIcon(new ImageIcon(EliminationStatsView.class.getResource("/Images/star icon.png")));
				panel.add(lblNewLabel_4);
			}
			{
				JLabel lblNewLabel_5 = new JLabel("");
				lblNewLabel_5.setIcon(new ImageIcon(EliminationStatsView.class.getResource("/Images/star icon.png")));
				panel.add(lblNewLabel_5);
			}
			{
				JLabel lblNewLabel_6 = new JLabel("");
				lblNewLabel_6.setIcon(new ImageIcon(EliminationStatsView.class.getResource("/Images/star icon.png")));
				panel.add(lblNewLabel_6);
			}
			{
				textField_5 = new JTextField();
				textField_5.setText("3000");
				panel.add(textField_5);
				textField_5.setColumns(10);
				textField_5.setEditable(false);
			}
		}
		add(getpanel_1(), "cell 0 6");
		add(getpanel_3(), "cell 0 8");
		add(getlblMarked(), "cell 0 7");
		add(getlblPoints(), "cell 0 5");

	}




	public JPanel getpanel_1() {
		JPanel panel_1 = new JPanel();
		//panel_1.setBounds(28, 225, 73, 28);
		{
			textField_3 = new JTextField();
			int points = eliminationStats.getPoints();
//			System.out.print("ThESE ARE POINTS");
//			System.out.println(points);
			if (eliminationStats != null){
				System.out.println("THIS SHOULD WORK");
			}
			else{
				System.out.println("It's the points");
			}
			int initialscore = eliminationStats.getScore();
			System.out.println("initialScore");
			System.out.println(initialscore);
			int newscore;
			
			System.out.println(score);
			if(score != null){
				if(eliminationStats.updating){
					System.out.print("ThESE ARE POINTS");
					System.out.println(points);
					newscore = points + initialscore;
					score = Integer.toString(newscore);
					textField_3.setText(score);
				}
				textField_3.setText(score);
			}
			else{
				System.out.println("ERRoR");}
			textField_3.setHorizontalAlignment(SwingConstants.CENTER);
			panel_1.add(textField_3);
			textField_3.setLocation(10, 387);
			textField_3.setEditable(false);
			if(eliminationStats!= null){
			
//			String points = String.valueOf((eliminationStats.getScore()));
//			System.out.println(points);
//			textField_3.setText(points);
			textField_3.setColumns(10);
			}
		}

		return panel_1;
	}
	
	public JTextField getTextField_3(){
		return textField_3;
	}
	private JPanel getpanel_3(){
		JPanel panel_3 = new JPanel();
		//panel_3.setBounds(0, 275, 128, 28);
		{
			textField_4 = new JTextField();
			textField_4.setHorizontalAlignment(SwingConstants.CENTER);
			panel_3.add(textField_4);
			
			textField_4.setEditable(false);
			
			if (eliminationStats != null){
			String numMovesLeft = String.valueOf((eliminationStats.getNumMarkedSquares()));
			
			textField_4.setText(numMovesLeft);
//			textField_4.setText("30");
			textField_4.setColumns(10);
			}
		}
		return panel_3;
	}

	private JLabel getlblMarked(){
		JLabel lblMarked = new JLabel("Marked Squares:");
		//lblMovesLeft.setBounds(28, 253, 94, 15);

		return lblMarked;

	}
	private JLabel getlblPoints(){
		JLabel lblPoints = new JLabel("Score:");
		//lblPoints.setBounds(47, 210, 43, 13);
		return lblPoints;
	}
	
	private JPanel getpanel() {
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBorder(new LineBorder(Color.GREEN, 7, true));
		//panel.setBounds(10, 26, 112, 34);
		{
			JLabel lblNewLabel = new JLabel("Elimination Mode");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
			panel.add(lblNewLabel);
		}
		return panel;
	}


}
