package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class SwitchStatement01 {
	
	/*
	 	Ask user to enter the number of a day then your program will type the name of the day
	 	Sunday = 1, Monday = 2, ... Saturday = 7
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of a day");
		int d = scan.nextInt();
		
		//1.Way: By using "if-else-if"
		if(d==1) {
			System.out.println("Sunday");
		}else if(d==2) {
			System.out.println("Monday");
		}else if(d==3) {
			System.out.println("Tuesday");
		}else if(d==4) {
			System.out.println("Wednesday");
		}else if(d==5) {
			System.out.println("Thursday");
		}else if(d==6) {
			System.out.println("Friday");
		}else if(d==7) {
			System.out.println("Saturday");
		}else {
			System.out.println("Enter a valid day number");
		}
		
		//2.Way: By using switch statement
		
		//In switch statement, Long, double, float, boolean cannot b used
		//In switch statement String, char, int, byte, short can be used
		switch(d) {
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Enter a valid day number");
		}

	}

}
