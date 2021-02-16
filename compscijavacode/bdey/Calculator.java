package bdey;

import java.util.Scanner;
import java.lang.*;

public class Calculator {
  public static void main(String[] args){
    Scanner sk = new Scanner (System.in);
    System.out.println("Enter int x:");
    int x = sk.nextInt();
    System.out.println("Enter int y:");
    int y = sk.nextInt();

    System.out.println("x+y = " + getSum(x,y));
    System.out.println("x-y = " + getDifference(x,y));
    System.out.println("x*y = " + getProduct(x,y));
    System.out.println("x/y = "  + getQuotient(x,y));
    System.out.println("x^2 = " + getSquare1(x,y));
    System.out.println("y^2 = " + getSquare2(x,y));
    System.out.println("The square root of x " +"is "+ getSquareRoot1(x,y));
    System.out.println("The square root of y " + "is " + getSquareRoot2(x,y));
  }

  public static int getSum(int x, int y){
    return x+y;
  }
  public static int getDifference(int x, int y){
    return x-y;
  }
  // Finds the value of x times y
  public static int getProduct(int x, int y){
    return x*y;
  }
  //Finds the value of x divided by y
  public static double getQuotient (int x, int y){
    double num = x;
	double quotient = num/y;
    return quotient;
  }
  //Finds the value of x squared
  public static double getSquare1 (int x, int y){
    double squareX = x;
    return Math.pow(squareX,2);
  }
  //Finds the value of y squared
  public static double getSquare2 (int x, int y){
	double squareY = y;
	return squareY = Math.pow(squareY,2);
  }
  
  // Finds square root of integer x
  public static double getSquareRoot1 (int x, int y){
	double valueX = x;
    return Math.sqrt(valueX);
  }
  // Finds square root of integer y
  public static double getSquareRoot2 (int x, int y){
	double valueY = y;
	return Math.sqrt(valueY);
  }
}