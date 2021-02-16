package bdey;

import java.util.Scanner;

public class LeapYearTest{
	public static void main(String[]args){
		Scanner yr = new Scanner(System.in);
		System.out.println("Enter a year");
		LeapYear test = new LeapYear();
		int yearInput = yr.nextInt();
		yr.close();
		if (test.isLeapYear(yearInput) == true){
			System.out.println("Yes, year " + yearInput + " is a leap year!");
		}
		else {
			System.out.println("No, year " + yearInput + " is not a leap year!");
		}
	}
}