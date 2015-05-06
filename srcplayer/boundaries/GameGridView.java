package boundaries;

import interfaces.MoveControlListener;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;

import entities.Block;
import entities.Grid;
import entities.Location;
import entities.Square;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.GridLayout;


/**
 * The GameGridView class displays the grid of squares and blocks that appear in the level during game play.
 * @author Alex Wald
 * @author Richard Eberheim
 */


public class GameGridView extends JPanel{

	private static final long serialVersionUID = 3399803991655076903L;
	ArrayList<SquareView> squareViews = new ArrayList<SquareView>();
	MoveControlListener moveControlListener = null;

	boolean isFilled = false;

	Color color = new Color(0,0,0); 
	double currentXVal = 0;
	double currentYVal = 0;
	int columns = 1;
	int rows = 1;
	double xIncrement = 0;
	double yIncrement = 0;


	/**
	 * Constructs a new empty grid view
	 */
	public GameGridView() {
		// initialize all squares and blocks within the grid.
		super();
		setLayout(new GridLayout(9, 9, 15, 15));
		for (int y = 0; y < 9; y++){
			for (int x = 0; x < 9; x++) {				
				Square s = new Square();
				s.setLoc(new Location(y, x));
				s.setBlock(new Block(1, 2));
				SquareView sV = new SquareView(s);
				squareViews.add(sV);
				this.add(sV);
				rows = 9;
				columns = 9;
			}
		}
	}

	/**
	 * Makes a new GameGridView that displays the specified list of squares
	 * @param squares A list of all the squares within the grid.
	 */
	public GameGridView(ArrayList<Square> squares) {
		this.setSquares(squares);
		setLayout(new GridLayout(9, 9, 0, 0));
	
	}

	/**
	 * Makes a new GameGridView that displays the grid with move functionality supported.
	 * @param grid The grid represented by the view.
	 * @param moveControlListener The listener that should update when a move happens to the gridView.
	 */
	public GameGridView(Grid grid, MoveControlListener moveControlListener) {
		this.moveControlListener = moveControlListener;
		this.setSquares(grid);
		setLayout(new GridLayout(9, 9, 0, 0));
	
	}

	/**
	 * Set every square contained within the view and give it an assigned SquareView.
	 * @param squares A list of all the squares contained in the grid.
	 */
	public void setSquares(ArrayList<Square> squares) {
		for (Square square : squares) {
			SquareView sV = new SquareView(square);
			sV.addMoveControlListener(moveControlListener);
			squareViews.add(sV);
			this.add(sV);
			columns = Math.max(columns, square.getLoc().getCol());
			rows = Math.max(rows, square.getLoc().getRow());
		}

		fillGrid();
	}

	/**
	 * Add the components containing all the squareViews, but give each squareView its location first.
	 * @param column The integer of the column number the square is in.
	 * @param row The integer of the row number the square is in.
	 * @return squareView The individual SquareView with a newly given column and row number.
	 */
	public JComponent addComponentToBox(int column, int row){
		for (SquareView squareView : squareViews){
			if (squareView.getSquare().getLoc().getCol() == column && squareView.getSquare().getLoc().getRow() == row){
				return squareView;
			}
		}
		JPanel holdPnl = new JPanel();
		holdPnl.setBackground(new Color(255, 255, 255, 0));
		return holdPnl;		
	}
	
	/**
	 * Fill the grid with squareViews.
	 */
	public void fillGrid() {

		for (int col = 0; col < 9; col++){
			for (int row = 0; row < 9; row++) {				
				add(addComponentToBox(row, col));
			}
		}
		for (SquareView squareView : squareViews) {
			squareView.update();
		}
	}
	/**
	 * Fill the grid with squareViews that have been changed.
	 */
	public void updateGrid() {
		for (SquareView squareView : squareViews) {		
			squareView.update();
		}

	}
	
	/**
	 * Adds mouse listeners to the grid
	 */
	public void addMouseListners(){
			GameGridView.this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("ENTERED GRID");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
	}
}




