package day04ififelseifthenelse;

import java.util.Scanner;

public class IfStatement02 {
	
	/*
	    Get the initial from user.
	 	Type java code by using if statement. 
	 	When you enter the initial of the day of a week, output should be all possible names of the days.
        For example; if the initial is ’S’ output should be “Saturday or Sunday” 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the initial of any day name");
		char initial = scan.next().toUpperCase().charAt(0);
		
		if(initial=='M') {
			System.out.println("Monday");
		}
		if(initial=='T') {
			System.out.println("Tuesday or Thursday");
		}
		if(initial == 'W') {
			System.out.println("Wednesday");
		}
		if(initial=='F') {
			System.out.println("Friday");
		}
		if(initial=='S') {
			System.out.println("Saturday or Sunday");
		}
		if(initial!='M' && initial!='T' && initial!='W' && initial!='F' && initial!='S') {
			System.out.println("Enter a valid initial");
		}

	}

}
