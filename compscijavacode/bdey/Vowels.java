package bdey;

import java.util.Scanner;

public class Vowels{
	public static void main(String[]args){
		Scanner v = new Scanner (System.in);
		System.out.print("Enter a sentence: ");
		String sen = v.nextLine();
		v.close();
		System.out.println("Total number of vowels is: " + getVowels(sen));
	}
	public static int getVowels(String sen){
		int vowels = 0;
		String nSen = sen.toLowerCase();
		for(int i = 0; i<sen.length(); i++){
			if (nSen.charAt(i) == 'a' || nSen.charAt(i) == 'e' || nSen.charAt(i) == 'i' || nSen.charAt(i) == 'o' || nSen.charAt(i) == 'u'){
				vowels++;
			}
		}
		return vowels;
	}
	}
