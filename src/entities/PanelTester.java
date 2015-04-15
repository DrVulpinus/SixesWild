package entities;

import javax.swing.JFrame;

import forms.BlockView;
import forms.SquareView;

public class PanelTester extends JFrame
{
	static PanelTester pt;
	
	public static void main(String[] args)
	{
		pt = new PanelTester();
		
		Square sq = new Square();
		Block b = new Block(1, 2);
		sq.setBlock(b);
		BlockView bv = new BlockView(b);
		SquareView sv = new SquareView(sq);
		
		bv.update();
		sv.update();
		
		
		pt.add(sv);
		pt.setBounds(0, 0, 100, 100);
		pt.setVisible(true);

	}
}
