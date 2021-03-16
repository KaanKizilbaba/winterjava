package day25overridingexceptions;

public class Exception01 {

	public static void main(String[] args) {	
		System.out.println(divide(6,2));//3
		System.out.println(divide(2,6));//0
		System.out.println(divide(-8,-4));//2
		System.out.println(divide(-4,-8));//0
		System.out.println(divide(12,-2));//-6
		System.out.println(divide(-3,12));//-0
		System.out.println(divide(0,2));//0
		System.out.println(divide(4,0));//Run Time Exception
	}
	
	public static int divide(int a, int b) {
		
		int result = 0;
		
		try {
			
			return a / b;
			
		}catch(ArithmeticException e){
			
			System.out.println("Do not use zero for denominator");
			
		}
		
		return result;

	}

}
