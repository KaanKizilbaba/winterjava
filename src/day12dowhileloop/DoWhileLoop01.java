package day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop01 {

	public static void main(String[] args) {
		checkIntToBeEven();
	}
	
	/*
	 	 Ask user to enter an integer
	     If the integer is even print on the console "You won!"
		 Otherwise ask user to enter another integer
	*/
	public static void checkIntToBeEven() {
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		do {
			System.out.println("Enter an integer");
			num = scan.nextInt();
			
			if(num%2==0) {
				System.out.println(num + " is even so you won!");
			}
			
		}while(num%2!=0);
		
		scan.close();
	}
	

}
