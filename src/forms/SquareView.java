package forms;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;

import Interfaces.MoveControlListener;
import entities.Square;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

public class SquareView extends JPanel
{
	static final int NORMAL_COLOR = 0xFFFFFF;
	static final int ELIMINATED_COLOR = 0xFF0000;
	ArrayList<MoveControlListener> listeners = new ArrayList<MoveControlListener>();
	Square square;
	public Square getSquare() {
		return square;
	}

	public void setSquare(Square square) {
		this.square = square;
	}

	BlockView blockView;
	public void addMoveControlListener(MoveControlListener mcl){
		listeners.add(mcl);
	}

	public SquareView(Square square) {
		super();
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {//Trigger the square selected code
				for (MoveControlListener moveControlListener : listeners) {
					moveControlListener.selectBlock(SquareView.this);				
				}
				
				System.out.println("mouseMoved for select block");
			}
		});
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {//Trigger the event to start a move
				for (MoveControlListener moveControlListener : listeners) {
					moveControlListener.startMove();				
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {//Trigger the event to end a move
				for (MoveControlListener moveControlListener : listeners) {
					moveControlListener.endMove();				
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
		//setLayout(new MigLayout("", "[5px][382.00px,grow,fill][5px]", "[5px][35.00,grow,fill][5px]"));
		setLayout(new BorderLayout());
		//setSize(381, 239);
		//add(getBlockView(), "cell 1 1,grow");
		add(getBlockView(), BorderLayout.CENTER);
		this.setVisible(true);
		
	}
	
	BlockView getBlockView() {
		if (blockView == null) {
			blockView = new BlockView(square.getBlock());			//**** review later *****************************
		}
		return blockView;
	}
	
//	public void setBlockView(BlockView blockView) {
//		remove(this.blockView);
//		this.blockView = blockView;
//		add(getBlockView(), "cell 1 1,grow");
//	}
	/*
	@Override
	public void setSize(int width, int height)
	{
		super.setSize(width, height);
		
		try {
			//blockView.setSize(width - 10, height - 10);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}*/

	public void update() {
		
//		if (square.getBlock() == null) {		//update view for the absence of a BlockView
//			//remove(blockView);
//			//setBlockView(null);
//			blockView.setVisible(false);
//		} else if (getBlockView() == null && square.getBlock() != null) {	//update view for the presence of a BlockView
//			setBlockView(new BlockView(square.getBlock()));
//		}
//		else 
//			blockView.setVisible(true);
		blockView.setBlock(square.getBlock());
				
		if (square.getEliminated())
			setBackground(new Color(ELIMINATED_COLOR));
		else
			setBackground(new Color(NORMAL_COLOR));
	}
	

}
