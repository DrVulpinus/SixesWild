package Interfaces;

import java.util.EventListener;


import forms.SquareView;

/**
 * An event listener for a move. Contains a number of methods
 * to provide how a move behaves.
 * @author Miya
 *
 */
public interface MoveControlListener  extends EventListener{

	public void performMove();
	public void startMove(SquareView sV);
	public void selectBlock(SquareView sV);
	public void endMove();

}
