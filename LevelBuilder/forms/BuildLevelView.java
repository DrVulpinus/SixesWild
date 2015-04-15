package forms;

import javax.swing.AbstractButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.FlowLayout;

import javax.swing.border.BevelBorder;

import src.TestJPanel;

import java.awt.Color;

import javax.swing.JButton;

public class BuildLevelView extends JPanel{
	
	
	private JMenuBar menuBar;
	private JMenuItem mntmAddBlock;
	private JMenuItem mntmRemoveBlock;
	private JMenuItem mntmAddMove;
	private JMenuItem mntmRemoveMove;
	private JMenuItem mntmEditProbability;
	private JMenuItem mntmEditWinConditions;
	private JMenuBar menuBar_1;
	private JMenuItem mntmEditGameType;
	private JMenuItem mntmEditStarPoints;
	private JButton btnExitWithoutSaving;
	public BuildLevelView() {
		setLayout(null);
		add(getMenuBar());
		add(getMenuBar_1());
		
		GameGridView gameGridView = new GameGridView();
		gameGridView.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		gameGridView.setBounds(150, 73, 359, 360);
		add(gameGridView);
		
		SpecialMoveView specialMoveView = new SpecialMoveView();
		specialMoveView.setBounds(514, 167, 155, 137);
		add(specialMoveView);
		
		TestJPanel testJPanel = new TestJPanel();
		testJPanel.setBounds(0, 73, 143, 360);
		add(testJPanel);
		add(getBtnExitWithoutSaving());
		
	}

	public JButton getBtnExitWithoutSaving() {
		if (btnExitWithoutSaving == null) {
			btnExitWithoutSaving = new JButton("Exit Without Saving");
			btnExitWithoutSaving.setSize(146, 29);
			btnExitWithoutSaving.setLocation(514, 369);
		}
		return btnExitWithoutSaving;
	}
	
	private JMenuBar getMenuBar() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBounds(29, 5, 611, 24);
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
			menuBar_1.setBounds(10, 40, 700, 24);
			menuBar_1.add(getMntmEditProbability());
			menuBar_1.add(getMntmEditWinConditions());
			menuBar_1.add(getMntmEditGameType());
			menuBar_1.add(getMntmEditStarPoints());
		}
		return menuBar_1;
	}
	private JMenuItem getMntmEditGameType() {
		if (mntmEditGameType == null) {
			mntmEditGameType = new JMenuItem("Edit Game Type");
		}
		return mntmEditGameType;
	}
	private JMenuItem getMntmEditStarPoints() {
		if (mntmEditStarPoints == null) {
			mntmEditStarPoints = new JMenuItem("Edit Star Points");
		}
		return mntmEditStarPoints;
	}
	/*
	public JButton getBtnExitWithoutSaving() {
		if (btnExitWithoutSaving == null) {
			btnExitWithoutSaving = new JButton("Exit Without Saving");
			btnExitWithoutSaving.setBounds(519, 360, 140, 23);
		}
		return btnExitWithoutSaving;
	}
	*/

}
