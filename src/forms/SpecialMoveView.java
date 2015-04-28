package forms;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class SpecialMoveView extends JPanel {

	/**
	 * Create the panel.
	 */
	
	JButton swapSquareButton;
	JButton removeSquareButton;
	JButton resetBoardButton;
	JButton btnRegularMove;
	
	
	public SpecialMoveView() {
		setMinimumSize(new Dimension(130, 150));
		setLayout(new MigLayout("", "[grow,center]", "[grow,bottom][][][][grow,top]"));
		
		JLabel lblSpecialMoves = new JLabel("Special Moves");
		lblSpecialMoves.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblSpecialMoves, "cell 0 0");
		
		swapSquareButton = new JButton("Swap Square");
		swapSquareButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnRegularMove = new JButton("Regular Move");
		add(btnRegularMove, "cell 0 1");
		add(swapSquareButton, "cell 0 2,aligny center");
		
		removeSquareButton = new JButton("Remove Square");
		add(removeSquareButton, "cell 0 3");
		
		resetBoardButton = new JButton("Reset Board");
		resetBoardButton.setMinimumSize(new Dimension(0, 0));
		add(resetBoardButton, "cell 0 4");

//		public JButton getBtnNewButton() {
//			if (btnNewButton == null) {
//				btnNewButton = new JButton("Back\n");
//				btnNewButton.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//					}
//				});
//			}
//			return btnNewButton;
//		}
		
		
	}


	public JButton getRegularMoveButton(){
		return btnRegularMove;
	}
	
	public JButton getSwapSquareButton() {
		return swapSquareButton;
	}


	public JButton getRemoveSquareButton() {
		return removeSquareButton;
	}


	public JButton getResetBoardButton() {
		return resetBoardButton;
	}

}
