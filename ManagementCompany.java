package propertyManager;


/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Creates a rectangular plot that has methods overlaps, encompasses, and toString
 * Due: 10/28/2024
 * Platform/compiler: Eclipse/Java
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Alayna Goss
*/
public class ManagementCompany {

	//Instance variables
	public String name;
	public String taxId;
	public double feePercentage;
	
	public final int MAX_PROPERTY = 5;
	public final int MGMT_WIDTH = 10;
	public final int MGMT_DEPTH = 10;
	
	public Property[] properties = new Property[MAX_PROPERTY];
	public Plot plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	public int numberOfProperties;
	
	//Constructor with minimal info
	public ManagementCompany(String name, String taxId, double feePercentage)
	{
		this.name = name;
		this.taxId = taxId;
		this.feePercentage = feePercentage;
	}
	
	//Constructor with property arrays and plots
	public ManagementCompany(String name, String taxId, double feePercentage, Property[] properties, Plot plot,
			int numberOfProperties) {
		super();
		this.name = name;
		this.taxId = taxId;
		this.feePercentage = feePercentage;
		this.properties = properties;
		this.plot = plot;
		this.numberOfProperties = numberOfProperties;
	}


	//Method to add property to the properties array
	public int addProperty(Property property)
	{
		
		
		
		if (numberOfProperties >= MAX_PROPERTY)
		{
			//If the properties array is already full, return -1
			return -1;
		}
		else if(property == null)
		{
			//If the new property is null, return -3
			return -2;
		}
		else if(!property.plot.encompasses(plot))
		{
			
			
			
			//If the new property is encompassed by an existing property, return -3
			return -3;
		}
		else
		{


			for(int i = 0; i < numberOfProperties; i++)
			{
			
				
				if(property.plot.overlaps(properties[i].plot))
				{
					//If the new property overlaps any other properties, return -4
					return -4;
				}
				
			}
			
			
		}		

	
			
		//If the new property doesn't have any other issues, add it to the proprties array and increment numberOfProperties
		properties[numberOfProperties] = property;
		return numberOfProperties++;
		
	}
	
	
	public int getTotalRent()
	{
		
		//Calculate the rent of all properties in the properties array
		int temp = 0;
		for(int i = 0; i < numberOfProperties; i++)
		{
			temp += properties[i].getRentAmount(); 
		}
		return temp;
		
		
		
	}
	
	public Property getHighestRentProperty()
	{
		
		//Find the property with the highest rent, and return it's rent value
		double temp = 0;
		int tempIndex = 0;
		for(int i = 0; i < numberOfProperties; i++)
		{
			if(properties[i].getRentAmount() > temp)
			{
				temp = properties[i].getRentAmount();
				tempIndex = i;
			}
		}
		
		return properties[tempIndex];
	}
	
	//Delete the last property in the array
	public void removeLastProperty()
	{
		properties[numberOfProperties-1] = null;
	}
	
	
	//If the properties array is full, return true
	public boolean isPropertiesFull()
	{
		if (numberOfProperties >= 5)
		{
			return true;
		}
		return false;
	}
	
	//Return the number of properties in the array
	public int getPropertiesCount()
	{
		return numberOfProperties;
	}
	
	//If management fee is between 0-100 (not inclusive), return true
	public boolean isManagementFeeValid()
	{
		if((feePercentage > 0) && (feePercentage < 100))
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		String temp = "";
		temp += ("List of the properties for " + name + ", taxID: " + taxId);
		temp += ("\n______________________________________________________");
		
		System.out.println(numberOfProperties);
		
		for(int i = 0; i < numberOfProperties; i++)
		{
			temp += "\n" + properties[i].toString();
		}
		temp += ("\n______________________________________________________");
		
		
		double totalFee = 0;
		
		for(int i = 0; i < numberOfProperties; i++)
		{
			totalFee += (properties[i].getRentAmount()) * feePercentage/100;
		}
		
		
		temp += ("\n\n total management Fee: " + totalFee);
		
		
		return temp;
	}
	
	
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	public double getFeePercentage() {
		return feePercentage;
	}
	public void setFeePercentage(double feePercentage) {
		this.feePercentage = feePercentage;
	}
	public Property[] getProperties() {
		return properties;
	}
	public void setProperties(Property[] properties) {
		this.properties = properties;
	}
	public Plot getPlot() {
		return plot;
	}
	public void setPlot(Plot plot) {
		this.plot = plot;
	}
	public int getNumberOfProperties() {
		return numberOfProperties;
	}
	public void setNumberOfProperties(int numberOfProperties) {
		this.numberOfProperties = numberOfProperties;
	}
	
	
}
