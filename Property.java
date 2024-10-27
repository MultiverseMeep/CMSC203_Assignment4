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
public class Property {

	
	//Default values
	public String name;
	public String city;
	public double rentAmount;
	public String owner;
	public Plot plot = new Plot(0, 0, 1, 1);
	
	
	//Constructor for minimal information
	public Property(String name, String city, double rentAmount, String owner)
	{
		this.name = name;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
	}
	
	//Constructor if you already have a plot object
	public Property(String name, String city, double rentAmount, String owner, Plot plot)
	{
		this.name = name;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = plot;
	}
	
	//Constructor to create a plot with your property
	public Property(String name, String city, double rentAmount, String owner, int x, int y, int width, int depth)
	{
		this.name = name;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot.x = x;
		plot.y = y;
		plot.width = width;
		plot.depth = depth;
		
		
	}
	
	
	
	
	//Getters and setters
	public String toString()
	{
		return (name + "," + city + "," + owner + "," + Double.toString(rentAmount)); 
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public double getRentAmount() {
		return rentAmount;
	}


	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public Plot getPlot() {
		return plot;
	}


	public void setPlot(Plot plot) {
		this.plot = plot;
	}


	public String getPropertyName() {
		return name;
	}
	
	public void setPropertyName(String name)
	{
		this.name = name;
	}
	
	
}
