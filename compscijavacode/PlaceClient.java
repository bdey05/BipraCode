import java.util.Scanner;

public class PlaceClient{
	public static void main(String[]args){
		Scanner sk = new Scanner(System.in);
		System.out.println("Enter the x-coordinate of the first point: ");
		double firstPointX = sk.nextDouble();
		System.out.println("Enter the y-coordinate of the first point: ");
		double firstPointY = sk.nextDouble();
		System.out.println("Enter the x-coordinate of the second point: ");
		double secondPointX = sk.nextDouble();
		System.out.println("Enter the y-coordinate of the second point: ");
		double secondPointY = sk.nextDouble();
		System.out.println("Enter the x-coordinate of the third point: ");
		double thirdPointX = sk.nextDouble();
		System.out.println("Enter the y-coordinate of the third point: ");
		double thirdPointY = sk.nextDouble();
		sk.close();
		
		Place p1 = new PlaceDistance(firstPointX, firstPointY);
		Place p2 = new PlaceDistance(secondPointX, secondPointY);
		Place p3 = new PlaceDistance(thirdPointX, thirdPointY);
		
		System.out.println("Result from the test is point 1 equidistant from point 2 and point 3: " + sameDistance(p1, p2, p3));
		
	}
	
	public static boolean sameDistance(Place p1, Place p2, Place p3){
		return p1.distance(p2) == p1.distance(p3);
	}
	
}