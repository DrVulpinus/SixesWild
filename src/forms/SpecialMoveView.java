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
	public SpecialMoveView() {
		setLayout(new MigLayout("", "[grow,center]", "[grow,bottom][][][grow,top]"));
		
		JLabel lblSpecialMoves = new JLabel("Special Moves");
		lblSpecialMoves.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblSpecialMoves, "cell 0 0");
		
		JButton btnNewButton = new JButton("Swap Square");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnNewButton, "cell 0 1,aligny center");
		
		JButton btnNewButton_1 = new JButton("Remove Square");
		add(btnNewButton_1, "cell 0 2");
		
		JButton btnNewButton_2 = new JButton("Reset Board");
		btnNewButton_2.setMinimumSize(new Dimension(0, 0));
		add(btnNewButton_2, "cell 0 3");

	}

}
