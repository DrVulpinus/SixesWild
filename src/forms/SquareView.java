package forms;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;

import Interfaces.MoveControlListener;
import Interfaces.ToolControlListener;
import entities.Square;
import entities.SquareChangeListener;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

public class SquareView extends JPanel implements SquareChangeListener
{
	static final Color NORMAL_COLOR = new Color(255,255,255,0);
	static final Color NORMAL_BUILD_COLOR = new Color(255,255,255);
	static final int ELIMINATED_COLOR = 0xFF0000;
	static final int RELEASE_COLOR = 0x000000;
	ArrayList<MoveControlListener> listeners = new ArrayList<MoveControlListener>();
	ArrayList<ToolControlListener> toolListeners = new ArrayList<ToolControlListener>();
	Square square;
	BlockView blockView;
	
	
	public Square getSquare() {
		return square;
	}

	public void setSquare(Square square) {
		this.square = square;
		square.addListener(this);
	}
	
	public void addMoveControlListener(MoveControlListener mcl){
		listeners.add(mcl);
	}
	
	public void addToolControlListener(ToolControlListener tcl){
		toolListeners.add(tcl);
	}
	
	public SquareView(Square square, boolean isBuilding) {
		this(square);
		
		if (!isBuilding)
			return;
		
		this.setBackground(NORMAL_BUILD_COLOR);
	}

	public SquareView(Square square) {
		super();
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {//Trigger the square selected code
				for (MoveControlListener moveControlListener : listeners) {
					moveControlListener.selectBlock(SquareView.this);				
				}
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {//Trigger the event to start a move
				for (MoveControlListener moveControlListener : listeners) {
					moveControlListener.startMove(SquareView.this);				
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {//Trigger the event to end a move
				for (MoveControlListener moveControlListener : listeners) {
					moveControlListener.endMove();
					
				}
			}
		});
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for (ToolControlListener toolControlListener : toolListeners) {
					toolControlListener.useTool(SquareView.this.getSquare().getLoc());
				}
			}
		});
		
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0) {
			if(blockView != null){
				
				blockView.setSize(getWidth() - 10, getHeight() -10);
			}
			}
		});
		this.square = square;
		setLayout(new BorderLayout());
		add(getBlockView(), BorderLayout.CENTER);
		setBackground(NORMAL_COLOR);
		this.update();
		this.setVisible(true);
		
	}
	
	public BlockView getBlockView() {
		if (blockView == null) {
			blockView = new BlockView(square.getBlock());			//**** review later *****************************
		}
		return blockView;
	}
	public void update() {
		
		getBlockView().setBlock(square.getBlock());
			
		
	}

	@Override
	public void squareChanged() {
		
		if (square.getEliminated())
			setBackground(new Color(ELIMINATED_COLOR));
		else
			if (square.isRelease())
				setBackground(new Color(RELEASE_COLOR));
			else
				setBackground(NORMAL_COLOR);
		
	}
	
}
