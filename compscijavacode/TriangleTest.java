import java.util.Scanner;

public class TriangleTest{
	public static void main(String[]args){
		Scanner sk = new Scanner(System.in);
		System.out.println("Enter the side length of the equilateral triangle");
		double s = sk.nextDouble();
		System.out.println("Enter the length of the first leg of the right triangle");
		double n = sk.nextDouble();
		System.out.println("Enter the length of the second leg of the right triangle");
		double l = sk.nextDouble();
		System.out.println("Enter the length of the hypotenuse of the right triangle");
		double h = sk.nextDouble();
		sk.close();
		
		Triangle e = new EquilateralTriangle(s);
		Triangle r = new RightTriangle(n,l,h);
		
		System.out.println("The area of the equilateral triangle is " + e.getArea());
		System.out.println("The perimeter of the equilateral triangle is " + e.getPerimeters());
		System.out.println("The area of the right triangle is " + r.getArea());
		System.out.println("The perimeter of the right triangle is " + r.getPerimeters());
	}
}