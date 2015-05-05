package forms;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JScrollPane;

import net.miginfocom.swing.MigLayout;

/**
 * Superclass for LevelSelectView and AchievementSelectView.
 * It contains a panel, the ability to scroll, and a list of items.
 *
 */
public abstract class SelectView extends JPanel {
	private JScrollPane scrollPane;
	ArrayList<JLabel> items = new ArrayList<JLabel>();
	private JPanel panel;
	public SelectView() {
		setLayout(new BorderLayout(0, 0));
		add(getScrollPane());
	}

	/**
	 * Gets a scrollPane.
	 * @return scrollPane The JScrollPane added to the view.
	 */
	JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getPanel());
		}
		return scrollPane;
	}

	/**
	 * Adds all JLabels to the panel contained in the view.
	 */
	void loadItems(){
		for (JLabel jLabel : items) {
			getPanel().add(jLabel);
		}
	}
	/**
	 * Gets a Panel.
	 * @return panel A Panel added to the view.
	 */
	JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new MigLayout("", "[]", "[]"));
		}
		return panel;
	}

	/**
	 * Generic background color.
	 * @param clr The color of choice to be set.
	 */
	@Override
	public void setBackground(Color clr){
		super.setBackground(clr);
	}
}
