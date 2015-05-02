package forms;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class AdjustStarView extends JPanel{
	private JPanel panel;
	private JLabel label;
	private JTextField textField;
	private JPanel panel_1;
	private JLabel label_1;
	private JTextField textField_1;
	private JPanel panel_2;
	private JLabel label_2;
	private JTextField textField_2;
	private JButton btnApplyChanges;
	public AdjustStarView() {
		setLayout(new MigLayout("", "[][grow][30.00][264.00,grow][146.00][59.00][-127.00,grow]", "[42.00][32.00][center][][][]"));
		add(getPanel(), "cell 3 1,grow");
		add(getPanel_1(), "cell 3 2,grow");
		add(getPanel_2(), "cell 3 3,grow");
		add(getBtnApplyChanges(), "cell 3 4");
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.add(getLabel());
			panel.add(getTextField());
		}
		return panel;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("1:");
		}
		return label;
	}
	public JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setText("1000");
			textField.setColumns(10);
		}
		return textField;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.add(getLabel_1());
			panel_1.add(getTextField_1());
		}
		return panel_1;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("2:");
		}
		return label_1;
	}
	public JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setText("2000");
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.add(getLabel_2());
			panel_2.add(getTextField_2());
		}
		return panel_2;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("3:");
		}
		return label_2;
	}
	public JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setText("3000");
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	public JButton getBtnApplyChanges() {
		if (btnApplyChanges == null) {
			btnApplyChanges = new JButton("Apply Changes");
		}
		return btnApplyChanges;
	}
}
