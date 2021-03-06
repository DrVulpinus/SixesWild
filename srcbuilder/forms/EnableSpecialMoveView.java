package forms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * The view that appears when the user requests to edit the special moves.
 * @author Miya Gaskell
 *
 */
public class EnableSpecialMoveView extends JPanel{
	private JPanel panel;
	/* checkbox for enabling remove special move */
	private JCheckBox chckbxRemoveSpecialMove;
	private JPanel panel_1;
	/* checkbox for enabling swap special move */
	private JCheckBox chckbxSwapSpecialMove;
	private JPanel panel_2;
	/* checkbox for enabling reset special move */
	private JCheckBox chckbxResetSpecialMove;
	private JLabel lblCheckToEnable;
	/* button for close the window */
	private JButton btnClose;
	public EnableSpecialMoveView() {
		setLayout(new MigLayout("", "[][-45.00][][-32.00][204.00,grow][][grow]", "[][][31.00][34.00][grow]"));
		add(getLblCheckToEnable(), "cell 4 0");
		add(getPanel(), "cell 4 1,grow");
		add(getPanel_1(), "cell 4 2,grow");
		add(getPanel_2(), "cell 4 3,grow");
		add(getBtnClose(), "cell 6 4");
		//addSettingListener();	
	}


	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.add(getChckbxRemoveSpecialMove());
		}
		return panel;
	}
	private JCheckBox getChckbxRemoveSpecialMove() {
		if (chckbxRemoveSpecialMove == null) {
			chckbxRemoveSpecialMove = new JCheckBox("Remove Special Move");
		}
		return chckbxRemoveSpecialMove;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.add(getChckbxSwapSpecialMove());
		}
		return panel_1;
	}
	private JCheckBox getChckbxSwapSpecialMove() {
		if (chckbxSwapSpecialMove == null) {
			chckbxSwapSpecialMove = new JCheckBox("Swap Special Move");
		}
		return chckbxSwapSpecialMove;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.add(getChckbxResetSpecialMove());
		}
		return panel_2;
	}
	private JCheckBox getChckbxResetSpecialMove() {
		if (chckbxResetSpecialMove == null) {
			chckbxResetSpecialMove = new JCheckBox("Reset Special Move");
		}
		return chckbxResetSpecialMove;
	}
	private JLabel getLblCheckToEnable() {
		if (lblCheckToEnable == null) {
			lblCheckToEnable = new JLabel("Check to enable special move:");
		}
		return lblCheckToEnable;
	}
	public JButton getBtnClose() {
		if (btnClose == null) {
			btnClose = new JButton("Close");
		}
		return btnClose;
	}
}
