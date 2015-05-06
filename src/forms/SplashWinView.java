package forms;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

public class SplashWinView extends JFrame{
	// panel that contains the splash screen label
		private JPanel contentPane;
		
	public SplashWinView() {
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblYouWin = new JLabel("You Win");
		lblYouWin.setFont(new Font("Lucida Grande", Font.PLAIN, 38));
		lblYouWin.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouWin.setHorizontalTextPosition(SwingConstants.CENTER);
		getContentPane().add(lblYouWin);
	}

	
	
	
}
