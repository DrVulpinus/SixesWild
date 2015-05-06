import static org.junit.Assert.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.junit.Test;

import src.PuzzleStatsView;
import controllers.LevelController;
import controllers.MoveController;
import entities.Level;
import entities.LevelPlayState;
import entities.LevelType;
import forms.LevelPlayView;
import forms.MainFrame;


public class TestLevelPlayView {

	private String clickType;
	
	@Test
	public void test() {
		Level l = new Level(LevelType.PUZZLE);
		LevelPlayState lps = new LevelPlayState();
		PuzzleStatsView psv = new PuzzleStatsView(l.getStats());
		MoveController mc = new MoveController(l, lps);
		LevelPlayView lpv = new LevelPlayView(l, mc, psv);
		MainFrame mf = new MainFrame();
		LevelController lc = new LevelController(l, mf);
		
		ActionListener al = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent ae) {
				clickType = ae.getActionCommand();
				
			}
			
		};
		
		JButton back = lpv.getbtnBack();
		back.addActionListener(al);
		back.doClick();
		//assertEquals(mf.getMainMenuView(),mf.getContentPane());
		
	}

}
