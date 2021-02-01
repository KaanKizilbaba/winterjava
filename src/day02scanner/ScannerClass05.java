package day02scanner;

import java.util.Scanner;

public class ScannerClass05 {
	
	/*
	 	Type a program which asks user to enter his/her first name and last name, 
        then print it on the console. 
	*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name and last name");
		//If you wanna get a String data from user, use nextLine() method
		//nextLine() method gets full String which user entered
		String fullName = scan.nextLine();
		System.out.println("Your full name is " + fullName);
		
		
		System.out.println("Enter your kid's first name");
		//If you wanna get a String data from user, you can use next() method as well
		//But next() is used to get just the first word.
		//For example user entered "Ali Can" ==> nextLine() returns "Ali Can"
		//                                   ==> next() returns "Ali"
		String kidFirstName = scan.next();
		
		System.out.println("Kid first name is " + kidFirstName);
	
	}

}
