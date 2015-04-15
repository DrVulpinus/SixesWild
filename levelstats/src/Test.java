package src;

import javax.swing.JFrame;

import forms.LevelPlayView;

public class Test extends JFrame
	{
		

		public static void main(String[] args)
		{
			Test t = new Test();
			LevelPlayView test = new LevelPlayView();
			
			test.setVisible(true);
			t.setContentPane(test);
			t.setVisible(true);
			

		}
	}

