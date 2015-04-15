package forms;

import icons.*;

import javax.swing.JPanel;
import javax.swing.JButton;

import entities.Block;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class BlockView extends JPanel
{
	static final int NORMAL_COLOR = 0xFFFF00;
	static final int SELECTED_COLOR = 0xFF0000;
	
	static final Icon[][] icons = new Icon[6][3];
	
	static {
		
		icons[0][0] = new Icon1x1();
		icons[0][1] = new Icon1x2();
		icons[0][2] = new Icon1x3();
		icons[1][0] = new Icon2x1();
		icons[1][1] = new Icon2x2();
		icons[1][2] = new Icon2x3();
		icons[2][0] = new Icon3x1();
		icons[2][1] = new Icon4x2();
		icons[2][2] = new Icon3x3();
		icons[3][0] = new Icon4x1();
		icons[3][1] = new Icon4x2();
		icons[3][2] = new Icon4x3();
		icons[4][0] = new Icon5x1();
		icons[4][1] = new Icon5x2();
		icons[4][2] = new Icon5x3();
		icons[5][0] = new Icon6x1();
		icons[5][1] = new Icon6x2();
		icons[5][2] = new Icon6x3();

//		for (int value = 1; value <= 6; value++) {
//			for (int mult = 1; mult <= 3; mult++) {
//				icons[value - 1][mult - 1] = new String(value + " x" + mult);
//			}
//		}
	}
	
	
	Block block;
	String icon;
	JLabel label;

	public BlockView(Block block) {
		super();
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0) {
				System.out.println("resized");
				update();
			}
		});
		this.block = block;
		setLayout(new BorderLayout());
		add(getLabel(), BorderLayout.CENTER);
		update();
		
	}
	
	JLabel getLabel() {
		if (label == null)
			label = new JLabel("");
		return label;
	}
	
	public void addActionListener(ActionListener al) {
		this.addActionListener(al);
	}
	
	public void update() {
//		if (block == null) {
//			this.setVisible(false);
//			return;
//		}
//		else
//			this.setVisible(true);
		

//		if (block == null)
//			getLabel().setText("");
//		else
//			getLabel().setText(icons[block.getValue() - 1][block.getMultiplier() - 1]);
		
		if (block == null)
			getLabel().setIcon(null);
		else
			getLabel().setIcon(icons[block.getValue() - 1][block.getMultiplier() - 1].getScaledImage(getWidth(), getHeight()));
	}

	public Block getBlock() {
		return block;
	}

	public void setBlock(Block block) {
		this.block = block;
	}
	
//	@Override
//	public void repaint() {
//		super.repaint();
//		
//		try {
//			update();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
		
}
