package forms;

import interfaces.MoveControlListener;
import interfaces.ToolControlListener;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;

import boundaries.SquareView;
import entities.Block;
import entities.Grid;
import entities.Location;
import entities.Square;

/**
 * Building the grid in the level builder
 */
public class BuilderGridView extends JPanel implements MouseListener {

	ArrayList<SquareView> squareViews = new ArrayList<SquareView>();
	ToolControlListener toolListener;
	boolean isFilled = false;

	Color color = new Color(0,0,0); 
	double currentXVal = 0;
	double currentYVal = 0;
	int columns = 9;
	int rows = 9;
	double xIncrement = 0;
	double yIncrement = 0;

	Rectangle2D rect = null;
	Grid grid;

	public BuilderGridView(Grid grid, ToolControlListener toolListener){
		this.grid = grid;
		this.toolListener = toolListener;
		this.setSquares(grid);

		this.addMouseListener(this);
		this.setBackground(new Color(0xEEEEEE));


		//isFilled = true;
	}

	//		setLayout(null);//Make sure it is absolute layout
	//		for (int y = 0; y < 9; y++){
	//			for (int x = 0; x < 9; x++) {				
	//				Square s = new Square();
	//				s.setLoc(new Location(y, x));
	//				s.setBlock(new Block(1, 2));
	//				SquareView sV = new SquareView(s);
	//				squareViews.add(sV);
	//				this.add(sV);
	//
	//			}
	//		//isFilled = true;
	//		}

	/**
	 * constructor of Builder Grid
	 */
	public BuilderGridView() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				fillGrid();
			}
		});

		setLayout(null);//Make sure it is absolute layout
		for (int y = 0; y < 9; y++){
			for (int x = 0; x < 9; x++) {				
				Square s = new Square();
				s.setLoc(new Location(y, x));
				s.setBlock(new Block(1, 2));
				SquareView sV = new SquareView(s, true);
				squareViews.add(sV);
				this.add(sV);
				rows = 9;
				columns = 9;
			}

			//isFilled = true;
		}
		fillGrid();
	}



	/**
	 * set the square for the grid
	 * @param squares
	 */
	public void setSquares(ArrayList<Square> squares) {
		this.removeAll();
		setLayout(null); //Make sure it is absolute layout
		for (Square square : squares) {
			SquareView sV = new SquareView(square, true);
			sV.addToolControlListener(toolListener);
			sV.update();
			squareViews.add(sV);
			this.add(sV);

		}

		//		for (int y = 0; y < 9; y++){
		//			for (int x = 0; x < 9; x++) {				
		//				Square s = new Square();
		//				s.setLoc(new Location(y, x));
		//				//s.setBlock(new Block(1, 2));
		//				SquareView sV = new SquareView(s);
		//				squareViews.add(sV);
		//				this.add(sV);
		//				//rows = 9;
		//				//columns = 9;
		//			}
		//		}
	}



	/**
	 * 
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		g2.setColor(color);

		double leftX = 100;
		double topY = 100;
		double dimension= Math.min(getWidth(), getHeight());

		double width = dimension;
		double height = dimension;
		double linesX=0;
		double lineY=0.0;
		double linesY=0;
		double lineX=0.0;


		rect = new Rectangle2D.Double(0, 0, width, height);
		//rect = new Rectangle2D.Double(0, 0, 100,100);
		//g2.draw(rect);



		//g2.draw(new Line2D.Double(rect.getX(), rect.getY(), rect.getX()+ rect.getWidth(), rect.getY() + rect.getHeight()));


		if (!isFilled)
			fillGrid();

		while(linesX<rows){
			g2.draw(new Line2D.Double(rect.getX(), lineY, rect.getX()+ rect.getWidth(), lineY));
			linesX++;
			xIncrement= rect.getHeight()/rows;
			lineY+=rect.getHeight()/rows;
			//System.out.println(lineY);

		}

		while (linesY<columns){
			g2.draw(new Line2D.Double(lineX, rect.getY(), lineX, rect.getY()+ rect.getHeight()));  
			linesY++;
			yIncrement = rect.getWidth()/columns;

			lineX+= rect.getWidth()/columns;
		}

	}

	/**
	 * fill the grid with squaresView
	 */
	public void fillGrid() {	
		if (rect == null)
			return;

		this.setVisible(false);

		//System.out.println(this.getSize().toString());
		for (SquareView squareView : squareViews) {
			int col = squareView.getSquare().getLoc().getCol();
			int row = squareView.getSquare().getLoc().getRow();
			//System.out.println(squareView.getSquare().getLoc().toString());
			squareView.setLocation((int)Math.floor((col*rect.getWidth()/columns)), (int)  Math.floor((row*rect.getHeight()/rows)));
			squareView.setSize((int) Math.floor(rect.getWidth()/columns), (int) Math.floor(rect.getHeight()/rows));
			//System.out.println(squareView.getLocation().toString() + squareView.getSize().toString());
		}
		this.setVisible(true);
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

	/**
	 * mouseClick events for this grid
	 */
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		currentXVal= e.getX()/xIncrement;
		currentYVal= e.getY()/yIncrement;
		int roundXOutput = (int)Math.floor(currentXVal);
		int roundYOutput = (int)Math.floor(currentYVal);
		int YOutput = (columns - roundYOutput);
		//int XOutput = (yNumLines - roundYOutput);
		System.out.println(roundXOutput+","+YOutput);
		int row = roundYOutput;
		int column = roundXOutput;

		if (row < 0 || row > 9 || column < 0 || column > 9)		//if detected grid coordinates are outside of the grid
			return;

		Location loc = new Location(row, column);
		System.out.println("Grid Clicked at: " + loc);
		toolListener.useTool(loc);

		//setSquares(this.grid);
		repaint();
	}


	public void mousePressed(MouseEvent e) {

	}
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	} }


// sudo code

/*
 * int moveType
 */
