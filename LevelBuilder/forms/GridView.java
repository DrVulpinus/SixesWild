package forms;

import java.util.ArrayList;
import java.util.Timer;

import javax.swing.JPanel;

public class GridView extends JPanel {

	
	ArrayList<SquareView> squareViews = new ArrayList<SquareView>();
	
	/**
	 * Create the panel.
	 */
	public GridView() {

	}
	public void addSquareView(SquareView _squareView){
		squareViews.add(_squareView);
	}

}
