package forms;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.JLabel;

import entities.Level;

import java.awt.Font;
import javax.swing.SwingConstants;

public class LevelPanel extends JPanel {
public Dimension preferredSize = new Dimension(150, 150); 
private JLabel lblLevelname;
	private Level level;
	private JLabel lblLeveltype;
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
		setLevelName(level.getName());
		
	}

	@Override
	public Dimension getPreferredSize(){
		return preferredSize;
	
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
			lblLeveltype.setBounds(10, 125, 46, 14);
		}
		return lblLeveltype;
	}
}
