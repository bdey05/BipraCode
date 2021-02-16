
public class PlaceDistance implements Place{
	private double x,y;
	
	public PlaceDistance(double xCor, double yCor){
		x = xCor;
		y = yCor;
	}
	public double getXcor(){
		return x;
	}
	public double getYcor(){
		return y;
	}
	public int distance(Place other){
		return(int)(Math.sqrt(Math.pow(x-((PlaceDistance)other).getXcor(),2) + (Math.pow(y-((PlaceDistance)other).getYcor(),2))));
	}
	
}