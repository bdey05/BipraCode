package bdey;

import java.util.Scanner;

public class Radius {
	public static void main(String[] args){
		// Asking the user for radius input
		Scanner rad = new Scanner (System.in);
		System.out.println("Enter the radius of the sphere: ");
		double radius = rad.nextDouble();
		// Printing out the surface area and volume
		System.out.println("The surface area of the sphere is: " + getArea(radius));
		System.out.println("The volume of the sphere is: " + getVolume(radius));
}
	public static double getArea(double radius){
		//Solving for the surface area
		double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
		return surfaceArea;
	}
	public static double getVolume(double radius){
		//Solving for the volume
		double volume = (4.0/3) * Math.PI * Math.pow(radius, 3);
		return volume;
	}
	
}