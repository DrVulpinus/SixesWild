package forms;

import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import javax.management.InstanceNotFoundException;
import javax.management.timer.TimerMBean;
import javax.swing.JLabel;

import entities.Level;

public class LevelSelectView extends SelectView  implements TimerMBean{

	ArrayList<Level> levels = new ArrayList<Level>();
	@Override
	void loadItems() {
		for (Level level : levels) {
			JLabel label = new JLabel();
			label.setIcon(level.getIcon().getImage());
			items.add(label);
		}
		super.loadItems();//Do this last to add all of the items to the scrollPane
		Timer tmr = new Timer();
		tmr.schedule(thisTask(), 10000);
		
	}
	
	
	public TimerTask thisTask(){
		
		
		return null;
		
	}


	@Override
	public Integer addNotification(String arg0, String arg1, Object arg2,
			Date arg3) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Integer addNotification(String arg0, String arg1, Object arg2,
			Date arg3, long arg4) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Integer addNotification(String arg0, String arg1, Object arg2,
			Date arg3, long arg4, long arg5) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Integer addNotification(String arg0, String arg1, Object arg2,
			Date arg3, long arg4, long arg5, boolean arg6)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Vector<Integer> getAllNotificationIDs() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Date getDate(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean getFixedRate(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int getNbNotifications() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public Long getNbOccurences(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Vector<Integer> getNotificationIDs(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getNotificationMessage(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getNotificationType(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object getNotificationUserData(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Long getPeriod(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean getSendPastNotifications() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void removeAllNotifications() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removeNotification(Integer arg0)
			throws InstanceNotFoundException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removeNotifications(String arg0)
			throws InstanceNotFoundException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setSendPastNotifications(boolean arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}
