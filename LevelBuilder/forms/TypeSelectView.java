package forms;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

/**
 * The View to select what type of Level you would like to build
 * @author agyness
 */
public class TypeSelectView extends JPanel{
	/* Panel for containing JRadioButton for Puzzle */
	private JPanel panel;
	/* Button for choosing to build Puzzle */
	private JRadioButton rdbtnPuzzle;
	/* Panel for containing JRadioButton for Lightning */
	private JPanel panel_1;
	/* Button for choosing to build Lightning */
	private JRadioButton rdbtnLightning;
	/* Panel for containing JRadioButton for Release */
	private JPanel panel_2;
	/* Button for choosing to build Release */
	private JRadioButton rdbtnRelease;
	/* Panel for containing JRadioButton for Elimination */
	private JPanel panel_3;
	/* Button for choosing to build Elimination */
	private JRadioButton rdbtnElimination;
	/* constructor for TypeSelectView */
	public TypeSelectView() {
		setLayout(new MigLayout("", "[][grow][19.00][262.00,grow][][][grow]", "[8.00][43.00,fill][49.00][39.00][44.00][43.00]"));
		add(getPanel_1(), "cell 3 1,grow");
		add(getPanel_1_1(), "cell 3 2,grow");
		add(getPanel_2(), "cell 3 3,grow");
		add(getPanel_3(), "cell 3 4,grow");
	}
	/**
	 * Panel for containing JRadioButton for Puzzle 
	 * @return JPanel
	 */
	private JPanel getPanel_1() {
		if (panel == null) {
			panel = new JPanel();
			panel.add(getRdbtnPuzzle());
		}
		return panel;
	}
	/**
	 * Button for choosing Puzzle 
	 * @return JRadioButton
	 */
	public JRadioButton getRdbtnPuzzle() {
		if (rdbtnPuzzle == null) {
			rdbtnPuzzle = new JRadioButton("Puzzle");
		}
		return rdbtnPuzzle;
	}
	/**
	 * Panel for containing JRadioButton for Lightning 
	 * @return JPanel
	 */
	private JPanel getPanel_1_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.add(getRdbtnLightning());
		}
		return panel_1;
	}
	/**
	 * Button for choosing Lightning 
	 * @return JRadioButton
	 */
	public JRadioButton getRdbtnLightning() {
		if (rdbtnLightning == null) {
			rdbtnLightning = new JRadioButton("Lightning");
			rdbtnLightning.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return rdbtnLightning;
	}
	/**
	 * Panel for containing JRadioButton for Release 
	 * @return JPanel
	 */
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.add(getRdbtnRelease());
		}
		return panel_2;
	}
	/**
	 * Button for choosing Release 
	 * @return JRadioButton
	 */
	public JRadioButton getRdbtnRelease() {
		if (rdbtnRelease == null) {
			rdbtnRelease = new JRadioButton("Release");
			rdbtnRelease.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return rdbtnRelease;
	}
	/**
	 * Panel for containing JRadioButton for Elimination 
	 * @return JPanel
	 */
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.add(getRdbtnElimination());
		}
		return panel_3;
	}
	/**
	 * Button for choosing Elimination 
	 * @return JRadioButton
	 */
	public JRadioButton getRdbtnElimination() {
		if (rdbtnElimination == null) {
			rdbtnElimination = new JRadioButton("Elimination");
		}
		return rdbtnElimination;
	}
}
