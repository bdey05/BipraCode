package bdey;

import java.util.Scanner;

public class Reverse{
	public static void main(String[]args){
		Scanner v = new Scanner (System.in);
		System.out.print("Enter a sentence: ");
		String sen = v.nextLine();
		v.close();
		System.out.println("The sentence in reverse is: " + getReverse(sen));
	}
	public static String getReverse(String sen){
		String reverse = "";
		for(int i = sen.length()-1; i>=0; i--){
			reverse += sen.charAt(i);
		}
		return reverse;
	}
}