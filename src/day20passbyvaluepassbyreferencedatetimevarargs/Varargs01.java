package day20passbyvaluepassbyreferencedatetimevarargs;

public class Varargs01 {
	
	/*
	 	1)If you want a method to run with different number of arguments use varargs
	 	2)varargs behaves like lists but behind the varargs arrays work
	 	3)To declare a varargs use "int... a" or "String... s" etc.
	 	4)varargs must be the last parameter inside the method parenthesis
	 	5)Can I use multiple varargs inside a method parenthesis
	 */

	public static void main(String[] args) {
		
//		System.out.println(add(-2, 17));
		
		System.out.println(retirementPayment( "Mary Stone", 2, 3, 5, 6));

	}
	
//	public static int add(int... a) {
//		int sum = 0;
//		for(int w : a) {
//			sum = sum + w;
//		}
//		return sum;
//	}
	
	public static String retirementPayment(String empName, int... amount) {
		
		int result = 1;
		
		for(int w : amount) {
			result = result * w;
		}
		
		return empName + ":" + result;
		
	}

}
