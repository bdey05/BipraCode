package bdey;

import java.util.Scanner;

public class fibonacci{
	public static void main(String[]args){
		Scanner sk = new Scanner(System.in);
		System.out.println("Enter a number of months that is less than 20: ");
		int m;
		m = sk.nextInt();
		
		while(m>=20){
			System.out.println("You have entered an invalid number of months");
			System.out.println("Enter a number of months that is less than 20: ");
			m = sk.nextInt();
		}
		System.out.print(getRabbits(m));
		
	}
	public static long getRabbits(int m){
		if(m<=2){
			return m;
		}
		return getRabbits(m-1)+getRabbits(m-2);
	}
}