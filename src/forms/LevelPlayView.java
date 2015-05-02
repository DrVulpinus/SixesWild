package forms;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import src.PuzzleStats;
import src.StatsView;
import Interfaces.MoveControlListener;
import entities.Level;
import java.awt.GridLayout;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;

/**
 * The view for an individual level. Contains the views for the stats, the
 * grid, and the special moves. Also contains the level itself to call the grid
 * and a move control listener to give to the grid.
 * @author Miya
 *
 */
public class LevelPlayView extends JPanel {
	private JButton btnBack;
	
	StatsView statsView;
	GameGridView gridView;
	SpecialMoveView specialMoveView;
	MoveControlListener moveControlListener;
	Level level;
	
	public LevelPlayView(Level level, MoveControlListener moveControlListener) {
		this.moveControlListener = moveControlListener;
		setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("241px"),
				ColumnSpec.decode("241px:grow"),
				ColumnSpec.decode("241px"),},
			new RowSpec[] {
				RowSpec.decode("fill:184px:grow"),
				RowSpec.decode("bottom:min"),}));
		
		// add the stats to the view
		statsView = new StatsView();
		statsView.setBackground(new Color(255, 255, 255, 50));
		add(statsView, "2, 1, fill, fill");
		
		gridView = new GameGridView(level.getGrid(), moveControlListener);

		
		// initialize and add the other views
		gridView.setBackground(new Color(255, 255, 255, 50));
		add(gridView, "3, 1, fill,fill");
		
		specialMoveView = new SpecialMoveView();
		specialMoveView.setBackground(new Color(255, 255, 255, 50));
		add(specialMoveView, "4, 1, fill, fill");
		this.setBackground(new Color(255, 255, 255, 50));
		
		//btnBack.setBounds(395, 20, 117, 29);
		add(getbtnBack(), "4, 2, fill, fill");
		//GameGridView gameGridView = new GameGridView();
		//getContentPane().add(gameGridView);
	}
	@Override
	protected void paintComponent(java.awt.Graphics g) {
		System.out.println("Repainting");
		super.paintComponent(g);
	};

	/**
	 * @return btnBack The button that calls the main menu screen when pressed.
	 */
	public JButton getbtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
		}
		return btnBack;
	}

	/**
	 * @return statsView The image containing the level stats.
	 */
	public StatsView getStatsView() {
		return statsView;
	}

	/**
	 * @return gridView The image containing the grid.
	 */
	public GameGridView getGridView() {
		return gridView;
	}

	/**
	 * @return specialMoveView The image containing the special moves.
	 */
	public SpecialMoveView getSpecialMoveView() {
		return specialMoveView;
	}
	
	/**
	 * @param level Set the level the user is currently in.
	 */
	public void setLevel(Level level) {
		this.level = level;
		
	}
	
	/**
	 * @return level The level the user is currently in.
	 */
	public Level getLevel() {
		return this.level;
	}
}

