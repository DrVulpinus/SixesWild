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


	/**
	 * Makes a new level panel
	 * @param lvl The level that this panel selects
	 */
	public LevelPanel(Level lvl){
		super();

		// the listener for when a mouse is over a panel
		addMouseListener(new MouseAdapter() {
			/**
			 * Highlights the panel when a mouse hovers over it.
			 */
			@Override
			public void mouseEntered(MouseEvent arg0) {
				setBackground(hoveredColor);
			}

			/**
			 * Reverts the square to original color when a mouse moves away from it.
			 */
			@Override
			public void mouseExited(MouseEvent e) {
				setBackground(normalColor);
			}
		});

		level = lvl;
		lvl.lp = this;

		// sets the original color of the panel to some random color
		normalColor = Color.getHSBColor((float) Math.random(), 1.0f, 1.0f);
		normalColor = new Color(normalColor.getRed(), normalColor.getGreen(), normalColor.getBlue(), 100);

		// a separte color for when the mouse hovers over it
		hoveredColor = new Color(normalColor.getRed(), normalColor.getGreen(), normalColor.getBlue(), 255);

		setBackground(normalColor);

		setLayout(null);
		// the name of the level
		add(getLblLevelName());
		// the type of the level
		add(getLblLeveltype());


		/**
		 * Adds the star count achieved for that level. If no star count has been achieved,
		 * nothing is displayed beneath it.
		 */

			add(getLblStar1());			
			add(getLblStar2());
			add(getLblStar3());
			lblStar1.setVisible(false);
			lblStar2.setVisible(false);
			lblStar3.setVisible(false);
	
			
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

	/**
	 * 
	 * @return the level for this panel
	 */
	public Level getLevel(){
		return level;
	}

	/**
	 * Sets a level for display in the panel
	 * @param levelName display name of the level
	 */
	public void setLevelName(String levelName){
		getLblLevelName().setText(levelName);
	}

	/**
	 * Sets the type of the level shown in the panel
	 * @param levelType the type of the level
	 */
	public void setLevelType(String levelType){
		getLblLeveltype().setText(levelType);
	}

	/**
	 * Converts the level type to a string
	 * @param type Type of a level
	 * @return the string representation of the type
	 */
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
			lblLeveltype.setBounds(10, 44, 130, 14);
		}
		return lblLeveltype;
	}

	public JLabel getLblStar1() {
		if (lblStar1 == null) {
			lblStar1 = new JLabel("");
			lblStar1.setIcon(new ImageIcon(LevelPanel.class.getResource("/Images/star_icon.png")));
			lblStar1.setBounds(10, 60, 40, 40);
		}
		return lblStar1;
	}
	
	public void addStar1(){
		lblStar1.setVisible(true);
	}

	public JLabel getLblStar2() {
		if (lblStar2 == null) {
			lblStar2 = new JLabel("");
			lblStar2.setIcon(new ImageIcon(LevelPanel.class.getResource("/Images/star_icon.png")));
			lblStar2.setBounds(55, 60, 40, 40);
		}
		return lblStar2;
	}
	
	public void addStar2(){
		lblStar2.setVisible(true);
	}
	
	public JLabel getLblStar3() {
		if (lblStar3 == null) {
			lblStar3 = new JLabel("");
			lblStar3.setIcon(new ImageIcon(LevelPanel.class.getResource("/Images/star_icon.png")));
			lblStar3.setBounds(100, 60, 40, 40);
		}
		return lblStar3;
	}
	
	public void addStar3(){
		lblStar3.setVisible(true);
	}
}
