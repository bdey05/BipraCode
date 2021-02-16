
package bdey;

import java.util.Scanner;

public class WelcomePeriod3 {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		Scanner name = new Scanner (System.in);
		System.out.println("Enter your name:");
		String firstname = name.nextLine();
		System.out.println("Hello"+firstname);
	}

}
