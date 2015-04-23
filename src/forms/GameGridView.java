package forms;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;

import entities.Block;
import entities.Location;
import entities.Square;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseEvent;

public class GameGridView extends JPanel {
	
	ArrayList<SquareView> squareViews = new ArrayList<SquareView>();

	boolean isFilled = false;
	
	Color color = new Color(0,0,0); 
	double currentXVal = 0;
	double currentYVal = 0;
	int columns = 1;
	int rows = 1;
	double xIncrement = 0;
	double yIncrement = 0;
	
	Rectangle2D rect = null;
	
	
	public GameGridView() {
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
				SquareView sV = new SquareView(s);
				squareViews.add(sV);
				this.add(sV);
				rows = 9;
				columns = 9;
			}
		
		//isFilled = true;
		}
		fillGrid();
	}
	public GameGridView(ArrayList<Square> squares) {
		this.setSquares(squares);
	}
	
	
	public void setSquares(ArrayList<Square> squares) {
		setLayout(null);//Make sure it is absolute layout
		for (Square square : squares) {
			SquareView sV = new SquareView(square);
			squareViews.add(sV);
			this.add(sV);
			columns = Math.max(columns, square.getLoc().getCol());
			rows = Math.max(rows, square.getLoc().getRow());
		}
	}
	
	


	public void paintComponent(Graphics g) {
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
		while(linesX<rows){


			//g2.draw(new Line2D.Double(rect.getX(), lineY, rect.getX()+ rect.getWidth(), lineY));
			linesX++;
			xIncrement= rect.getHeight()/rows;
			lineY+=rect.getHeight()/rows;
			//System.out.println(lineY);

		}

		while (linesY<columns){
			//g2.draw(new Line2D.Double(lineX, rect.getY(), lineX, rect.getY()+ rect.getHeight()));  
			linesY++;
			yIncrement= rect.getWidth()/columns;

			lineX+=rect.getWidth()/columns;
		}
		
		if (!isFilled)
			fillGrid();
	}

	public void fillGrid() {		
		if (rect == null)
			return;
		
		this.setVisible(false);
		
		System.out.println(this.getSize().toString());
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
	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		currentXVal= e.getX()/xIncrement;
		currentYVal= e.getY()/yIncrement;
		int roundXOutput = (int)Math.round(currentXVal);
		int roundYOutput = (int)Math.round(currentYVal);
		int YOutput = (columns - roundYOutput);
		//int XOutput = (yNumLines - roundYOutput);
		System.out.println(roundXOutput+","+YOutput);
	
	}
		
		
	}




