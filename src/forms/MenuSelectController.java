package forms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MenuSelectController implements MouseListener, ActionListener{

	MainGameForm menu = new MainGameForm();
	MainMenuView menuview = new MainMenuView();
	MainFrame mainframe = new MainFrame();
	boolean mouseDown = false;

	/*
	MenuSelectController(MainFrame a){
		this.mainframe = a;
	}
	*/
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == menuview.getBtnLevel()){
			menuview.dispose();
			
		}
		
		else if(arg0.getSource() == menuview.getBtnAchievments()){
			
		}
		
	}


}