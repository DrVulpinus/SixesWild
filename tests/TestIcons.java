import static org.junit.Assert.*;
import icons.Icon;
import icons.Icon1x1;
import icons.Icon1x2;
import icons.Icon1x3;
import icons.Icon2x1;
import icons.Icon2x2;
import icons.Icon2x3;
import icons.Icon3x1;
import icons.Icon3x2;
import icons.Icon3x3;
import icons.Icon4x1;
import icons.Icon4x2;
import icons.Icon4x3;
import icons.Icon5x1;
import icons.Icon5x2;
import icons.Icon5x3;
import icons.Icon6x1;
import icons.Icon6x2;
import icons.Icon6x3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestIcons {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Icon1x1 icon1x1 = new Icon1x1();
		Icon1x2 icon1x2 = new Icon1x2();
		Icon1x3 icon1x3 = new Icon1x3();
		
		Icon2x1 icon2x1 = new Icon2x1();
		Icon2x2 icon2x2 = new Icon2x2();
		Icon2x3 icon2x3 = new Icon2x3();
		
		Icon3x1 icon3x1 = new Icon3x1();
		Icon3x2 icon3x2 = new Icon3x2();
		Icon3x3 icon3x3 = new Icon3x3();
		
		Icon4x1 icon4x1 = new Icon4x1();
		Icon4x2 icon4x2 = new Icon4x2();
		Icon4x3 icon4x3 = new Icon4x3();
		
		Icon5x1 icon5x1 = new Icon5x1();
		Icon5x2 icon5x2 = new Icon5x2();
		Icon5x3 icon5x3 = new Icon5x3();
		
		Icon6x1 icon6x1 = new Icon6x1();
		Icon6x2 icon6x2 = new Icon6x2();
		Icon6x3 icon6x3 = new Icon6x3();
		
		testIcon(icon1x1);
		testIcon(icon1x2);
		testIcon(icon1x3);
		
		testIcon(icon2x1);
		testIcon(icon2x2);
		testIcon(icon2x3);
		
		testIcon(icon3x1);
		testIcon(icon3x2);
		testIcon(icon3x3);
		
		testIcon(icon4x1);
		testIcon(icon4x2);
		testIcon(icon4x3);
		
		testIcon(icon5x1);
		testIcon(icon5x2);
		testIcon(icon5x3);
		
		testIcon(icon6x1);
		testIcon(icon6x2);
		testIcon(icon6x3);
	}

	private void testIcon(Icon ico){
		assertNotNull(ico.getImage());
		assertNull(ico.getText());
		ico.setImage(null);
		assertNull(ico.getImage());
		ico.setText("Hi");
		assertEquals("Hi", ico.getText());
	}
}
