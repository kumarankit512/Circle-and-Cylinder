public class Cylinder
{
	private double myHeight;
	private Circle myCircleBase;
	
	/**
	 * Default constructor method for the cylinder
	 */
	public Cylinder()
	{
		myHeight = 6.0;
		myCircleBase = new Circle ();
	}
	
	/**
	 * Second constructor method for the cylinder with two parameters, height and radius
	 * @param height - height of the cylinder
	 * @param radius - radius of the circle base
	 */
	public Cylinder (double height, double radius) 
	{
		myHeight = height;
		myCircleBase = new Circle(radius);
	}
	
	/**
	 * Accessor Method for the height of the cylinder
	 * @return - returns the height of the cylinder 
	 */
	public double getHeight() 
	{
		return myHeight;
	}
	
	/**
	 * Accessor Method for the circle base of the cylinder
	 * @return - returns the circle base of the cylinder 
	 */
	public Circle getCircleBase() 
	{
		return myCircleBase;
	}
	
	/**
	 * Mutator Method for the height of the cylinder
	 * @param - Changes the value of the height of the cylinder
	 */
	public void setHeight (double height) 
	{
		myHeight = height;
	}
	
	/**
	 * Mutator Method for the circle base of the cylinder
	 * @param - Changes the value of the circle base depending on the circle radius
	 */
	public void setBase (double radius) 
	{
		myCircleBase = new Circle (radius);  
	}
	
	/**
	 * Helper method for calculating the volume of the cylinder
	 * @return - Returns the volume of the cylinder
	 */
	public double calcVolume() 
	{
		return myCircleBase.calcArea() * myHeight;
	}
	
	/**
	 * Helper method for calculating the surface area of the cylinder
	 * @return - Returns the surface area of the cylinder
	 */
	public double calcSurfaceArea() 
	{
		return (myCircleBase.calcCircumference() * myHeight) + (2 * myCircleBase.calcArea());
	}
	
	/**
	 * 
	 * @param two - Second cylinder which needs to be tested 
	 * @return - Returns a true of false depending on the output of the volume and 
	 * 			 surface area of two cylinders after being compared
	 */
	public boolean equals(Cylinder two)
	{
		if(myHeight == two.getHeight() && myCircleBase.equals(two.getCircleBase()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * The toString method which prints the attributes of the cylinder. 
	 */
	public String toString() 
	{
		return "\nHeight: " + myHeight + "\n" + myCircleBase;
	}
}