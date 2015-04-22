package Interfaces;

import java.util.EventListener;


import forms.SquareView;

public interface MoveControlListener  extends EventListener{

	void performMove();
	void startMove();
	void selectBlock(SquareView sV);
	void endMove() ;

}
