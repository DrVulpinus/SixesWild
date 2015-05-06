package forms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

/**
 * The view that contains the GUI that takes in user input for the textfields
 * containing the block value probabilities.
 * @author Miya Gaskell
 *
 */
public class ProbabilityBlockView extends JPanel{

	private JPanel panel;
	/* TextField for editing the probability of block 1 */
	private JTextField textField;
	private JLabel label;
	private JLabel label_1;
	private JPanel panel_1;
	private JLabel label_2;
	/* TextField for editing the probability of block 2 */
	private JTextField textField_1;
	private JLabel label_3;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel label_4;
	/* TextField for editing the probability of block 3 */
	private JTextField textField_2;
	private JLabel label_5;
	private JPanel panel_4;
	private JLabel label_6;
	/* TextField for editing the probability of block 4 */
	private JTextField textField_3;
	private JLabel label_7;
	private JLabel label_8;
	/* TextField for editing the probability of block 5 */
	private JTextField textField_4;
	private JLabel label_9;
	private JLabel label_10;
	/* TextField for editing the probability of block 6 */
	private JTextField textField_5;
	private JLabel label_11;
	private JPanel panel_6;
	private JLabel lblTotal;
	private JTextField textField_6;
	private JLabel label_12;
	/* JButton for applying changes */
	private JButton btnApplyChanges;
	/* JButton for closing the window */
	private JButton btnClose;


	public ProbabilityBlockView() {
		setLayout(new MigLayout("", "[][grow][304.00,grow][33.00,grow][grow]", "[][29.00][23.00][][][bottom][grow,bottom]"));
		add(getPanel(), "cell 2 0,grow");
		add(getPanel_1(), "cell 2 1,grow");
		add(getPanel_2(), "cell 2 2,grow");
		add(getPanel_3(), "cell 2 3,grow");
		add(getPanel_4(), "cell 2 4,grow");
		//add(getPanel_5(), "cell 2 5,grow");
		add(getBtnApplyChanges(), "flowx,cell 2 6");
		add(getPanel_6(), "cell 4 6,grow");
		add(getBtnClose(), "cell 2 6");
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.add(getLabel());
			panel.add(getTextField());
			panel.add(getLabel_1());
		}
		return panel;
	}
	public JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setText("0");
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("1:");
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("%");
		}
		return label_1;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.add(getLabel_2());
			panel_1.add(getTextField_1());
			panel_1.add(getLabel_3());
		}
		return panel_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("2:");
		}
		return label_2;
	}
	public JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setText("0");
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("%");
		}
		return label_3;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.add(getLabel_4());
			panel_2.add(getTextField_2());
			panel_2.add(getLabel_5());
		}
		return panel_2;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.add(getLabel_6());
			panel_3.add(getTextField_3());
			panel_3.add(getLabel_7());
		}
		return panel_3;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("3:");
		}
		return label_4;
	}
	public JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setText("0");
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("%");
		}
		return label_5;
	}
	private JPanel getPanel_4() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
			panel_4.add(getLabel_8());
			panel_4.add(getTextField_4());
			panel_4.add(getLabel_9());
		}
		return panel_4;
	}
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("4:");
		}
		return label_6;
	}
	public JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setText("0");
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JLabel getLabel_7() {
		if (label_7 == null) {
			label_7 = new JLabel("%");
		}
		return label_7;
	}
	//	private JPanel getPanel_5() {
	//		if (panel_5 == null) {
	//			panel_5 = new JPanel();
	//			panel_5.add(getLabel_10());
	//			panel_5.add(getTextField_5());
	//			panel_5.add(getLabel_11());
	//		}
	//		return panel_5;
	//	}
	private JLabel getLabel_8() {
		if (label_8 == null) {
			label_8 = new JLabel("5:");
		}
		return label_8;
	}
	public JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setText("0");
			textField_4.setColumns(10);
		}
		return textField_4;
	}
	private JLabel getLabel_9() {
		if (label_9 == null) {
			label_9 = new JLabel("%");
		}
		return label_9;
	}
	private JLabel getLabel_10() {
		if (label_10 == null) {
			label_10 = new JLabel("6:");
		}
		return label_10;
	}
	public JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setText("0");
			textField_5.setColumns(10);
		}
		return textField_5;
	}
	private JLabel getLabel_11() {
		if (label_11 == null) {
			label_11 = new JLabel("%");
		}
		return label_11;
	}
	private JPanel getPanel_6() {
		if (panel_6 == null) {
			panel_6 = new JPanel();
			panel_6.add(getLabel_12_1());
			panel_6.add(getTextField_6_1());
			panel_6.add(getLabel_12());
		}
		return panel_6;
	}
	private JLabel getLabel_12_1() {
		if (lblTotal == null) {
			lblTotal = new JLabel("Total:");
		}
		return lblTotal;
	}
	public JTextField getTextField_6_1() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setText("0");
			textField_6.setColumns(10);
			textField_6.setEditable(false);
		}
		return textField_6;
	}
	private JLabel getLabel_12() {
		if (label_12 == null) {
			label_12 = new JLabel("%");
		}
		return label_12;
	}
	public JButton getBtnApplyChanges() {
		if (btnApplyChanges == null) {
			btnApplyChanges = new JButton("Apply Changes");
			btnApplyChanges.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
		}
		return btnApplyChanges;
	}
	public JButton getBtnClose() {
		if (btnClose == null) {
			btnClose = new JButton("Close");
		}
		return btnClose;
	}
}
