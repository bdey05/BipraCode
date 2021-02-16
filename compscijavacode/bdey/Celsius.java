package bdey;

import java.util.Scanner;

public class Celsius {
  public static void main(String[] args){
	  Scanner celsius = new Scanner (System.in);
	  System.out.println("Enter a degree in Celsius:");
	  double degree = celsius.nextDouble();
	  System.out.println(degree + " degrees Celsius is " + getFahrenheit(degree) + " degrees Fahrenheit ");
  }
  
  public static double getFahrenheit(double degree){
	  double fahrenheit;
	  fahrenheit = (double)9/5*degree + 32;
	  return fahrenheit;
  }
}