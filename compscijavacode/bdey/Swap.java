package bdey;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args){
		Scanner swap = new Scanner (System.in);
		System.out.println("Enter a positive integer n that is less than 1000");
		int n = swap.nextInt();
		System.out.println("The swap number is: " + (getHundrethsPlace(n) + getOnesPlace(n)*10 + getTensPlace(n)));
	}
	public static int getHundrethsPlace(int n){
		return (n-n%100);
	
	}
	public static int getTensPlace(int n){	
		return(n/10)%10;
	}
	public static int getOnesPlace(int n){
		return(n%10);
	}
}