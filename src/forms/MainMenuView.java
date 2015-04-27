package forms;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class MainMenuView extends JPanel {
	private JButton btnLevel;
	private JButton btnAchievments;

	/**
	 * Create the panel.
	 */
	public MainMenuView() {
		setLayout(new MigLayout("", "[grow][grow][grow][grow]", "[grow][grow][grow]"));
		add(getBtnLevel(), "cell 1 1,grow");
		add(getBtnAchievments(), "cell 2 1,grow");

	}
	JButton getBtnLevel() {
		if (btnLevel == null) {
			btnLevel = new JButton("Level");
		}
		return btnLevel;
	}
	JButton getBtnAchievments() {
		if (btnAchievments == null) {
			btnAchievments = new JButton("Achievments");
		}
		return btnAchievments;
	}
}
