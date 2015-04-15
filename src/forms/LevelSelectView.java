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


public class LevelSelectView extends SelectView {
	public LevelSelectView() {
		setLayout(new GridLayout(4, 4));
		add(getPanel_1());
		add(getPanel_1_1());
		add(getPanel_2());
		add(getPanel_3());
		add(getPanel_4());
		add(getPanel_5());
		add(getPanel_6());
		add(getPanel_7());
		add(getPanel_8());
		add(getPanel_9());
		add(getPanel_10());
		add(getPanel_11());
		add(getPanel_12());
		add(getPanel_13());
		add(getPanel_14());
		add(getPanel_15());
	}

	ArrayList<Level> levels = new ArrayList<Level>();
	private JLabel lblLevel;
	private JLabel lblLevel_1;
	private JLabel lblLevel_2;
	private JLabel lblLevel_3;
	private JLabel lblLevel_4;
	private JLabel lblLevel_5;
	private JLabel lblLevel_6;
	private JLabel lblLevel_7;
	private JLabel lblLevel_8;
	private JLabel lblLevel_9;
	private JLabel lblLevel_10;
	private JLabel lblLevel_11;
	private JLabel lblLevel_12;
	private JLabel lblLevel_13;
	private JLabel lblLevel_14;
	private JLabel lblLevel_15;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblLightning;
	private JPanel panel_2;
	private JLabel lblElimination;
	private JPanel panel_3;
	private JLabel lblRelease;
	private JPanel panel_4;
	private JLabel lblPuzzle_1;
	private JPanel panel_5;
	private JLabel lblLightning_1;
	private JPanel panel_6;
	private JLabel lblElimination_1;
	private JPanel panel_7;
	private JLabel lblRelease_1;
	private JPanel panel_8;
	private JLabel lblPuzzle_2;
	private JPanel panel_9;
	private JLabel lblElimination_2;
	private JPanel panel_10;
	private JLabel lblLightning_2;
	private JPanel panel_11;
	private JLabel lblRelease_2;
	private JPanel panel_12;
	private JLabel lblPuzzle_3;
	private JPanel panel_13;
	private JLabel lblLightnin;
	private JPanel panel_14;
	private JLabel lblRelease_3;
	private JPanel panel_15;
	private JLabel lblElimination_3;
	private JLabel lblNewLabel;
	@Override
	void loadItems() {
		for (Level level : levels) {
			JLabel label = new JLabel();
			items.add(label);
		}
		super.loadItems();//Do this last to add all of the items to the scrollPane
		
		
	}
	


	
	private JLabel getLblLevel() {
		if (lblLevel == null) {
			lblLevel = DefaultComponentFactory.getInstance().createLabel("10");
			lblLevel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		}
		return lblLevel;
	}
	private JLabel getLblLevel_1() {
		if (lblLevel_1 == null) {
			lblLevel_1 = DefaultComponentFactory.getInstance().createLabel("3");
			lblLevel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		}
		return lblLevel_1;
	}
	private JLabel getLblLevel_2() {
		if (lblLevel_2 == null) {
			lblLevel_2 = DefaultComponentFactory.getInstance().createLabel("4");
			lblLevel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		}
		return lblLevel_2;
	}
	private JLabel getLblLevel_3() {
		if (lblLevel_3 == null) {
			lblLevel_3 = DefaultComponentFactory.getInstance().createLabel("5");
			lblLevel_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		}
		return lblLevel_3;
	}
	private JLabel getLblLevel_4() {
		if (lblLevel_4 == null) {
			lblLevel_4 = DefaultComponentFactory.getInstance().createLabel("2");
			lblLevel_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		}
		return lblLevel_4;
	}
	private JLabel getLblLevel_5() {
		if (lblLevel_5 == null) {
			lblLevel_5 = DefaultComponentFactory.getInstance().createLabel("6");
			lblLevel_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		}
		return lblLevel_5;
	}
	private JLabel getLblLevel_6() {
		if (lblLevel_6 == null) {
			lblLevel_6 = DefaultComponentFactory.getInstance().createLabel("11");
			lblLevel_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		}
		return lblLevel_6;
	}
	private JLabel getLblLevel_7() {
		if (lblLevel_7 == null) {
			lblLevel_7 = DefaultComponentFactory.getInstance().createLabel("8");
			lblLevel_7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		}
		return lblLevel_7;
	}
	private JLabel getLblLevel_8() {
		if (lblLevel_8 == null) {
			lblLevel_8 = DefaultComponentFactory.getInstance().createLabel("9");
			lblLevel_8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		}
		return lblLevel_8;
	}
	private JLabel getLblLevel_9() {
		if (lblLevel_9 == null) {
			lblLevel_9 = DefaultComponentFactory.getInstance().createLabel("12");
			lblLevel_9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		}
		return lblLevel_9;
	}
	private JLabel getLblLevel_10() {
		if (lblLevel_10 == null) {
			lblLevel_10 = DefaultComponentFactory.getInstance().createLabel("13");
			lblLevel_10.setFont(new Font("Tahoma", Font.PLAIN, 30));
		}
		return lblLevel_10;
	}
	private JLabel getLblLevel_11() {
		if (lblLevel_11 == null) {
			lblLevel_11 = DefaultComponentFactory.getInstance().createLabel("7");
			lblLevel_11.setFont(new Font("Tahoma", Font.PLAIN, 30));
		}
		return lblLevel_11;
	}
	private JLabel getLblLevel_12() {
		if (lblLevel_12 == null) {
			lblLevel_12 = DefaultComponentFactory.getInstance().createLabel("14");
			lblLevel_12.setFont(new Font("Tahoma", Font.PLAIN, 30));
		}
		return lblLevel_12;
	}
	private JLabel getLblLevel_13() {
		if (lblLevel_13 == null) {
			lblLevel_13 = DefaultComponentFactory.getInstance().createLabel("15");
			lblLevel_13.setFont(new Font("Tahoma", Font.PLAIN, 30));
		}
		return lblLevel_13;
	}
	private JLabel getLblLevel_14() {
		if (lblLevel_14 == null) {
			lblLevel_14 = DefaultComponentFactory.getInstance().createLabel("16");
			lblLevel_14.setFont(new Font("Tahoma", Font.PLAIN, 30));
		}
		return lblLevel_14;
	}
	private JLabel getLblLevel_15() {
		if (lblLevel_15 == null) {
			lblLevel_15 = DefaultComponentFactory.getInstance().createLabel("1");
			lblLevel_15.setMinimumSize(new Dimension(20, 16));
			lblLevel_15.setMaximumSize(new Dimension(20, 16));
			lblLevel_15.setToolTipText("\n");
			lblLevel_15.setFont(new Font("Tahoma", Font.PLAIN, 30));
		}
		return lblLevel_15;
	}
	public JPanel getPanel_1() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(Color.ORANGE);
			panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel.add(getLblLevel_15());
			panel.add(getLblNewLabel());
		}
		return panel;
	}
	private JPanel getPanel_1_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBackground(Color.LIGHT_GRAY);
			panel_1.add(getLblLevel_4());
			panel_1.add(getLblLightning());
		}
		return panel_1;
	}
	private JLabel getLblLightning() {
		if (lblLightning == null) {
			lblLightning = new JLabel("");
			lblLightning.setIcon(new ImageIcon(LevelSelectView.class.getResource("/Images/Level_Label_Lightning copy.png")));
		}
		return lblLightning;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBackground(Color.LIGHT_GRAY);
			panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel_2.add(getLblLevel_1());
			panel_2.add(getLblElimination());
		}
		return panel_2;
	}
	private JLabel getLblElimination() {
		if (lblElimination == null) {
			lblElimination = new JLabel("\n");
			lblElimination.setIcon(new ImageIcon(LevelSelectView.class.getResource("/Images/Level_Label_Elimination copy.png")));
		}
		return lblElimination;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setBackground(Color.LIGHT_GRAY);
			panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel_3.add(getLblLevel_2());
			panel_3.add(getLblRelease());
		}
		return panel_3;
	}
	private JLabel getLblRelease() {
		if (lblRelease == null) {
			lblRelease = new JLabel("");
			lblRelease.setIcon(new ImageIcon(LevelSelectView.class.getResource("/Images/Level_Label_Release copy.png")));
		}
		return lblRelease;
	}
	private JPanel getPanel_4() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
			panel_4.setBackground(Color.LIGHT_GRAY);
			panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			panel_4.add(getLblLevel_3());
			panel_4.add(getLblPuzzle_1());
		}
		return panel_4;
	}
	private JLabel getLblPuzzle_1() {
		if (lblPuzzle_1 == null) {
			lblPuzzle_1 = new JLabel("");
			lblPuzzle_1.setIcon(new ImageIcon(LevelSelectView.class.getResource("/Images/Level_Label_Puzzle copy.png")));
		}
		return lblPuzzle_1;
	}
	private JPanel getPanel_5() {
		if (panel_5 == null) {
			panel_5 = new JPanel();
			panel_5.setBackground(Color.LIGHT_GRAY);
			panel_5.add(getLblLevel_5());
			panel_5.add(getLblLightning_1());
		}
		return panel_5;
	}
	private JLabel getLblLightning_1() {
		if (lblLightning_1 == null) {
			lblLightning_1 = new JLabel("");
			lblLightning_1.setIcon(new ImageIcon(LevelSelectView.class.getResource("/Images/Level_Label_Lightning copy.png")));
		}
		return lblLightning_1;
	}
	private JPanel getPanel_6() {
		if (panel_6 == null) {
			panel_6 = new JPanel();
			panel_6.setBackground(Color.LIGHT_GRAY);
			panel_6.add(getLblLevel_11());
			panel_6.add(getLblElimination_1());
		}
		return panel_6;
	}
	private JLabel getLblElimination_1() {
		if (lblElimination_1 == null) {
			lblElimination_1 = new JLabel("");
			lblElimination_1.setIcon(new ImageIcon(LevelSelectView.class.getResource("/Images/Level_Label_Elimination copy.png")));
		}
		return lblElimination_1;
	}
	private JPanel getPanel_7() {
		if (panel_7 == null) {
			panel_7 = new JPanel();
			panel_7.setBackground(Color.LIGHT_GRAY);
			panel_7.add(getLblLevel_7());
			panel_7.add(getLblRelease_1());
		}
		return panel_7;
	}
	private JLabel getLblRelease_1() {
		if (lblRelease_1 == null) {
			lblRelease_1 = new JLabel("");
			lblRelease_1.setIcon(new ImageIcon(LevelSelectView.class.getResource("/Images/Level_Label_Release copy.png")));
		}
		return lblRelease_1;
	}
	private JPanel getPanel_8() {
		if (panel_8 == null) {
			panel_8 = new JPanel();
			panel_8.setBackground(Color.LIGHT_GRAY);
			panel_8.add(getLblLevel_8());
			panel_8.add(getLblPuzzle_2());
		}
		return panel_8;
	}
	private JLabel getLblPuzzle_2() {
		if (lblPuzzle_2 == null) {
			lblPuzzle_2 = new JLabel("");
			lblPuzzle_2.setIcon(new ImageIcon(LevelSelectView.class.getResource("/Images/Level_Label_Puzzle copy.png")));
		}
		return lblPuzzle_2;
	}
	private JPanel getPanel_9() {
		if (panel_9 == null) {
			panel_9 = new JPanel();
			panel_9.setBackground(Color.LIGHT_GRAY);
			panel_9.add(getLblLevel());
			panel_9.add(getLblElimination_2());
		}
		return panel_9;
	}
	private JLabel getLblElimination_2() {
		if (lblElimination_2 == null) {
			lblElimination_2 = new JLabel("");
			lblElimination_2.setIcon(new ImageIcon(LevelSelectView.class.getResource("/Images/Level_Label_Elimination copy.png")));
		}
		return lblElimination_2;
	}
	private JPanel getPanel_10() {
		if (panel_10 == null) {
			panel_10 = new JPanel();
			panel_10.setBackground(Color.LIGHT_GRAY);
			panel_10.add(getLblLevel_6());
			panel_10.add(getLblLightning_2());
		}
		return panel_10;
	}
	private JLabel getLblLightning_2() {
		if (lblLightning_2 == null) {
			lblLightning_2 = new JLabel("");
			lblLightning_2.setIcon(new ImageIcon(LevelSelectView.class.getResource("/Images/Level_Label_Lightning copy.png")));
		}
		return lblLightning_2;
	}
	private JPanel getPanel_11() {
		if (panel_11 == null) {
			panel_11 = new JPanel();
			panel_11.setBackground(Color.LIGHT_GRAY);
			panel_11.add(getLblLevel_9());
			panel_11.add(getLblRelease_2());
		}
		return panel_11;
	}
	private JLabel getLblRelease_2() {
		if (lblRelease_2 == null) {
			lblRelease_2 = new JLabel("");
			lblRelease_2.setIcon(new ImageIcon(LevelSelectView.class.getResource("/Images/Level_Label_Release copy.png")));
		}
		return lblRelease_2;
	}
	private JPanel getPanel_12() {
		if (panel_12 == null) {
			panel_12 = new JPanel();
			panel_12.setBackground(Color.LIGHT_GRAY);
			panel_12.add(getLblLevel_10());
			panel_12.add(getLblPuzzle_3());
		}
		return panel_12;
	}
	private JLabel getLblPuzzle_3() {
		if (lblPuzzle_3 == null) {
			lblPuzzle_3 = new JLabel("");
			lblPuzzle_3.setIcon(new ImageIcon(LevelSelectView.class.getResource("/Images/Level_Label_Puzzle copy.png")));
		}
		return lblPuzzle_3;
	}
	private JPanel getPanel_13() {
		if (panel_13 == null) {
			panel_13 = new JPanel();
			panel_13.setBackground(Color.LIGHT_GRAY);
			panel_13.add(getLblLevel_12());
			panel_13.add(getLblLightnin());
		}
		return panel_13;
	}
	private JLabel getLblLightnin() {
		if (lblLightnin == null) {
			lblLightnin = new JLabel("");
			lblLightnin.setIcon(new ImageIcon(LevelSelectView.class.getResource("/Images/Level_Label_Lightning copy.png")));
		}
		return lblLightnin;
	}
	private JPanel getPanel_14() {
		if (panel_14 == null) {
			panel_14 = new JPanel();
			panel_14.setBackground(Color.LIGHT_GRAY);
			panel_14.add(getLblLevel_13());
			panel_14.add(getLblRelease_3());
		}
		return panel_14;
	}
	private JLabel getLblRelease_3() {
		if (lblRelease_3 == null) {
			lblRelease_3 = new JLabel("");
			lblRelease_3.setIcon(new ImageIcon(LevelSelectView.class.getResource("/Images/Level_Label_Release copy.png")));
		}
		return lblRelease_3;
	}
	private JPanel getPanel_15() {
		if (panel_15 == null) {
			panel_15 = new JPanel();
			panel_15.setBackground(Color.LIGHT_GRAY);
			panel_15.add(getLblLevel_14());
			panel_15.add(getLblElimination_3());
		}
		return panel_15;
	}
	private JLabel getLblElimination_3() {
		if (lblElimination_3 == null) {
			lblElimination_3 = new JLabel("");
			lblElimination_3.setIcon(new ImageIcon(LevelSelectView.class.getResource("/Images/Level_Label_Elimination copy.png")));
		}
		return lblElimination_3;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(LevelSelectView.class.getResource("/Images/Level_Label_Puzzle copy.png")));
			lblNewLabel.setBounds(10, 10, 10, 10);
		}
		return lblNewLabel;
	}
}
