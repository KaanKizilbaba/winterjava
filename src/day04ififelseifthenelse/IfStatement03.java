package day04ififelseifthenelse;

import java.util.Scanner;

public class IfStatement03 {
	
	/*
	    Get the name of the day from user.
	 	Type java code by using if statement. 
	 	When you enter the name of the day of a week, 
        output will be “Weekday” or “Weekend day” according to the name of the day.
	*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any day name to check if it is week day or weekend day");
		String dayName = scan.next().toLowerCase();
		
		//Note: To compare Strings, DO NOT USE "==". Use "equals()" method.
		// "Ali".equals("Veli"); ==> false
		// "Ali".equals("Ali"); ==> true
		// "Ali".equals("ali"); ==> false
		
		if(dayName.equals("monday") || dayName.equals("tuesday") || dayName.equals("wednesday") ||
		   dayName.equals("thursday") || dayName.equals("friday")) {
			System.out.println("Week day");
		}
		
		if(dayName.equals("saturday") || dayName.equals("sunday")) {
			System.out.println("Weekend day");
		}
		
		if(!dayName.equals("monday") && !dayName.equals("tuesday") && !dayName.equals("wednesday") &&
		   !dayName.equals("thursday") && !dayName.equals("friday") && !dayName.equals("saturday") &&
		   !dayName.equals("sunday")) {
			System.out.println("Enter a valid day name");
		}

	}

}
