package forms;


/**
 * Runs the application, calls the splash screen to start,
 * then removes the splash screen and calls the MainFrame 
 * to put up the main menu.
 *
 */
public class StartProgram {
	// initialize the splash screen
	static SplashScreenView s =new SplashScreenView();

	public static void main(String[] args) {
		// show splash screen
		s.setVisible(true);

		try {
			// stay up for 3000 units of time
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// remove and replace with MainFrame
		s.dispose();
		MainFrame mMV = new MainFrame();
		mMV.setVisible(true);

	}
}





