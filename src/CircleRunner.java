/**
 * Runner method for the Circle class which tests the entire code.
 */
public class CircleRunner 
{
	public static void main(String[] args)
	{
		Circle circle1 = new Circle(2.5);
		System.out.println("Circle 1\n"+ circle1.toString());
		System.out.println("Circle1 Area: " + circle1.calcArea());
		System.out.println("Circle1 Circumference: " + circle1.calcCircumference());
		System.out.println();
		Circle circle2 = new Circle();
		System.out.println("Circle 2\n" + circle2.toString());
		System.out.println("Circle2 Area: " + circle2.calcArea());
		System.out.println("Circle2 Circumference: " + circle2.calcCircumference());
		System.out.println();
		System.out.println("Are the circles 1 and 2 equal?\n" + circle1.equals(circle2));
		circle2.setRadius(2.5);
		System.out.println();
		System.out.println("Circle2 new radius: " + circle2.getRadius());
		System.out.println("Are the circle 1 and new circle 2 equal?\n" + circle1.equals(circle1));	
	}
}