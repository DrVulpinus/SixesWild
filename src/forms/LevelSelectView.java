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

import controllers.SaveLoadLevel;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JViewport;
import javax.swing.Scrollable;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Rectangle;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import net.miginfocom.swing.MigLayout;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;

import javax.swing.ScrollPaneConstants;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;


public class LevelSelectView extends SelectView {
	
	SaveLoadLevel sll;
	private ArrayList<LevelPanel> levelPanels;
	public LevelSelectView() {
		sll = SaveLoadLevel.getInstance();
		setMinimumSize(new Dimension(100, 100));
		setLayout(new BorderLayout(0, 0));
		add(getBtnBack(), BorderLayout.SOUTH);
		add(getScrollPaneLevels(), BorderLayout.CENTER);
		levelPanels = new ArrayList<LevelPanel>();
		for (Level lvl : sll.getLevels()) {
			LevelPanel lvlPnl = new LevelPanel(lvl);
			levelPanels.add(lvlPnl);
			getPnlLevelsContain().add(lvlPnl);
		}
	}

	ArrayList<Level> levels = new ArrayList<Level>();
	private JButton btnBack;
	private JScrollPane scrollPaneLevels;
	private JPanel panel;
	
	
	@Override
	void loadItems() {
		for (Level level : levels) {
			JLabel label = new JLabel();
			items.add(label);
		}
		super.loadItems();//Do this last to add all of the items to the scrollPane
		
		
	}
	public ArrayList<LevelPanel> getLevelPanels(){
		return levelPanels;
	}
	JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			
		}
		return btnBack;
	}
	JScrollPane getScrollPaneLevels() {
		if (scrollPaneLevels == null) {
			scrollPaneLevels = new JScrollPane();
			scrollPaneLevels.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPaneLevels.setViewportView(getPnlLevelsContain());
			scrollPaneLevels.getVerticalScrollBar().setUnitIncrement(25);
			
		}
		return scrollPaneLevels;
	}
	JPanel getPnlLevelsContain() {
		if (panel == null) {		
			panel = new JPanel();		
			panel.setLayout(new WrapLayout());
			
		}
		return panel;
	}
	
}
