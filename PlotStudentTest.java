package propertyManager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * 
 * @author Alayna Goss
 * @version 10/27/2024
 * 
 */
public class PlotStudentTest {
	private Plot plot1, plot5;
	private Plot plot10, plot11;
	private Plot plot20, plot21;

	@BeforeEach
	public void setUp() throws Exception {
		plot1 = new Plot(2, 2, 6, 6);
		plot5 = new Plot(3, 4, 4, 3);
		plot10 = new Plot(5, 5, 2, 2);
		plot11 = new Plot(2, 2, 2, 5);
		plot20 = new Plot(5, 5, 5, 5);
		plot21 = new Plot(6, 6, 2, 2);
	}

	@AfterEach
	public void tearDown() throws Exception {
		plot1 = plot5 = null;
		plot10 = plot11 = null;
	}

	@Test
	public void testOverlaps() {
		assertTrue(plot1.overlaps(plot5)); // plot5 is entirely inside plot1
		assertTrue(!plot10.overlaps(plot11)); //plot 10 does not overlap plot 11
	}
	
	
	@Test
	public void testEncompasses() {
		
		assertTrue(plot21.encompasses(plot20));
	}
	
	@Test
	public void testToString() {
		assertEquals("3,4,4,3",plot5.toString());	
		assertEquals("5,5,2,2", plot10.toString());
	}

}
