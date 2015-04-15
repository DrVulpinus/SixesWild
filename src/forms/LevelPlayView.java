package forms;

import java.awt.EventQueue;

import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import src.SixesWildWindow;
import src.TestJPanel;

import java.awt.FlowLayout;
import java.awt.BorderLayout;

import javax.swing.BoxLayout;

import java.awt.GridLayout;

import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;
public class LevelPlayView extends JPanel {
	private JButton btnBack;
	
	public LevelPlayView() {
		/*setLayout(new MigLayout("", "[][][grow][][grow]", "[][][grow]"));
		
		TestJPanel testJPanel = new TestJPanel();
		add(testJPanel, "flowx,cell 0 0 3 3,grow");
		
		GameGridView gameGridView = new GameGridView();
		add(gameGridView, "cell 4 2,grow");

		*/
		
		setLayout(null);
		
		GameGridView gameGridView = new GameGridView();
		gameGridView.setBounds(157, 55, 212, 196);
		add(gameGridView);
		
		SpecialMoveView specialMoveView = new SpecialMoveView();
		specialMoveView.setBounds(360, 73, 179, 155);
		add(specialMoveView);
		
		TestJPanel testJPanel = new TestJPanel();
		testJPanel.setBounds(6, -25, 143, 360);
		add(testJPanel);
		
		//btnBack.setBounds(395, 20, 117, 29);
		add(getbtnBack());
		
		//GameGridView gameGridView = new GameGridView();
		//getContentPane().add(gameGridView);
	}

	JButton getbtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.setSize(117, 29);
			btnBack.setLocation(395, 20);
		}
		return btnBack;
	}
}

