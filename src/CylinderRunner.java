/**
 * Runner method for the Cylinder class which tests the entire code.
 */
public class CylinderRunner
{
	public static void main(String[] args)
	{
		Cylinder cylinder1 = new Cylinder(2.0, 4.0);
		System.out.println("Cylinder 1\n "+ cylinder1.toString());
		System.out.println("Surface Area of the Cylinder1: "+ cylinder1.calcSurfaceArea());
		System.out.println("Volume of the Cylinder1: "+ cylinder1.calcVolume());
		System.out.println();
		Cylinder cylinder2  = new Cylinder();
		System.out.println("Cylinder 2\n "+ cylinder2 .toString());
		System.out.println("Surface Area of the Cylinder2: "+ cylinder2 .calcSurfaceArea());
		System.out.println("Volume of the Cylinder2: "+ cylinder2 .calcVolume());
		System.out.println();
		System.out.println("Are the cylinders equal? \n" + cylinder1.equals(cylinder2));
		System.out.println("");
		cylinder2.setHeight(2.0);
		System.out.println("Cylinder2 new Height: "+ cylinder2.getHeight());
		cylinder2.setBase(4.0);
		System.out.println("Cylinder2 new Base: "+ cylinder2.getCircleBase());
		System.out.println();
		System.out.println("Are the cylinders equal? \n" + cylinder1.equals(cylinder2));
	}
}
