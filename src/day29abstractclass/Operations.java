package day29abstractclass;

/*
 	1)abstract methods cannot be put into concrete classes. 
 	  abstract methods can be put into abstract classes.
 */

public abstract class Operations {
	
	public abstract int add(int... a);
	public abstract int subtract(int... a);
	public abstract int division(int a, int b);
	public abstract int multiplication(int... a);
	
	public double sqrt(int a) {
		
		double result = 0;
		try {
			result = Math.sqrt(a);
		}catch(ArithmeticException e) {
			System.out.println("Do not use negative integers");
		}
		return result;
	}

}
