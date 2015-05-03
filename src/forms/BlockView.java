package forms;

import icons.*;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import entities.Block;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/**
 * Shows one block. Contains all the different icons for different values in the blocks.
 * @author Miya
 *
 */
public class BlockView extends JLabel
{
	static final int NORMAL_COLOR = 0xFFFF00;
	static final int SELECTED_COLOR = 0xFF0000;

	static final Icon[][] icons = new Icon[6][3];

	static {

		// store all the icons
		icons[0][0] = new Icon1x1();
		icons[0][1] = new Icon1x2();
		icons[0][2] = new Icon1x3();
		icons[1][0] = new Icon2x1();
		icons[1][1] = new Icon2x2();
		icons[1][2] = new Icon2x3();
		icons[2][0] = new Icon3x1();
		icons[2][1] = new Icon3x2();
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

	}


	Block block;
	String icon;
	JLabel label;
	ImageIcon smallIco;
	ImageIcon largeIco;


	public BlockView(Block block) {
		// case for resizing the block proportionate to the screen
		super();
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				onResize();
			}
		});

		// initialize the block
		this.block = block;
		this.setIcon(null);

		// update the block
		update();

		// show the block after it has been set up
		this.setVisible(true);

	}

	/**
	 * When the window is resized, resize the image of the block accordingly.
	 */
	public void onResize(){
		update();
	}

	/**
	 * Adds an action listener to the blockView.
	 * @param al The action listener being added to the blockView.
	 */
	public void addActionListener(ActionListener al) {
		this.addActionListener(al);
	}

	/**
	 * Resizes the image of the block when called.
	 */
	public void update() {

		if (block == null)
			this.setIcon(null);
		else {
			if (block.isSelected()){
				this.setIcon(icons[block.getValue() - 1][block.getMultiplier() - 1].getScaledImage(getWidth(), getHeight()));		
			}						
			else{
				this.setIcon(icons[block.getValue() - 1][block.getMultiplier() - 1].getScaledImage(getWidth() - 5, getHeight() - 5));
			}
				
		}
	}

	/**
	 * @return label The Label containing the block icon.
	 */
	public JLabel getLabel() {
		return label;
	}

	/**
	 * @return block The block this blockView shows.
	 */
	public Block getBlock() {
		return block;
	}

	/**
	 * @param block Sets the block to be the current block and updates the image accordingly.
	 */
	public void setBlock(Block block) {
		this.block = block;
		update();
	}

}
