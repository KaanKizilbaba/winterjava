package day27exceptions;

import java.util.Scanner;

public class Exc03 {
	
	/*
	 	Display an array to user
	 	Ask the user to select any element by using order number
	 	Print the selected element on the console
	 	Your code should not be blocked for any order number
	*/

	public static void main(String[] args) {
	
		String str[] = {"a", "c", "e", "k"};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Select any element by using order number from the given array {a, c, e, k}");
		int orderNum = scan.nextInt();
		
		System.out.println(getElement(str, orderNum));
		
		scan.close();

	}
	
	public static String getElement(String str[], int orderNum) {
		
		String el = "";
		
		try {
			el = str[orderNum-1];
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("You entered a non-existing order number...");
		}
		
		return el;
		
	}

}
