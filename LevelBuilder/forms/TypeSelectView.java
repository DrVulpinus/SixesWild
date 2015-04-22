package forms;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class TypeSelectView extends JPanel{
	private JPanel panel;
	private JRadioButton rdbtnPuzzle;
	private JPanel panel_1;
	private JRadioButton rdbtnLightning;
	private JPanel panel_2;
	private JRadioButton rdbtnRelease;
	private JPanel panel_3;
	private JRadioButton rdbtnElimination;
	public TypeSelectView() {
		setLayout(new MigLayout("", "[][grow][19.00][262.00,grow][][][grow]", "[8.00][43.00,fill][49.00][39.00][44.00][43.00]"));
		add(getPanel_1(), "cell 3 1,grow");
		add(getPanel_1_1(), "cell 3 2,grow");
		add(getPanel_2(), "cell 3 3,grow");
		add(getPanel_3(), "cell 3 4,grow");
	}
	private JPanel getPanel_1() {
		if (panel == null) {
			panel = new JPanel();
			panel.add(getRdbtnPuzzle());
		}
		return panel;
	}
	private JRadioButton getRdbtnPuzzle() {
		if (rdbtnPuzzle == null) {
			rdbtnPuzzle = new JRadioButton("Puzzle");
		}
		return rdbtnPuzzle;
	}
	private JPanel getPanel_1_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.add(getRdbtnLightning());
		}
		return panel_1;
	}
	private JRadioButton getRdbtnLightning() {
		if (rdbtnLightning == null) {
			rdbtnLightning = new JRadioButton("Lightning");
			rdbtnLightning.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return rdbtnLightning;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.add(getRdbtnRelease());
		}
		return panel_2;
	}
	private JRadioButton getRdbtnRelease() {
		if (rdbtnRelease == null) {
			rdbtnRelease = new JRadioButton("Release");
			rdbtnRelease.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return rdbtnRelease;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.add(getRdbtnElimination());
		}
		return panel_3;
	}
	private JRadioButton getRdbtnElimination() {
		if (rdbtnElimination == null) {
			rdbtnElimination = new JRadioButton("Elimination");
		}
		return rdbtnElimination;
	}
}
