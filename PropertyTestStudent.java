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

class PropertyTestStudent {
	Property propertyOne, propertyTwo, propertyThree;

	@BeforeEach
	void setUp() throws Exception {
		propertyOne = new Property("Property ABC", "Rockville", 2450.00, "Wells Fargo Bank");
		propertyTwo = new Property("The gamer building", "Derwood", 2290, "Alayna Holdings LLC", 5, 5, 5, 5);
		
		
		Plot test = new Plot(2, 2, 5, 5);
		propertyThree = new Property("The gamer building", "Derwood", 2290, "Alayna Holdings LLC", test);
	}

	@AfterEach
	void tearDown() throws Exception {
		propertyOne = null;
		propertyTwo = null;
	}

	@Test
	void testGetPropertyName() {
		assertEquals("Property ABC", propertyOne.getPropertyName());
		assertEquals("The gamer building", propertyTwo.getPropertyName());
		assertEquals("The gamer building", propertyThree.getPropertyName());
	}

	@Test
	void testGetRentAmount() {
		assertEquals(2450.00, propertyOne.getRentAmount());
		assertEquals(2290.00, propertyTwo.getRentAmount());
		assertEquals(2290.00, propertyThree.getRentAmount());
	}

	@Test
	void testGetPlot() {
		assertEquals(0, propertyOne.getPlot().getX());
		assertEquals(0, propertyOne.getPlot().getY());
		assertEquals(1, propertyOne.getPlot().getWidth());
		assertEquals(1, propertyOne.getPlot().getDepth());
		
		assertEquals(5, propertyTwo.getPlot().getX());
		assertEquals(5, propertyTwo.getPlot().getY());
		assertEquals(5, propertyTwo.getPlot().getWidth());
		assertEquals(5, propertyTwo.getPlot().getDepth());
		
		assertEquals(2, propertyThree.getPlot().getX());
		assertEquals(2, propertyThree.getPlot().getY());
		assertEquals(5, propertyThree.getPlot().getWidth());
		assertEquals(5, propertyThree.getPlot().getDepth());
	}

	@Test
	void testToString() {
		assertEquals("Property ABC,Rockville,Wells Fargo Bank,2450.0",propertyOne.toString());	
		
		assertEquals("The gamer building,Derwood,Alayna Holdings LLC,2290.0",propertyTwo.toString());	
		
		assertEquals("The gamer building,Derwood,Alayna Holdings LLC,2290.0",propertyThree.toString());	
	}

}
