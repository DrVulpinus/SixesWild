import junit.framework.TestCase;
import forms.MainForm;
import forms.StartBuilder;


public class TestBuilding extends TestCase {
	
	public void setUp(){
		
	}
	
	public void tearDown(){
	}
	
	public void testMainForm(){
		MainForm mf = new MainForm();
		mf.setVisible(true);
	}

}
