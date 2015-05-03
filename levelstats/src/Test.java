package src;

import javax.swing.JFrame;

public class Test extends JFrame
	{
		

		public static void main(String[] args)
		{
			Test t = new Test();
			StatsView test = new StatsView(null);
			
			test.setVisible(true);
			t.setContentPane(test);
			t.setVisible(true);
			

		}
	}

