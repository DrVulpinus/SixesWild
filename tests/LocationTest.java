import static org.junit.Assert.*;

import org.junit.Test;

import entities.Location;


public class LocationTest {

	@Test
	public void test() {
		Location location = new Location(0,0);
		assertEquals(0,location.getRow());
		assertEquals(0,location.getCol());
		
		location.setRow(1);
		assertEquals(1,location.getRow());
		location.setCol(1);
		assertEquals(1,location.getRow());
	
	}

}
