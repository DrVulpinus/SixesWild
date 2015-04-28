package forms;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ProbabilityMultiplierView extends JPanel{
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel label;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel label_1;
	private JPanel panel_2;
	private JLabel lblX;
	private JTextField textField_2;
	private JLabel label_2;
	private JButton btnApplyChanges;
	private JLabel lblTotal;
	private JTextField textField_3;
	private JLabel label_3;
	public ProbabilityMultiplierView() {
		setLayout(new MigLayout("", "[][55.00][209.00,grow][grow]", "[31.00][fill][][][]"));
		add(getPanel(), "cell 2 0,grow");
		add(getPanel_1(), "cell 2 1,grow");
		add(getPanel_2(), "cell 2 2,grow");
		add(getBtnApplyChanges(), "cell 1 4");
		add(getLblTotal(), "flowx,cell 3 4");
		add(getTextField_3(), "cell 3 4");
		add(getLabel_3(), "cell 3 4");
	}
	

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.add(getLblNewLabel());
			panel.add(getTextField());
			panel.add(getLabel());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("x1:");
		}
		return lblNewLabel;
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
			label = new JLabel("%");
		}
		return label;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.add(getLblNewLabel_1());
			panel_1.add(getTextField_1());
			panel_1.add(getLabel_1());
		}
		return panel_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("x2:");
		}
		return lblNewLabel_1;
	}
	public JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setText("0");
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("%");
		}
		return label_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.add(getLblX());
			panel_2.add(getTextField_2());
			panel_2.add(getLabel_2());
		}
		return panel_2;
	}
	private JLabel getLblX() {
		if (lblX == null) {
			lblX = new JLabel("x3:");
		}
		return lblX;
	}
	public JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setText("0");
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("%");
		}
		return label_2;
	}
	public JButton getBtnApplyChanges() {
		if (btnApplyChanges == null) {
			btnApplyChanges = new JButton("Apply Changes");
		}
		return btnApplyChanges;
	}
	private JLabel getLblTotal() {
		if (lblTotal == null) {
			lblTotal = new JLabel("Total:");
		}
		return lblTotal;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setText("0");
			textField_3.setColumns(10);
			textField_3.setEditable(false);
		}
		return textField_3;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("%");
		}
		return label_3;
	}
}
