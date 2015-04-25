package forms;

import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import javax.management.InstanceNotFoundException;
import javax.management.timer.TimerMBean;
import javax.swing.JLabel;

import entities.Level;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;


public class LevelSelectView extends SelectView {
	public LevelSelectView() {
		setMinimumSize(new Dimension(100, 100));
		setLayout(new MigLayout("", "[90px,center][90px][90px][90px][90px]", "[75px,center][75px][75px][75px,bottom]"));
		add(getBtnNewButton(), "cell 4 3,growx,aligny bottom");
	}

	ArrayList<Level> levels = new ArrayList<Level>();
	private JButton btnNewButton;
	
	
	@Override
	void loadItems() {
		for (Level level : levels) {
			JLabel label = new JLabel();
			items.add(label);
		}
		super.loadItems();//Do this last to add all of the items to the scrollPane
		
		
	}
	
	
	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Back\n");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
		}
		return btnNewButton;
	}
}
