package entities;


import javax.swing.JTextField;

/**
 * The timer implemented for a lightning level. Starts counting down from a given number of seconds.
 * @author Richard Eberheim
 * @author Agyness Liao
 * @author Alex Wald
 *
 */
public class Timer extends Thread{
	private long startTime;
	private long stopTime;
	private JTextField tf;
	private boolean running = false;
	public Timer(){

	}
	public Timer(JTextField _tf){
		tf = _tf;
	}
	public void startTimer(){
		startTime =  System.currentTimeMillis();
		running = true;
		this.start();
	}
	public void startCountDownTimer(long _seconds){
		startTime = System.currentTimeMillis() + (_seconds*1000);
		running = true;
		this.start();
	}
	public void stopTimer(){
		stopTime = System.currentTimeMillis();
		running = false;
		//this.interrupt();
	}
	public void resetTimer(){
		startTime = 0;
	}
	public long getTimeMillis(){
		return (Math.abs(System.currentTimeMillis() - startTime));
		//return Math.subtractExact(startTime,System.currentTimeMillis());
	}
	public long getTimeSeconds(){
		return (Math.abs(System.currentTimeMillis() - startTime))/1000;
		//return Math.subtractExact(startTime,System.currentTimeMillis())/1000;		
	}
	public String getTimeString(){
		String outTime = "";
		long thisTime = getTimeMillis()/1000;
		if (!running){
			thisTime = (stopTime-startTime)/1000;
		}	
		long hours = thisTime/3600;
		long minutes = (thisTime%3600)/60;
		long seconds = (thisTime%3600)%60;
		outTime = hours + ":" + minutes + ":" + seconds;
		return outTime;
	}

	public boolean getRunning(){
		return running;
	}

	@Override
	public void run(){
		while(true){
			if (tf != null){
				tf.setText(getTimeString());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (this.isInterrupted()){
					return;
				}
			}
		}
	}
}

