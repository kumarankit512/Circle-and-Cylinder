/**
 * @author Ankit Kumar
 * Description: Constructing an object called Circle and Cylinder which use characteristics 
 * 				from one another to calculate certain stuff. 
 * Duration: 180 minutes
 * Honor Code: I did not receive any help from anybody during this project.
 */
public class Circle
{
	private double myRadius;
	
	/**
	 * Default constructor method
	 */
	public Circle()
	{
		myRadius = 5.0;
	}
	
	/**
	 * @param - Parameter for the radius of the circle
	 */
	public Circle (double r) 
	{
		myRadius = r; 
	}
	
	/**
	 * Accessor method for the radius of the circle
	 * @return - Returns the radius of the circle
	 */
	public double getRadius() 
	{
		return myRadius;
	}
	
	/**
	 * Mutator Method for the radius of the circle
	 * @param - Changes the value of the radius
	 */
	public void setRadius (double radius) 
	{
		myRadius = radius;
	}
	
	/**
	 * Helper method for calculating the area of the circle 
	 * @return - Returns the area of the circle
	 */
	public double calcArea() 
	{
		double area = 0.0;
		area = (Math.PI * myRadius * myRadius);
		return area;
	}
	
	/**
	 * Helper method for calculating the circumference of the circle
	 * @return - Returns the circumference of the circle 
	 */
	public double calcCircumference() 
	{
		double circumference = 0.0;
		circumference = (2 * Math.PI * myRadius);
		return circumference;
	}	
	
	/**
	 * Boolean method to test whether Circle x is equal to another circle or not
	 * @param x - Any circle which needs to be checked
	 * @return - Returns a true of false depending on the output of the area and 
	 * 			 circumference of two circles after being compared
	 */
	public boolean equals(Circle x)
	{
		if(myRadius == x.getRadius()) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	/**
	 * The toString method which prints the attributes of the circle. 
	 */
	public String toString() 
	{
		return "Radius: " + myRadius; 
	}
}