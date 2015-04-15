package forms;


import java.util.Timer;
import java.util.TimerTask;


public class StartProgram {
	static SplashScreenView s =new SplashScreenView();
	
	public static void main(String[] args) throws InterruptedException {
		int splashscreenTime = 3000;
		   Timer timer = new Timer(); 
		   s.setVisible(true);
           TimerTask task = new TimerTask() {          	   
                 @Override
                  public void run() {  
                          s.setVisible(false);
                          MainMenuView mMV = new MainMenuView();
                          mMV.setVisible(true);
                 }
           };
           timer.schedule(task,splashscreenTime);
          
           //Thread.sleep(100000);      
	}
}





