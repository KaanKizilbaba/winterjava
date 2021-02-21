package day11whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {

	public static void main(String[] args) {
		sumOfDigits();
	}
	/*   Interview Question
	 	 Type java code by using while loop, 
         Write a program that prompts the user to input an integer. 
         It should then find sum of the digits of that number. 
         	123 ==> 1+2+3 = 6
	*/
	
	public static void sumOfDigits() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to find the sum of the digits");
		int number = scan.nextInt();
		
		int originalNumber = number;
		
		int sum = 0;
		
		if(number<0) {
			number = number*(-1);
		}
		
		while(number!=0) {
			sum = sum + number%10;
			number = number / 10;
		}
		
		System.out.println("The sum of the digits of " + originalNumber + " is "+ sum);
		
		scan.close();
		
	}

}
