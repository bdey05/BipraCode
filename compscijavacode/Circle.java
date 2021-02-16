package Circle;

public class Circle {
	private double r;
	public Circle(double radius){
		r = radius;
	}
	public double getArea(){
		return Math.PI*r*r;
	}
}
