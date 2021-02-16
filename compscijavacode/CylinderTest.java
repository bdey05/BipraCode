package Circle;

import java.util.Scanner;

public class CylinderTest {
	public static void main(String[]args){
		Scanner cyl = new Scanner (System.in);
		System.out.print("Enter the radius of the cylinder: ");
		double r = cyl.nextDouble();
		System.out.print("Enter the height of the cylinder: ");
		double h = cyl.nextDouble();
		Cylinder c = new Cylinder(r,h);
		System.out.println("Cylinder Volume = " + c.getVolume());
		cyl.close();
	}
}
