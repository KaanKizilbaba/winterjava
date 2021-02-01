package day02scanner;

import java.util.Scanner;

public class ScannerClass02 {
	
	/*
	 	Type a program which calculates the area and the perimeter of a square 
        whose side length is entered by user. 
        Hint 1: Area of a square is length x length
        Hint 2: Perimeter of a square is 4 x length
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please, enter the length of the side of the square");
		
		double length = scan.nextDouble();
		
		System.out.println("Area: " + (length * length));
		
		System.out.println("Perimeter: " + (4 * length));
	
	}

}
