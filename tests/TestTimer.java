import static org.junit.Assert.*;

import javax.swing.JTextField;

import org.junit.Test;

import entities.Timer;


public class TestTimer {

	@Test
	public void test() {
		JTextField _tf = new JTextField();
		Timer timer = new Timer(_tf);
		Timer timer1 = new Timer();
		
		timer.startTimer();
		
		assertEquals(true,timer.getRunning());
		timer.stopTimer();
		assertEquals(false,timer.getRunning());
	}

}
