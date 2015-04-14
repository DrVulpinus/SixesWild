package forms;


import java.util.Timer;
import java.util.TimerTask;


public class ShowSplashScreen {
	
	public static void main(String[] args) throws InterruptedException {
		int splashscreenTime = 3000;
		   Timer timer = new Timer(); 
           TimerTask task = new TimerTask() {  
        	   SplashScreenView s =new SplashScreenView();
                 @Override
                  public void run() {  
                          s.setVisible(true);
                 }
           };
           timer.schedule(task,splashscreenTime);
          
           //Thread.sleep(100000);      
	}
}





