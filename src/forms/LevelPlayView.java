package forms;

import java.awt.EventQueue;

import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import src.SixesWildWindow;
import src.StatsView;

import java.awt.FlowLayout;
import java.awt.BorderLayout;

import javax.swing.BoxLayout;

import java.awt.GridLayout;

import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;
public class LevelPlayView extends JPanel {
	private JButton btnBack;
	
	public LevelPlayView() {
		setLayout(new MigLayout("", "[][143px,grow,fill][130px:n,left]", "[150px:n,grow,fill][]"));
		
		StatsView testJPanel = new StatsView();
		add(testJPanel, "cell 0 0,grow");
		
		GameGridView gameGridView = new GameGridView();
		add(gameGridView, "cell 1 0,grow");
		
		SpecialMoveView specialMoveView = new SpecialMoveView();
		add(specialMoveView, "cell 2 0,alignx right,aligny top");
		
		//btnBack.setBounds(395, 20, 117, 29);
		add(getbtnBack(), "cell 2 1,growx,aligny bottom");
		
		//GameGridView gameGridView = new GameGridView();
		//getContentPane().add(gameGridView);
	}

	JButton getbtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
		}
		return btnBack;
	}
}

