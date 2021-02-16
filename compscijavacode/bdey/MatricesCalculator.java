package bdey;

import java.util.Scanner;


public class MatricesCalculator{
	public static void main(String[]args){
		Scanner inp = new Scanner(System.in);
		System.out.println("Welcome to the matrices calculator. Type '1' for addition, '2' for subtraction, or '3' for multiplication");
		int operation = inp.nextInt();
		if(operation == 1 || operation == 2){
			System.out.println("Enter the number of rows of the two arrays");
			int rows = inp.nextInt();
			System.out.println("Enter the number of columns of the two arrays");
			int columns = inp.nextInt();
			int[][]a1 = new int[rows][columns];
			int[][]a2 = new int[rows][columns];
			for(int x = 0; x<a1.length; x++){
				for(int n = 0; n<a1[x].length; n++){
					System.out.println("Enter element in a1 at row " + (x+1) + ", column " + (n+1));
					int val = inp.nextInt();
					a1[x][n] = val;
				}
			}
			for(int r = 0; r<a2.length; r++){
				for(int n = 0; n<a2[r].length; n++){
					System.out.println("Enter element in a2 at row " + (r+1) + ", column " + (n+1));
					int val = inp.nextInt();
					a2[r][n] = val;
				}
				
		}
			if(operation==1){
			System.out.println("The sum of the matrices is: ");
			for(int i = 0; i<add(a1,a2).length; i++){
				for(int n = 0; n<add(a1,a2)[i].length; n++){
					if(n%add(a1,a2)[i].length==0){
						System.out.println("");
					}
					System.out.print( add(a1, a2)[i][n] + " ");
				}
			}
			}
			if(operation==2){
				System.out.println("The difference of the matrices is: ");
				for(int i = 0; i<subtract(a1,a2).length; i++){
					for(int n = 0; n<subtract(a1,a2)[i].length; n++){
						if(n%subtract(a1,a2)[i].length==0){
							System.out.println("");
						}
						System.out.print(subtract(a1, a2)[i][n] + " ");
					}
				}
				}
		}
			
		if(operation == 3){
			int a1rows;
			int a1columns;
			int a2rows;
			int a2columns;
			do{
			System.out.println("Enter the number of rows of a1");
			a1rows = inp.nextInt();
			System.out.println("Enter the number of columns of a1");
			a1columns = inp.nextInt();
			System.out.println("Enter the number of rows of a2");
			a2rows = inp.nextInt();
			System.out.println("Enter the number of columns of a2");
			a2columns = inp.nextInt();
			if(a1columns != a2rows){
				System.out.println("These are not valid matrices. Please enter valid values for the matrices.");
			}
			}
			while(a1columns != a2rows);
			int[][]a1 = new int[a1rows][a1columns];
			int[][]a2 = new int[a2rows][a2columns];
			for(int x = 0; x<a1.length; x++){
				for(int n = 0; n<a1[x].length; n++){
					System.out.println("Enter element in a1 at row " + (x+1) + ", column " + (n+1));
					int val = inp.nextInt();
					a1[x][n] = val;
				}
			}
			for(int r = 0; r<a2.length; r++){
				for(int n = 0; n<a2[r].length; n++){
					System.out.println("Enter element in a2 at row " + (r+1) + ", column " + (n+1));
					int val = inp.nextInt();
					a2[r][n] = val;
				}
				
		}
			System.out.println("The product of the matrices is: ");
			for(int i = 0; i<multiply(a1,a2).length; i++){
				for(int n = 0; n<multiply(a1,a2)[i].length; n++){
					if(n%multiply(a1,a2)[i].length==0){
						System.out.println("");
					}
					System.out.print(multiply(a1, a2)[i][n] + " ");
				}
			}
	
		
	}
		}
	public static int[][]add(int[][]a1, int[][]a2){
		
		if(a1.length == 0 && a2.length == 0){
			return new int [0][0];
		}
		else{
			int[][] sum = new int [a1.length][a1[0].length];
			for(int i = 0; i<a1.length; i++){
				for(int n = 0; n<a1[i].length; n++){
					sum[i][n] = a1[i][n] + a2[i][n];
				}
			}
			return sum;
		}
		
	}
	
	
	public static int[][]subtract(int[][]a1, int[][]a2){
			if(a1.length == 0 && a2.length == 0){
				return new int [0][0];
			}
			else{
				int[][] difference = new int [a1.length][a1[0].length];
				for(int i = 0; i<a1.length; i++){
					for(int n = 0; n<a1[i].length; n++){
						difference[i][n] = a1[i][n] - a2[i][n];
					}
				}
				return difference;
			}
	}
	public static int[][]multiply(int[][]a1, int[][]a2){
			int[][] product = new int [a1.length][a2[0].length];
			for(int i = 0; i<a1.length; i++){
				for(int n = 0; n<a2[0].length; n++){
					int sum = 0;
					for(int b = 0; b<a1[i].length; b++){
						sum += a1[i][b] * a2[b][n];
					}
					product[i][n] = sum;
				}
			}
			return product;
		}
}
	
