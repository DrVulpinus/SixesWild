package forms;

import java.awt.BorderLayout;
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

public class SplashScreenView extends JFrame {

	private JPanel contentPane;
	private JLabel lblTeamPhoebe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SplashScreenView frame = new SplashScreenView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SplashScreenView() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getLblTeamPhoebe(), BorderLayout.CENTER);
		
	}
	private JLabel getLblTeamPhoebe() {
		if (lblTeamPhoebe == null) {
			lblTeamPhoebe = new JLabel("");
			lblTeamPhoebe.addComponentListener(new ComponentAdapter() {
				@Override
				public void componentResized(ComponentEvent e) {
					lblTeamPhoebe.setHorizontalAlignment(SwingConstants.CENTER);
					
					ImageIcon icon = new ImageIcon ("phoebe_pigeon.gif");
					Image image = icon.getImage().getScaledInstance(contentPane.getWidth(), contentPane.getHeight(), java.awt.Image.SCALE_SMOOTH);
					icon =new ImageIcon(image);
					lblTeamPhoebe.setIcon(icon);
				}
			});
			
		}
		return lblTeamPhoebe;
	}
	
}