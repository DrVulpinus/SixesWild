package src;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class PuzzleStatsView extends StatsView{

	public PuzzleStatsView(LevelStats stats) {
		super();
		
		
	}
		private JPanel getpanel() {
			JPanel panel = new JPanel();
			panel.setBackground(SystemColor.inactiveCaptionBorder);
			panel.setBorder(new LineBorder(Color.GREEN, 7, true));
			//panel.setBounds(10, 26, 112, 34);
			{
				JLabel lblNewLabel = new JLabel("Puzzle Mode");
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
				panel.add(lblNewLabel);
			}
			return panel;
		}

		// TODO Auto-generated constructor stub
	}


