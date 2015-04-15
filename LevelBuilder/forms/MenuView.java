package forms;

import javax.swing.JPanel;
import javax.swing.JButton;

public class MenuView extends JPanel {
	private JButton btnCreateNewLevel;

	/**
	 * Create the panel.
	 */
	public MenuView() {
		setLayout(null);
		add(getBtnCreateNewLevel());

	}
	JButton getBtnCreateNewLevel() {
		if (btnCreateNewLevel == null) {
			btnCreateNewLevel = new JButton("Create New Level");
			btnCreateNewLevel.setBounds(69, 147, 302, 23);
		}
		return btnCreateNewLevel;
	}
}
