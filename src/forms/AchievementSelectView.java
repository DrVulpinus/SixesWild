package forms;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;

/**
 * The achievements screen. Shows the number of stars obtained per level.
 * @author Miya
 *
 */
public class AchievementSelectView extends SelectView{

	private JLabel lblLvlIcon;
	private JLabel lblLvlNumber;
	private JLabel lblStar;
	private JLabel lblStar_1;
	private JLabel lblStar_2;
	private JButton btnBack;

	public AchievementSelectView() {
		// create the layout
		setLayout(new MigLayout("", "[][][][][][][][][][][][grow]", "[][][][][][][][][][][][][grow]"));
		add(getLblLvlIcon(), "cell 0 0");
		add(getLblLvlNumber(), "cell 1 0");
		add(getLblStar(), "cell 3 0");
		add(getLblStar_1(), "cell 5 0");
		add(getLblStar_2(), "cell 7 0");
		add(getBtnBack(), "cell 10 0");
	}

	//TODO
	@Override
	void loadItems() {
	}

	/**
	 * @return lblLvlIcon The label containing the icon for a level.
	 */
	private JLabel getLblLvlIcon() {
		if (lblLvlIcon == null) {
			lblLvlIcon = new JLabel("");
			lblLvlIcon.setIcon(new ImageIcon(AchievementSelectView.class.getResource("/Images/Level_Label_Puzzle copy.png")));
		}
		return lblLvlIcon;
	}
	
	/**
	 * @return lblLvlNumber The label containing the text describing the level number.
	 */
	private JLabel getLblLvlNumber() {
		if (lblLvlNumber == null) {
			lblLvlNumber = new JLabel("Level 1:");
		}
		return lblLvlNumber;
	}
	
	/**
	 * @return lblStar The label containing the image for the first star.
	 */
	private JLabel getLblStar() {
		if (lblStar == null) {
			lblStar = new JLabel("Star 1");
		}
		return lblStar;
	}

	/**
	 * @return lblStar_1 The label containing the image for the second star.
	 */
	private JLabel getLblStar_1() {
		if (lblStar_1 == null) {
			lblStar_1 = new JLabel("Star 2");
		}
		return lblStar_1;
	}
	
	/**
	 * @return lblStar_2 The label containing the image for the third star.
	 */
	private JLabel getLblStar_2() {
		if (lblStar_2 == null) {
			lblStar_2 = new JLabel("Star 3");
		}
		return lblStar_2;
	}
	/**
	 * @return btnBack The button to back to the main menu.
	 */
	public JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
		}
		return btnBack;
	}
}
