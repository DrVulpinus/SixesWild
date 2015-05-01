package forms;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.JLabel;

import entities.Level;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class LevelPanel extends JPanel {
public Dimension preferredSize = new Dimension(150, 150); 
private JLabel lblLevelname;
	private Level level;
	private JLabel lblLeveltype;
	private JLabel lblStar1;
	private JLabel lblStar2;
	private JLabel lblStar3;
	public LevelPanel(Level lvl){
		super();
		level = lvl;
		int r = (int) (Math.random()*255.0d);
		int g = (int) (Math.random()*255.0d);
		int b = (int) (Math.random()*255.0d);
		Color myColor = new Color(r,g,b);
		setBackground(myColor);
		setLayout(null);
		add(getLblLevelName());
		add(getLblLeveltype());
		add(getLblStar1());
		add(getLblStar2());
		add(getLblStar3());
		setLevelName(level.getName());
		
	}

	@Override
	public Dimension getPreferredSize(){
		return preferredSize;
	
	}
	public Level getLevel(){
		return level;
	}
	public void setLevelName(String levelName){
		getLblLevelName().setText(levelName);
	}
	public void setLevelType(String levelType){
		getLblLeveltype().setText(levelType);
	}
	JLabel getLblLevelName() {
		if (lblLevelname == null) {
			lblLevelname = new JLabel("LevelName");
			lblLevelname.setHorizontalAlignment(SwingConstants.CENTER);
			lblLevelname.setBounds(10, 11, 130, 22);
			lblLevelname.setFont(new Font("Tahoma", Font.BOLD, 18));
		}
		return lblLevelname;
	}
	JLabel getLblLeveltype() {
		if (lblLeveltype == null) {
			lblLeveltype = new JLabel("LevelType");
			lblLeveltype.setBounds(10, 44, 46, 14);
		}
		return lblLeveltype;
	}
	JLabel getLblStar1() {
		if (lblStar1 == null) {
			lblStar1 = new JLabel("");
			lblStar1.setIcon(new ImageIcon(LevelPanel.class.getResource("/Images/star icon.png")));
			lblStar1.setBounds(10, 109, 40, 40);
		}
		return lblStar1;
	}
	JLabel getLblStar2() {
		if (lblStar2 == null) {
			lblStar2 = new JLabel("");
			lblStar2.setIcon(new ImageIcon(LevelPanel.class.getResource("/Images/star icon.png")));
			lblStar2.setBounds(50, 109, 40, 40);
		}
		return lblStar2;
	}
	JLabel getLblStar3() {
		if (lblStar3 == null) {
			lblStar3 = new JLabel("");
			lblStar3.setIcon(new ImageIcon(LevelPanel.class.getResource("/Images/star icon.png")));
			lblStar3.setBounds(90, 109, 40, 40);
		}
		return lblStar3;
	}
}
