package bdey;

public class primefactors {
	
	public static int getPrime(long x){
		int i;
		long num = x;
		for (i = 2; i<=num; i++){
			if (num % i == 0){
				num /= i;
				i--;
			}
		}
		return i;
	}
	public static void main (String[]args){
		long x = 600851475143L;
		System.out.println("The largest prime factor of " + x + " " + "is " + getPrime(x));
	}
}