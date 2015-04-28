package forms;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JScrollPane;

import net.miginfocom.swing.MigLayout;

public abstract class SelectView extends JPanel {
	private JScrollPane scrollPane;
	ArrayList<JLabel> items = new ArrayList<JLabel>();
	private JPanel panel;
	public SelectView() {
		setLayout(new BorderLayout(0, 0));
		add(getScrollPane());
	}

	JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getPanel());
		}
		return scrollPane;
	}
	void loadItems(){
		for (JLabel jLabel : items) {
			getPanel().add(jLabel);
		}
	}
	JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new MigLayout("", "[]", "[]"));
		}
		return panel;
	}
	@Override
	public void setBackground(Color clr){
		super.setBackground(clr);
	}
}
