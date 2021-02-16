package bdey;

import java.util.Scanner;

public class RockPaperScissors{
	public static void main(String[]args){
		System.out.println("Welcome to Rock, Paper, Scissors!");
		Scanner rps = new Scanner(System.in);
		System.out.println("Enter r for Rock, p for Paper, or s for Scissors");
		String input = rps.next();
		String cm = computerMove();
		rps.close();
		System.out.println("You chose " + input);
		System.out.println("The computer chose " + computerMove());
		System.out.println(findWinner(input, cm));
	}
	public static String computerMove(){
		String cm = "";
		switch((int)Math.random()*3+1){
			case 1: 
				cm = "r";
				break;
			case 2:
				cm = "p";
				break;
			case 3: 
				cm = "s";
				break;
		}
		return cm;
	}
	public static String findWinner(String input, String cm){
		if (cm.equals(input)){
			return "You tied!";
		}
		else if (cm.equals("p") && (input.equals("r"))){
			return "The computer won. Try again!";
		}
		else if (cm.equals("r") && (input.equals("s"))){
			return "The computer won. Try again!";
		}
		else if (cm.equals("s") && (input.equals("p"))){
			return "The computer won. Try again!";
		}
		else if (input.equals("p") && (cm.equals("r"))){
			return "You won!";
		}
		else if (input.equals("r") && (cm.equals("s"))){
			return "You won!";
		}
		else if (input.equals("s") && (cm.equals("p"))){
			return "You won!";
		}
		else {
			return "Computer does not recognize input. Please enter r,p, or s only. Run the program again.";
		}
	}
}















