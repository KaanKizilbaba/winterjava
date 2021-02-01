package day02scanner;

import java.util.Scanner;

public class ScannerClass06 {
	
	/*
	 	Ask user to enter his/her full name
	 	Then ask user to enter his/her spouse's first name
	 	Then ask user to enter his/her address
	 	Then print them all on the console.
	*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your full name");
		String fullName = scan.nextLine();
		
		System.out.println("Enter your spouse's first name");
		String spouseFirstName = scan.next();
		
		//After using nextLine(), if you use any other method like next()
		//type "scan.nextLine();" once
		scan.nextLine();
		
		System.out.println("Enter your address");
		String address = scan.nextLine();
		
		System.out.println("User name: " + fullName);
		System.out.println("Spouse name: " + spouseFirstName);
		System.out.println("Address: " + address);
	}

}
