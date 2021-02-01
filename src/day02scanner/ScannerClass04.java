package day02scanner;

import java.util.Scanner;

public class ScannerClass04 {
	
	/*
	 	Type a program which calculates the volume of a rectangular prism 
		whose length, width, and height are entered by user. 
		Hint 1: Volume of a rectangular prism is width x length x height 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please, enter the length of the prism");
		double length = scan.nextDouble();
		
		System.out.println("Please, enter the width of the prism");
		double width = scan.nextDouble();
		
		System.out.println("Please, enter the height of the prism");
		double height = scan.nextDouble();
		
		System.out.println("Volume: " + (length*width*height));
		
	}

}
