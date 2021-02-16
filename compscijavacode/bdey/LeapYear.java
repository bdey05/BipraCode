package bdey;

public class LeapYear{
	private int y;
	
	public LeapYear(){
		y = 0;
	}
	public boolean isLeapYear(int year){
		if (year%4 == 0 && (year%100 != 0 || year % 400 == 0)){
			return true;
		}
		else {
			return false;
		}
	}
}