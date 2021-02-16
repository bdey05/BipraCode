package bdey;

public class WhileNumbers{
	public static void main(String[]args){
		int divisibleNumbers = 0;
		int i = 100;
		while(i<=1000){
			if (i%5 == 0 && i%6 == 0){
				System.out.print(i + " ");
				divisibleNumbers++;
			}
			if (divisibleNumbers == 10){
				System.out.println();
				divisibleNumbers = 0;
			}
			i++;
			}
		}
	}
