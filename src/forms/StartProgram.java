package forms;


import java.util.Timer;
import java.util.TimerTask;


public class StartProgram {
	static SplashScreenView s =new SplashScreenView();
	//static Timer timer = new Timer(); 
	public static void main(String[] args) {
		int splashscreenTime = 3000;		   
		   s.setVisible(true);
		   
		   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   s.dispose();
		  
		   
           MainFrame mMV = new MainFrame();
           mMV.setVisible(true);
           
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





