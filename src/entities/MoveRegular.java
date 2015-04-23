package entities;

import java.util.ArrayList;
import java.util.Iterator;

public class MoveRegular extends Move {

	public MoveRegular(Level level, ArrayList<Square> squares) {
		super(level, squares);
		System.out.println("Construct Move Regular");
	}
	
	@Override
	public boolean performMove() {
		if (!isValid())
			return false;
		
		//removes blocks from all squares involved
		for (Iterator<Square> i = getSquaresInvolved().iterator(); i.hasNext();) {
			i.next().setBlock(null);
		}


		System.out.println("Regular Move Performed");
		
		return true;
	}

	@Override
	public boolean isValid() {
		
		int sum = 0;
		
		if (getSquaresInvolved().size() > 6)		//move invalid if there are more than 6 blocks selected
			return false;
		
		for (Square s : super.getSquaresInvolved()) { 
			if (s.getBlock().getValue() == 6)	//move invalid if there is a 6 block selected
				return false;
			
			sum += s.getBlock().getValue();
		}
		
		System.out.println("Block Value Sum: " + sum);
		if (sum != 6)							//move invalid if the sum of block values is not 6
			return false;
		
		if (!super.areSquaresAdjacent())		//move invalid if any selected block is not adjacent to other selected blocks
			return false;
		
		return true;
	}

}
