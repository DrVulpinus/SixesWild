package forms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Image;

import javax.swing.SwingConstants;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Font;

public class SplashScreenView extends JFrame {

	private JPanel contentPane;
	private JLabel lblTeamPhoebe;
	private JLabel lblTeamPhoebe1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					SplashScreenView frame = new SplashScreenView();
					frame.setVisible(true);
					//Thread.sleep(10000);
					//frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			}
		});
	}

	// Set splash screen on timer go to main men
	
	
	
	/**
	 * Create the frame.
	 */
	public SplashScreenView() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getLblTeamPhoebe(), BorderLayout.CENTER);
		setSize(500, 350);
		setResizable(false);
		
		
	}
	private JLabel getLblTeamPhoebe() {
		if (lblTeamPhoebe == null) {
			lblTeamPhoebe = new JLabel("");
			lblTeamPhoebe.addComponentListener(new ComponentAdapter() {
				@Override
				public void componentResized(ComponentEvent e) {
					lblTeamPhoebe.setHorizontalAlignment(SwingConstants.CENTER);
					
					//ImageIcon icon = new ImageIcon ("phoebe_pigeon.gif");
					ImageIcon icon = new ImageIcon ("phoebe_better.png");
					Image image = icon.getImage().getScaledInstance(contentPane.getWidth(), contentPane.getHeight(), java.awt.Image.SCALE_SMOOTH);
					icon =new ImageIcon(image);
					lblTeamPhoebe.setIcon(icon);
				}
			});
			
		}
		return lblTeamPhoebe;
	}
	
}
