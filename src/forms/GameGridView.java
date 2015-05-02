package forms;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;

import Interfaces.MoveControlListener;
import entities.Block;
import entities.Grid;
import entities.Location;
import entities.Square;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;

public class GameGridView extends JPanel {
	
	/**
	 * 
	 */
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
	
	
	
	
	public GameGridView() {
		super();
		setLayout(new GridLayout(9, 9, 0, 0));
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
		
		//isFilled = true;
		}
	
	}
	public GameGridView(ArrayList<Square> squares) {
		this.setSquares(squares);
		setLayout(new GridLayout(9, 9, 0, 0));
		
	}
	
	
	public GameGridView(Grid grid, MoveControlListener moveControlListener) {
		this.moveControlListener = moveControlListener;
		this.setSquares(grid);
		setLayout(new GridLayout(9, 9, 0, 0));
		
	}
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
	public void fillGrid() {
		
		
		//this.setVisible(false);
		for (int col = 0; col < 9; col++){
			for (int row = 0; row < 9; row++) {				
				add(addComponentToBox(row, col));
			}
		
		//isFilled = true;
		}
		//System.out.println(this.getSize().toString());
		for (SquareView squareView : squareViews) {
			//int col = squareView.getSquare().getLoc().getCol();
			//int row = squareView.getSquare().getLoc().getRow();
			//System.out.println(squareView.getSquare().getLoc().toString());
			
			
			
			//add(squareView, );
		//	squareView.setLocation((int)Math.floor((col*getWidth()/columns)), (int)  Math.floor((row*getHeight()/rows)));
			//squareView.setSize((int) Math.floor(getWidth()/columns), (int) Math.floor(getHeight()/rows));
			squareView.update();
			//System.out.println(squareView.getLocation().toString() + squareView.getSize().toString());
		}
		//this.setVisible(true);
	/*	
		for (int y = 0; y < columns; y++){
			for (int x = 0; x < rows; x++) {				
				sV.setLocation((int) (x*rect.getWidth()/columns), (int) (y*rect.getHeight()/rows));
				sV.setSize((int) rect.getWidth()/columns, (int) rect.getHeight()/rows);
				//System.out.println(squareViews.size());
				//System.out.println(sV.getLocation().toString() + " " + sV.getSize().toString());
				sV.update();
				
			}
		*/
		//isFilled = true;
	}
	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		currentXVal= e.getX()/xIncrement;
		currentYVal= e.getY()/yIncrement;
		int roundXOutput = (int)Math.round(currentXVal);
		int roundYOutput = (int)Math.round(currentYVal);
		int YOutput = (columns - roundYOutput);
		//int XOutput = (yNumLines - roundYOutput);
		System.err.println(roundXOutput+","+YOutput);
	
	}
	public void updateGrid() {
		for (SquareView squareView : squareViews) {		
				squareView.update();
			}
		
	}
}




