package forms;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;

import entities.Square;

public class SquareView extends JPanel
{
	static final int NORMAL_COLOR = 0xFFFFFF;
	static final int ELIMINATED_COLOR = 0xFF0000;
	
	Square square;
	BlockView blockView;


	public SquareView(Square square) {
		super();
		this.square = square;
		setLayout(new MigLayout("", "[5px][382.00px,grow,fill][5px]", "[5px][35.00,grow,fill][5px]"));
		setSize(50, 50);
		add(getBlockView(), "cell 1 1,grow");
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
