package bdey;

import java.util.Scanner;

public class Hangman{
	public static void main(String[]args){
		//Draw the hangman platform 
		drawHangmanPlatform();
		//Output amount of attempts user has left
		int attempts = 5;
		System.out.println("You have " + attempts + " attempts remaining");

		int r = (int)(Math.random()*5 + 3); //Used to get random number
		checkGuess(getDashes(r), getRandomWord(r), getGuess(), attempts); //Calls the methods
	}
	//Choose random word from the word bank
	public static String getRandomWord(int r){
		String secretWord = "";
		if (r == 3){
			secretWord = "ice";
		}
		if (r == 4){
			secretWord = "heat";
		}
		if (r == 5){
			secretWord = "bucks";
		}
		if (r == 6){
			secretWord = "lakers";
		}
		if (r == 7) {
			secretWord = "rockets";
		}
		return secretWord;
	}
	//Prints out the underscores to represent letters in the word
	public static String getDashes(int r){
		String dashes = "";
		if (r == 3){
			dashes = "---";
			System.out.println(dashes);
		}
		if (r == 4){
			dashes = "----";
			System.out.println(dashes);
		}
		if (r == 5){
			dashes = "-----";
			System.out.println(dashes);
		}
		if (r == 6){
			dashes = "------";
			System.out.println(dashes);
		}
		if (r == 7){
			dashes = "-------";
			System.out.println(dashes);
		}
		return dashes;
	}
	//Gets the user's guess
	public static String getGuess(){
		Scanner s = new Scanner(System.in);
		System.out.println("Guess a lowercase letter!");
		String g = s.next();
		String guess = g.toLowerCase();
		return guess;
	}
	//Draws the hangman platform
	public static void drawHangmanPlatform(){
		System.out.println("   ____________");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   |");
		System.out.println("   | ");
		System.out.println("___|___");
		System.out.println();
	}
	//Draws the hangman after every incorrect attempt
	public static void drawHangman(int attempts){
	
		if (attempts == 4){
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
			
		}
		if (attempts == 3){
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			
		}
		if (attempts == 2){
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			
		}
		if (attempts == 1){
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|");
			System.out.println("   |         / | ");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			
		}
		if (attempts == 0){
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");

		}
	}
	//Gives hint after every wrong attempt by the user
	public static void giveHint(String secretWord, int attempts){
		if (secretWord == "ice"){
			if (attempts == 4){
				System.out.println("Hint: It is found in the tundra");
			}
			if (attempts == 3){
				System.out.println("Hint: It is cold");
			}
			if (attempts == 2){
				System.out.println("Hint: It is made out of water");
			}
			if (attempts == 1){
				System.out.println("Hint: It is slippery");
			}
			if (attempts == 0){
				System.out.println("Hint: It can be made in the refrigerator");
			}
		}
		if (secretWord == "heat"){
			if (attempts == 4){
				System.out.println("Hint: It is an NBA team");
			}
			if (attempts == 3){
				System.out.println("Hint: They are in the Eastern Conference");
			}
			if (attempts == 2){
				System.out.println("Hint: They are in the Southeast division");
			}
			if (attempts == 1){
				System.out.println("Hint: They have won 3 NBA championships");
			}
			if (attempts == 0){
				System.out.println("HInt: They were in the 2020 NBA finals");
			}
		}
		if (secretWord == "bucks"){
			if (attempts == 4){
				System.out.println("Hint: It is an NBA team");
			}
			if (attempts == 3){
				System.out.println("Hint: They are in the Eastern Conference");
			}
			if (attempts == 2){
				System.out.println("Hint: They are in the Central division");
			}
			if (attempts == 1){
				System.out.println("Hint: Kareem Abdul-Jabbar played for this between 1969 and 1975");
			}
			if (attempts == 0){
				System.out.println("Hint: They have a two time MVP on their team");
			}
		}
		if (secretWord == "lakers"){
			if (attempts == 4){
				System.out.println("Hint: It is an NBA team");
			}
			if (attempts == 3){
				System.out.println("Hint: They are in the Western Conference");
			}
			if (attempts == 2){
				System.out.println("Hint: They are in the Pacific division");
			}
			if (attempts == 1){
				System.out.println("Hint: They have won 17 NBA championships");
			}
			if (attempts == 0){
				System.out.println("Hint: They have Lebron James on their team");
			}
		}
		if (secretWord == "rockets"){
			if (attempts == 4){
				System.out.println("Hint: It is an NBA team");
			}
			if (attempts == 3){
				System.out.println("Hint: They are in the Western Conference");
			}
			if (attempts == 2){
				System.out.println("Hint: They are in the Southwest division");
			}
			if (attempts == 1){
				System.out.println("Hint: They are famous for having a small ball lineup");
			}
			if (attempts == 0){
				System.out.println("Hint: They are in Houston");
			}
		}
	}
	public static void checkGuess(String dashes, String secretWord, String guess, int attempts){
		//Updates dashes with correctly guessed letter
		String newSecretWord = "";
		for (int i = 0; i < secretWord.length(); i++) {
			if (i == secretWord.length()-1){
				if (secretWord.substring(i).equals(guess)){
					newSecretWord += secretWord.substring(i);
				}
				else {
					newSecretWord += dashes.substring(i);
				}
			}
			else{
				if (secretWord.substring(i, i+1).equals(guess)){
					newSecretWord += secretWord.substring(i, i+1);
				}
				else{
					newSecretWord += dashes.substring(i, i+1);
				}
			}
		}
		//Changes the amount of events left and prints it out
		if (newSecretWord.equals(dashes)){
			System.out.println("Sorry, " + guess + " is not in the word");
			attempts--;
			giveHint(secretWord, attempts);
		}
		System.out.println();
		System.out.println("You have " + attempts + " attempts remaining");
		System.out.println();
		drawHangman(attempts);
		System.out.println(newSecretWord);
		dashes = newSecretWord;
		checkGuess2(secretWord,dashes, newSecretWord, guess, attempts);
	}
	public static void checkGuess2 (String secretWord, String dashes, String newSecretWord, String guess, int attempts){
		//Prints out congratulation message and asks user if they want to play again
		if (newSecretWord.equals(secretWord)){
			System.out.println("Great job! You guessed the word correctly!");
			Scanner f = new Scanner(System.in);
			System.out.println("Do you want to play another round? Type 'yes' for yes and 'no' for no");
			String restart = f.nextLine();
			if (restart.equalsIgnoreCase("yes")){
				main(null);
			}
			else {
				System.exit(0);	
			}
			
		}
		//Prints out lose message and asks user if they want to play again
		else if (attempts == 0){
			System.out.println("Sorry you ran out of attempts. The word was " + "'" + secretWord + "'.");
			Scanner t = new Scanner(System.in);
			System.out.println("Would you like to play again for another chance to win?");
			String playAgain = t.nextLine();
			if (playAgain.equalsIgnoreCase("yes")){
				main(null);
			}
			else {
				System.exit(0);	
			}
			
		}
		//Checks guesses for every new game started by the user
		else {
			checkGuess(dashes, secretWord, getGuess(), attempts);
		}
			
		}
	
	}
	
