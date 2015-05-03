package entities;

/**
 * A release block present in Release levels. Not the same as a Block, as it
 * does not contain a multiplier or a value and only cares about 6 blocks.
 * @author Miya
 *
 */
public class ReleaseBlock extends Square{

	Location l;
	Square s;
	
	ReleaseBlock (Location l, Square s){
		this.l = l;
		this.s = s;
	}
	
	/**
	 * Returns true if there is a six block adjacent to the release block's location.
	 * @return
	 */
	public boolean isSixAdjacent(){
		if ((l.isAdjacentTo(s.getLoc())) && (s.getBlock().getValue() == 6)){
			return true;
		}
		return false;
	}

}
