package bdey;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args){
		Scanner num = new Scanner (System.in);
		System.out.println("Enter the value of a: ");
		double a = num.nextDouble();
		System.out.println("Enter the value of b: ");
		double b = num.nextDouble();
		System.out.println("Enter the value of c: ");
		double c = num.nextDouble();
		
		double determinant = Math.pow(b,2) - (4 * a * c);
		
		if (determinant > 0){
			double root1 = (-b + Math.sqrt(determinant))/(2*a);
			double root2 = (-b - Math.sqrt(determinant))/(2*a);
			System.out.println("The roots are " + root1 + " and " + root2);
		}
		else if (determinant == 0){
			//Since this produces a double root you only need to output one root
			double root1 = (-b + Math.sqrt(determinant))/(2*a);
			System.out.println("The root is " + root1);
		}
		else {
			System.out.println("There are no real roots");
		}
	}
}