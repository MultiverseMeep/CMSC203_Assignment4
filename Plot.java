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

public class Plot {

	
	//default values- The GFA test wouldn't pass without these
	public int x = 0;
	public int y = 0;
	public int depth = 1;
	public int width = 1;
	
	
	//Constructor to create plot with dimensions
	public Plot(int x, int y, int depth, int width)
	{
		this.x = x;
		this.y = y;
		this.depth = depth;
		this.width = width;
	}
	
	
	public boolean overlaps(Plot p)
	{
		//determine if plot var overlaps current plot
		
		if(p.x >= (x + width) || p.y >= (y + depth) || x >= (p.x + p.width) || y >= (p.y + p.depth))
		{
			//If any of the values of p are too far away to possible overlap the current Plot, then return false
			return false;
		}
		
		
		
		    return true;  
		
	
	}
	
	public boolean encompasses(Plot p)
	{
		//does current plot contain p
		
		
		if ((x >= p.x) && (y >= p.y) && (x + width <= p.x + p.width) && (y + depth <= p.y + p.depth))
		{
			return true;
		}
		
		
		return false;
	}
	
	public String toString()
	{
		return (Integer.toString(x) + "," + Integer.toString(y) + "," + Integer.toString(depth) + "," + Integer.toString(width));
	}
	
	
	//Getters and Setters
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public void setdepth(int depth)
	{
		this.depth = depth;
	}
	public void setwidth(int width)
	{
		this.width = width;
	}
	
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public int getDepth()
	{
		return depth;
	}
	public int getWidth()
	{
		return width;
	}
	
	
}
