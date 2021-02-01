package day02scanner;

import java.util.Scanner;

public class ScannerClass01 {
	
	/*
	 	1) Type ==> Scanner scan = new Scanner(System.in);
	 				"new" keyword is used to create an object
	 				"System.in" means, you are getting data from outside into your code
	 				
	 	2) Give message to user like ==> System.out.println("Please enter the first integer");
	 	
	 	3) Use nextInt() method like ==> int num1 = scan.nextInt();		
	*/
	
	public static void main(String[] args) { 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first integer");		
		int num1 = scan.nextInt();
		
		System.out.println("Please enter the second integer");
		int num2 = scan.nextInt();
		
		System.out.println("Sum: " + (num1 + num2));
		System.out.println("Product: " + (num1 * num2));
		System.out.println("Difference: " + (num1 - num2));
	}

}
