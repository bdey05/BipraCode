package bdey;

import java.util.Scanner;

public class RectangleTest{
	public static void main(String[]args){
		Scanner rec = new Scanner (System.in);
		System.out.println("Enter the width of the rectangle: ");
		double w = rec.nextDouble();
		System.out.println("Enter the height of the rectangle: ");
		double h = rec.nextDouble();
		Rectangle r = new Rectangle(w,h);
		System.out.println("The area of the rectangle is " + r.getArea());
		System.out.println("The perimeter of the rectangle is " + r.getPerimeter());
		rec.close();
	}
}