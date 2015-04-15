package forms;

import javax.swing.JPanel;
import javax.swing.JButton;

import entities.Block;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class BlockView extends JPanel
{
	static final int NORMAL_COLOR = 0xFFFF00;
	static final int SELECTED_COLOR = 0xFF0000;
	
	static final String[][] icons = new String[6][3];
	
	static {

		for (int value = 1; value <= 6; value++) {
			for (int mult = 1; mult <= 3; mult++) {
				icons[value - 1][mult - 1] = new String(value + " x" + mult);
			}
		}
		System.out.println("static" + icons[0][1]);
	}
	
	
	Block block;
	JLabel label;
	String icon;

	public BlockView(Block block) {
		super();
		this.block = block;
		setLayout(new BorderLayout(0, 0));
		add(getLabel(), BorderLayout.CENTER);
		update();
		
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
		
		if (block == null)
			getLabel().setText("");
		else
			getLabel().setText(icons[block.getValue() - 1][block.getMultiplier() - 1]);
	}
	
	JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
		}
		return label;
	}
}
