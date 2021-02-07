package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement01 {
	
	/*
 		 Ask user to enter his/her age. 
		 If the age is between 18 and 65 then output will be “You should work”, 
         else output will be “No need to work”	
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age...");
		int age = scan.nextInt();
		
		if(age<0) {
			
			System.out.println("Please enter a valid age...");
			
		}else if(age>=18 && age<=65) {
			
			System.out.println("You should work");
			
		}else {
			
			System.out.println("No need to work");
			
		}

	}

}
