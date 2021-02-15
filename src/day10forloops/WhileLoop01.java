package day10forloops;

public class WhileLoop01 {

	public static void main(String[] args) {
		printOdd1();
		System.out.println();
		printOdd2();
		System.out.println();
		printDivBySixEight();
	}
	
	/*
	 	Type a program to print odd integers from 4 to 25 in the same line with a space on  the console
	 	1)Use for-loop
	 	2)Use while-loop
	*/
	//For Loop
	public static void printOdd1() {	
	    for(int i = 4 ; i <10 ; i++) {
	    	if(i%2!=0) {
	    		System.out.print(i + " ");
	    	}
	    }    
	}
	
	//While Loop
	public static void printOdd2() {
		int i = 4;
		while(i <10) {		
			if(i%2!=0) {				
	    		System.out.print(i + " ");	    		
	    	}		
			i++;
		}
	}
	
	/*
	 	Create a method to print integers which are divisible by 6 and 8 from 500 to 25 on the console
	*/
	public static void printDivBySixEight() {
		
		int i = 500;
		
		while(i>24) {
			
			if(i%6==0 && i%8==0) {
				System.out.print(i + " ");
			}
			//Do not forget to type increment/decrement, otherwise it will be infinite loop
			i--;
		}
		
	}

}
