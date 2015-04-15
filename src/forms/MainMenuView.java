package forms;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Component;
import java.awt.Cursor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Dimension;
import net.miginfocom.swing.MigLayout;

public class MainMenuView extends JFrame{


	/**
	 * Create the panel.
	 */
	public MainMenuView() {
		getContentPane().setMinimumSize(new Dimension(500, 500));
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setBackground(UIManager.getColor("ToolTip.background"));
		
		JButton btnLevels = new JButton("Levels");
		
		JButton btnAchievements = new JButton("Achievements");
		getContentPane().setLayout(new MigLayout("", "[grow][117px][117px][grow]", "[grow][40px,center][grow]"));
		getContentPane().add(btnLevels, "cell 1 1,grow");
		getContentPane().add(btnAchievements, "cell 2 1,grow");
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnLevels, btnAchievements}));
		setSize(302, 175);

	}


}
