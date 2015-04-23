package Interfaces;

import java.util.EventListener;


import forms.SquareView;

public interface MoveControlListener  extends EventListener{

	public void performMove();
	public void startMove();
	public void selectBlock(SquareView sV);
	public void endMove() ;

}
