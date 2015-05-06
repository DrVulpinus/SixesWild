package boundaries;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GraphicsDevice.WindowTranslucency;

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


/**
 * Contains the JLabel that is the splash screen, which appears for several seconds.
 *
 */
public class SplashScreenView extends JFrame {

	// panel that contains the splash screen label
	private JPanel contentPane;

	// label that contains the splash screen image
	private JLabel lblTeamPhoebe;

	/**
	 * Create the frame.
	 */
	public SplashScreenView() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 307);

		// create the contentPane
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		// place the image in the contentPane
		contentPane.add(getLblTeamPhoebe(), BorderLayout.CENTER);

		// splash screen should not be interactive
		setSize(500, 350);
		setLocationRelativeTo(null);
		setResizable(false);
		setUndecorated(true);

	}

	/**
	 * Gets the label containing the image, and generates it in the center of the screen.
	 * @return lblTeamPhoebe The JLabel that contains the image of the splash screen.
	 */
	private JLabel getLblTeamPhoebe() {
		if (lblTeamPhoebe == null) {
			lblTeamPhoebe = new JLabel("");

			// readjust to look nice
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
