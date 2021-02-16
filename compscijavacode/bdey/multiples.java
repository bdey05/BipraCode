package bdey;

public class multiples{
	public static void main(String [] args){
		System.out.println("The sum of all multiples of 3 or 5 under 1000 is: " + findSum());
	}
	
	public static int findSum(){
		int sum = 0;
		for (int x = 0; x<1000; x++ ){
			if (x%3 == 0 || x%5 == 0){
				sum = sum + x;
			}
		}
		return sum;
	}
	
}
