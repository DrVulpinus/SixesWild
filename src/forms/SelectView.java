package forms;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JScrollPane;

import net.miginfocom.swing.MigLayout;

public abstract class SelectView extends JPanel {
	private JScrollPane scrollPane;
	ArrayList<JLabel> items = new ArrayList<JLabel>();
	public SelectView() {
		setLayout(new MigLayout("", "[450px]", "[300px]"));
		add(getScrollPane(), "cell 0 0,grow");
	}

	JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
		}
		return scrollPane;
	}
	abstract void loadItems();
}
