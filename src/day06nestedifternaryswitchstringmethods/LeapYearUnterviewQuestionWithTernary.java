package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class LeapYearUnterviewQuestionWithTernary {
	
	/*
		Type java code by using nested ternary.
		Write a program to check if a year is leap year or not.
		If the year is divisible by 100 then it must be divisible by 400.
		If a year is not divisible by 100 then it must be divisible by 4.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year...");
		int year = scan.nextInt();
		
        String r = (year%100==0) ? (year%400==0 ? "The year is leap year" : "The year is not leap year") : 
        	                       (year%4==0 ? "The year is leap year" : "The year is not leap year");
        System.out.println(r);
	}

}
