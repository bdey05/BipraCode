package Circle;

public class Cylinder {
	private Circle base;
	private double height;
	
	public Cylinder(double r, double h){
		height = h;
		base = new Circle(r);
	}
	public double getVolume(){
		return base.getArea() * height;
	}
}
