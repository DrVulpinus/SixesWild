package forms;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SplashWinView extends JFrame{
	private JPanel contentPane;
	JLabel lblYouWin;
	
	public SplashWinView() {	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		
		contentPane = new JPanel(); 
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblYouWin = new JLabel("You Win!");
		lblYouWin.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouWin.setFont(new Font("Lucida",Font.PLAIN,30));
		contentPane.add(lblYouWin, BorderLayout.CENTER);
		
		setSize(500, 350);
		setLocationRelativeTo(null);
		setResizable(false);
		setUndecorated(true);
	}
	
}
