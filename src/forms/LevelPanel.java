package forms;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.JLabel;

import entities.Level;
import entities.LevelType;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * A panel that can be selected to enter a level.
 * @author Miya
 *
 */
public class LevelPanel extends JPanel {
	// set size of the panel
	public Dimension preferredSize = new Dimension(150, 150); 
	private JLabel lblLevelname;
	private Level level;
	private JLabel lblLeveltype;
	private JLabel lblStar1;
	private JLabel lblStar2;
	private JLabel lblStar3;
	Color normalColor;
	Color hoveredColor;

	public LevelPanel(Level lvl){
		super();

		// the listener for when a mouse is over a panel
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				setBackground(hoveredColor);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(normalColor);
			}
		});

		level = lvl;
		normalColor = Color.getHSBColor((float) Math.random(), 1.0f, 1.0f);
		normalColor = new Color(normalColor.getRed(), normalColor.getGreen(), normalColor.getBlue(), 100);
		hoveredColor = new Color(normalColor.getRed(), normalColor.getGreen(), normalColor.getBlue(), 255);
		setBackground(normalColor);

		setLayout(null);
		// the name of the level
		add(getLblLevelName());
		// the type of the level
		add(getLblLeveltype());

		if (lvl.getStats().getStarCount() > 0){
			add(getLblStar1());
		}
		if (lvl.getStats().getStarCount() > 1){
			add(getLblStar2());
		}
		if (lvl.getStats().getStarCount() > 2){
			add(getLblStar3());
		}		
		setLevelName(level.getName());
		try {
			setLevelType(getTypeString(level.getLvlType()));
		} catch (Exception e) {
			setLevelType("NO TYPE AVAILABLE");
		}

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

	public String getTypeString(LevelType type){
		switch (type) {
		case ELIMINATION:
			return "Elimination";
		case PUZZLE:
			return "Puzzle";
		case RELEASE:
			return "Release";
		case LIGHTNING:
			return "Lightning";
		default:
			return "TYPE ERROR";

		}

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
			lblStar1.setBounds(10, 100, 40, 40);
		}
		return lblStar1;
	}
	
	JLabel getLblStar2() {
		if (lblStar2 == null) {
			lblStar2 = new JLabel("");
			lblStar2.setIcon(new ImageIcon(LevelPanel.class.getResource("/Images/star icon.png")));
			lblStar2.setBounds(55, 100, 40, 40);
		}
		return lblStar2;
	}
	
	JLabel getLblStar3() {
		if (lblStar3 == null) {
			lblStar3 = new JLabel("");
			lblStar3.setIcon(new ImageIcon(LevelPanel.class.getResource("/Images/star icon.png")));
			lblStar3.setBounds(100, 100, 40, 40);
		}
		return lblStar3;
	}
}
