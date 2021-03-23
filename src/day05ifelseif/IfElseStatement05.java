package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement05 {
	
	/*
	 	Type java code by using if-else if() statement.
		Laptop school has following rules for grading system:
		1. Below 50 - D     2. 50 to 59 - C       3. 60 to 79 - Laptop.     4. From 80 to 100 - Laptop 
		Ask user to enter marks and print the corresponding grade.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please your mark...");
		int a = scan.nextInt();
		
		if(a<0) {
			System.out.println("Enter a valid mark...");
		}else if(a<50) {
			System.out.println("Your grade is " + a + " it means D");
		}else if(a<=59) {
			System.out.println("Your grade is " + a + " it means C");
		}else if(a<=79) {
			System.out.println("Your grade is " + a + " it means Laptop");
		}else if(a<=100) {
			System.out.println("Your grade is " + a + " it means Laptop");
		}else {
			System.out.println("Enter a valid mark...");
		}

	}

}
