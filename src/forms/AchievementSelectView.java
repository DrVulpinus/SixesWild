package forms;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class AchievementSelectView extends SelectView{
	private JLabel lblLvlIcon;
	private JLabel lblLvlNumber;
	private JLabel lblStar;
	private JLabel lblStar_1;
	private JLabel lblStar_2;
	private JButton btnBack;
	public AchievementSelectView() {
		setLayout(new MigLayout("", "[][][][][][][][][][][][grow]", "[][][][][][][][][][][][][grow]"));
		add(getLblLvlIcon(), "cell 0 0");
		add(getLblLvlNumber(), "cell 1 0");
		add(getLblStar(), "cell 3 0");
		add(getLblStar_1(), "cell 5 0");
		add(getLblStar_2(), "cell 7 0");
		add(getBtnBack(), "cell 10 0");
	}

	@Override
	void loadItems() {
		// TODO Auto-generated method stub
		
	}

	private JLabel getLblLvlIcon() {
		if (lblLvlIcon == null) {
			lblLvlIcon = new JLabel("");
			lblLvlIcon.setIcon(new ImageIcon(AchievementSelectView.class.getResource("/Images/Level_Label_Puzzle copy.png")));
		}
		return lblLvlIcon;
	}
	private JLabel getLblLvlNumber() {
		if (lblLvlNumber == null) {
			lblLvlNumber = new JLabel("Level 1:");
		}
		return lblLvlNumber;
	}
	private JLabel getLblStar() {
		if (lblStar == null) {
			lblStar = new JLabel("Star 1");
		}
		return lblStar;
	}
	private JLabel getLblStar_1() {
		if (lblStar_1 == null) {
			lblStar_1 = new JLabel("Star 2");
		}
		return lblStar_1;
	}
	private JLabel getLblStar_2() {
		if (lblStar_2 == null) {
			lblStar_2 = new JLabel("Star 3");
		}
		return lblStar_2;
	}
	public JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
		}
		return btnBack;
	}
}
