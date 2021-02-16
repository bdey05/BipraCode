package bdey;

import java.util.Scanner;

public class simpleuserinput {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		Scanner name = new Scanner (System.in);
		System.out.println("Enter your first name:");
		String firstname = name.nextLine();
		System.out.println("Enter your favorite food");
		Scanner food = new Scanner (System.in);
		String favfood = food.nextLine();
		System.out.println("Hi," + firstname + "!" + " I like " + favfood + " too!");
	}

}