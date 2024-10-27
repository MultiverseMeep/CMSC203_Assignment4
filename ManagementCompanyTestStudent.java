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

class ManagementCompanyTestStudent {

	Property sampleProperty;
	Property gamerHouse, alaynaHouse;
	ManagementCompany mangementCo ; 
	ManagementCompany alaynaHoldings;
	
	
	@BeforeEach
	public void setUp() throws Exception {
		mangementCo= new ManagementCompany("Railey", "555555555",6);
		alaynaHoldings = new ManagementCompany("Alayna", "nyoom", 99);
	}

	@AfterEach
	public void tearDown() throws Exception {
		mangementCo=null;
		alaynaHoldings = null;
	}

	@Test
	public void testAddProperty() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);		 
		assertEquals(mangementCo.addProperty(sampleProperty),0,0);	//property has been successfully added to index 0
		
		
		gamerHouse = new Property("Gamer House", "Derwood", 2290, "Alayna Holdings LLC", 8, 8, 2, 2);
		alaynaHouse = new Property("Alayna's Apartment", "Derwood", 2290, "Alayna Holdings LLC", 0, 0, 2, 2);
		assertEquals(alaynaHoldings.addProperty(gamerHouse), 0,0);
		assertEquals(alaynaHoldings.addProperty(alaynaHouse), 1,0);
	}
	
	@Test
	public void testGetPropertiesCount() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);		 
		assertEquals(mangementCo.addProperty(sampleProperty),0,0);	
		assertEquals(mangementCo.getPropertiesCount(), 1);
		
		
		gamerHouse = new Property("Gamer House", "Derwood", 2290, "Alayna Holdings LLC", 8, 8, 2, 2);
		alaynaHouse = new Property("Alayna's Apartment", "Derwood", 2290, "Alayna Holdings LLC", 0, 0, 2, 2);
		assertEquals(alaynaHoldings.addProperty(gamerHouse), 0,0);
		assertEquals(alaynaHoldings.addProperty(alaynaHouse), 1,1);
		assertEquals(alaynaHoldings.getPropertiesCount(), 2);
	}

	@Test
	public void testToString() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613.0, "BillyBob Wilson",2,5,2,2);
		assertEquals(mangementCo.addProperty(sampleProperty), 0);	//property has been successfully added to index 0
		String expectedString = "List of the properties for Railey, taxID: 555555555\n"
				+ "______________________________________________________\n"
				+ "Sunsational,Beckman,BillyBob Wilson,2613.0\n"
				+ "______________________________________________________\n"
				+"\n"
				+ " total management Fee: 156.78";
		System.out.println(expectedString);
		System.out.println(mangementCo.toString());
		assertEquals(expectedString, mangementCo.toString());
				
		gamerHouse = new Property("Gamer House", "Derwood", 2290, "Alayna Holdings LLC", 8, 8, 2, 2);
		alaynaHouse = new Property("Alayna's Apartment", "Derwood", 2290, "Alayna Holdings LLC", 0, 0, 2, 2);
		
		assertEquals(alaynaHoldings.addProperty(gamerHouse), 0);	//property has been successfully added to index 0
		assertEquals(alaynaHoldings.addProperty(alaynaHouse), 1);	//property has been successfully added to index 1
		
		String alaynaExpectedString = "List of the properties for Alayna, taxID: nyoom\n"
				+ "______________________________________________________\n"
				+ "Gamer House,Derwood,Alayna Holdings LLC,2290.0\n"
				+ "Alayna's Apartment,Derwood,Alayna Holdings LLC,2290.0\n"
				+ "______________________________________________________\n"
				+"\n"
				+ " total management Fee: 4534.2";
		System.out.println(alaynaExpectedString);
		System.out.println(alaynaHoldings.toString());
		assertEquals(alaynaExpectedString, alaynaHoldings.toString());
		
	}

}
