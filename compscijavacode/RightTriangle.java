
public class RightTriangle extends Triangle{
	private double leg;
	private double hyp;
	public RightTriangle(double s, double l, double h){
		super(s);
		leg = l;
		hyp = h;
	}
	public double getArea(){
		return 1.0/2.0*side*leg;
	}
	public double getPerimeters(){
		return side+leg+hyp;
	}
	
}