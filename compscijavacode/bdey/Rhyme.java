package bdey;

import java.util.Scanner;

public class Rhyme{
	public static void main(String[]args){
		Scanner rhy = new Scanner(System.in);
		System.out.println("Enter a number 1-10(or 0 to quit):");
		int num = rhy.nextInt();
		rhy.close();
		
		switch(num){
			case 0:
				System.out.println("Run the program again and only enter a number between 1-10");
				break;
			case 1:
				System.out.println("Buckle your shoe");
				break;
			case 2:
				System.out.println("Buckle your shoe");
				break;
			case 3:
				System.out.println("Shut the door");
				break;
			case 4:
				System.out.println("Shut the door");
				break;
			case 5:
				System.out.println("Pick up the sticks");
				break;
			case 6:
				System.out.println("Pick up the sticks");
				break;
			case 7:
				System.out.println("Lay them straight");
				break;
			case 8:
				System.out.println("Lay them straight");
				break;
			case 9: 
				System.out.println("A big fat hen");
				break;
			case 10:
				System.out.println("A big fat hen");
				break;
		}
	}
}