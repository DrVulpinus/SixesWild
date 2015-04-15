package forms;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class BuildLevelView extends JPanel{
	private JMenuBar menuBar;
	private JMenuItem mntmAddBlock;
	private JMenuItem mntmRemoveBlock;
	private JMenuItem mntmAddMove;
	private JMenuItem mntmRemoveMove;
	private JMenuItem mntmEditProbability;
	private JMenuItem mntmEditWinConditions;
	private JMenuBar menuBar_1;
	public BuildLevelView() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		add(getMenuBar());
		add(getMenuBar_1());
	}

	private JMenuBar getMenuBar() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMntmAddBlock());
			menuBar.add(getMntmRemoveBlock());
			menuBar.add(getMntmAddMove());
			menuBar.add(getMntmRemoveMove());
		}
		return menuBar;
	}
	private JMenuItem getMntmAddBlock() {
		if (mntmAddBlock == null) {
			mntmAddBlock = new JMenuItem("Add Block");
		}
		return mntmAddBlock;
	}
	private JMenuItem getMntmRemoveBlock() {
		if (mntmRemoveBlock == null) {
			mntmRemoveBlock = new JMenuItem("Remove Block");
		}
		return mntmRemoveBlock;
	}
	private JMenuItem getMntmAddMove() {
		if (mntmAddMove == null) {
			mntmAddMove = new JMenuItem("Add Special Move");
		}
		return mntmAddMove;
	}
	private JMenuItem getMntmRemoveMove() {
		if (mntmRemoveMove == null) {
			mntmRemoveMove = new JMenuItem("Remove Special Move");
		}
		return mntmRemoveMove;
	}
	private JMenuItem getMntmEditProbability() {
		if (mntmEditProbability == null) {
			mntmEditProbability = new JMenuItem("Edit Probability");
		}
		return mntmEditProbability;
	}
	private JMenuItem getMntmEditWinConditions() {
		if (mntmEditWinConditions == null) {
			mntmEditWinConditions = new JMenuItem("Edit Win Conditions");
		}
		return mntmEditWinConditions;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar_1 == null) {
			menuBar_1 = new JMenuBar();
			menuBar_1.add(getMntmEditProbability());
			menuBar_1.add(getMntmEditWinConditions());
		}
		return menuBar_1;
	}
}
