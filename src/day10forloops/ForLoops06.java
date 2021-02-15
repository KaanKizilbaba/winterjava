package day10forloops;

import java.util.Scanner;

public class ForLoops06 {

	public static void main(String[] args) {
		drawRevTriangle();
	}

	/*
	 	Create the following image by getting the number of rows from user
		 				 .
		                 .
		              * * * *
		               * * *
		                * *
		                 * 
	 */
	public static void drawRevTriangle() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int s = scan.nextInt();
		
		for(int i = s; i>0; i--) {
			
			//Create a for-loop for spaces
			for(int j=0; j<s-i; j++) {
				System.out.print(" ");
			}
			
			//Create a for-loop for "*-"
			for(int k=s; k>s-i; k--) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
		scan.close();
			
	}

}
