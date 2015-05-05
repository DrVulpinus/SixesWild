package forms;


import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Start the builder program
 * @author agyness
 */
public class StartBuilder {
	/* create a new splash screen */
	static SplashScreenView s =new SplashScreenView();
	//static Timer timer = new Timer(); 
	
	/**
	 * main function for initializing builder program
	 * @param args
	 */
	public static void main(String[] args) {
		/*set splash screen visible for 3000 ms */
		int splashscreenTime = 3000;		   
		   s.setVisible(true);
		   
		   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   /* get rid of splash screen */
		   s.dispose();
		  
		   /* create them mainform for the builder */
           MainForm mainFrame = new MainForm();
           //MF.setExtendedState(JFrame.MAXIMIZED_BOTH);
           mainFrame.setVisible(true);
           
           
           
           
           /*TimerTask task = new TimerTask() {          	   
                 @Override
                  public void run() {  
                	 s.setVisible(false);
                     s.dispose();
                     MainMenuView mMV = new MainMenuView();
                     mMV.setVisible(true);
                     timer.cancel();
                         
                 }
           };
           timer.schedule(task,splashscreenTime);*/
          
                 
	}
}





