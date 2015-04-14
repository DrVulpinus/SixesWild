package forms;


import java.util.Timer;
import java.util.TimerTask;


public class ShowSplashScreen {
	public static void main(String[] args) throws InterruptedException {
		
		   Timer timer = new Timer(); 
           TimerTask task = new TimerTask() {  
        	   SplashScreenView s =new SplashScreenView();
                 @Override
                  public void run() {  
                          s.setVisible(true);
                 }
           };
           timer.schedule(task,3000);
          
           //Thread.sleep(100000);      
	}
}





