package bdey;

import java.util.Scanner;

public class Hanoi{
	public static void main(String[]args){
		Scanner sk = new Scanner(System.in);
		System.out.print("Enter the number of disks: ");
		int disk = sk.nextInt();
		getSteps(disk, "Peg1", "Peg2", "Peg3");
		
	}
	public static void getSteps(int disk, String from, String inter, String to){
		if(disk == 1){
			System.out.println("Move Disk 1 from " + from + " to" + to);
		}
		else{
			
		}
	}
}