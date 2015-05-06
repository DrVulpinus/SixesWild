package boundaries;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

/**
 * The main menu screen. Contains a button called Level.
 * 
 * @author Miya Gaskell
 */
public class MainMenuView extends JPanel {
	private JButton btnLevel;
	private JButton btnAchievments;

	/**
	 * Create the panel.
	 */
	public MainMenuView() {
		setLayout(new MigLayout("", "[grow][grow][grow][grow]", "[grow][grow][grow]"));
		add(getBtnLevel(), "cell 1 1,grow");

	}

	/**
	 * @return btnLevel The button that calls the level selection screen when pressed.
	 */
	JButton getBtnLevel() {
		if (btnLevel == null) {
			btnLevel = new JButton("Level");
		}
		return btnLevel;
	}

}
