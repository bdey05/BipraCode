package bdey;

public class Rectangle {
	private double width = 1;
	private double height = 1;
	
	public Rectangle(double w, double h){
		width = w;
		height = h;
	}
	public double getArea(){
		return width*height;
	}
	public double getPerimeter(){
		return 2*(width+height);
	}
}