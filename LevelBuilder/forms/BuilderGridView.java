package forms;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

import entities.Grid;
import entities.Location;

public class BuilderGridView extends JComponent implements MouseListener {

int xLoc;
int yLoc;
Color color = new Color(0,0,0); 
double currentXVal= 0;
double currentYVal = 0;
int yNumLines =10;
int xNumLines =10;
double xIncrement = 0;
double yIncrement = 0;
	public BuilderGridView (Grid grid, Location location ){
		//this.grid = grid;
		//this.location = location;
		addMouseListener(this);
		
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
       
       
       Rectangle2D rect = new Rectangle2D.Double(0, 0, width, height);
       g2.draw(rect);
       
       
       
      //g2.draw(new Line2D.Double(rect.getX(), rect.getY(), rect.getX()+ rect.getWidth(), rect.getY() + rect.getHeight()));
       while(linesX<xNumLines){
    	   
       
       g2.draw(new Line2D.Double(rect.getX(), lineY, rect.getX()+ rect.getWidth(), lineY
    		   ));
       linesX++;
      xIncrement= rect.getHeight()/xNumLines;
       lineY+=rect.getHeight()/xNumLines;
       //System.out.println(lineY);
       
       }
       
       while (linesY<yNumLines){
    	   g2.draw(new Line2D.Double(lineX, rect.getY(), lineX, rect.getY()+ rect.getHeight()
        		   ));  
    	   linesY++;
    	   yIncrement= rect.getWidth()/yNumLines;
    	   
    	   lineX+=rect.getWidth()/yNumLines;
       }
       
}
	

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		currentXVal= e.getX()/xIncrement;
		currentYVal= e.getY()/yIncrement;
		int roundXOutput = (int)Math.round(currentXVal);
		int roundYOutput = (int)Math.round(currentYVal);
		int YOutput = (yNumLines - roundYOutput);
		//int XOutput = (yNumLines - roundYOutput);
		System.out.println(roundXOutput+","+YOutput);
		xLoc = roundXOutput;
		yLoc = YOutput;
	
	}
	
	public int[] getGridLocation(){
		
		int Location[];
		Location= new int[1];
		Location[0] =xLoc;
		Location[1] =yLoc;
		
		return Location;
		
	}
	
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
