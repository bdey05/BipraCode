
public class EquilateralTriangle extends Triangle{
	public EquilateralTriangle(double s){
		super(s);
	}
	public double getArea(){
		return (1.0/4.0)*Math.sqrt(3)*Math.pow(side, 2);
	}
	public double getPerimeters(){
		return side*3;
	}
}