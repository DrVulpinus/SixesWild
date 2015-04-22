package forms;

import javax.swing.JPanel;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;

public class MenuView extends JPanel {
	private JButton btnCreateNewLevel;

	/**
	 * Create the panel.
	 */
	public MenuView() {
		setLayout(new MigLayout("", "[433.00px,center]", "[285.00px,center]"));
		add(getBtnCreateNewLevel(), "cell 0 0,alignx center,aligny center");

	}
	JButton getBtnCreateNewLevel() {
		if (btnCreateNewLevel == null) {
			btnCreateNewLevel = new JButton("Create New Level");
		}
		return btnCreateNewLevel;
	}
}
