package forms;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SpecialMoveView extends JPanel {

	/**
	 * Create the panel.
	 */
	public SpecialMoveView() {
		setLayout(new MigLayout("", "[][][][][][][][][]", "[][][][][][][][]"));
		
		JLabel lblSpecialMoves = new JLabel("Special Moves");
		lblSpecialMoves.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblSpecialMoves, "cell 5 0");
		
		JButton btnNewButton = new JButton("Swap Square");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnNewButton, "cell 5 3,aligny center");
		
		JButton btnNewButton_1 = new JButton("Remove Square");
		add(btnNewButton_1, "cell 5 4");
		
		JButton btnNewButton_2 = new JButton("Reset Board");
		add(btnNewButton_2, "cell 5 5");

	}

}
