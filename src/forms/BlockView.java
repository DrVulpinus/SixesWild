package forms;

import javax.swing.JPanel;
import javax.swing.JButton;

import entities.Block;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

public class BlockView extends JPanel
{
	Block block;
	JButton button;
	//Icon icon;

	public BlockView(Block block) {
		super();
		this.block = block;
		setLayout(new BorderLayout(0, 0));
		add(getButton(), BorderLayout.CENTER);
//		button.setIcon(icon.getImage());
		
	}
	
	JButton getButton() {
		if (button == null) {
			button = new JButton("");
		}
		return button;
	}
	
	public void addActionListener(ActionListener al) {
		button.addActionListener(al);
	}
	
	public void update() {
		button.setText(block.getNumber() + "\n\n" + "x" + block.getMultiplier());
	}
}
