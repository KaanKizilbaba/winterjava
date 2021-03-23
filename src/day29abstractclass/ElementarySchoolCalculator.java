package day29abstractclass;

/*
 	1)When you make a "concrete class" child of an abstract class
 	  you have to implement "abstract methods", otherwise 
 	  you will get compile time error.
 	 
 	2)After overriding abstract methods, you have to type implementation
 */

public class ElementarySchoolCalculator extends Operations{

	@Override
	public int add(int... a) {
		int sum = 0;
		for(int w : a) {
			sum = sum + w;
		}
		return sum;
	}
	@Override
	public int subtract(int... a) {
		int diff = 0;
		for(int w : a) {
			diff = diff - w;
		}
		return diff;
	}
	@Override
	public int division(int a, int b) {
		return a/b;
	}
	@Override
	public int multiplication(int... a) {
		int prod = 1;
		for(int w : a) {
			prod = prod * w;		
		}
		return prod;
	}

}
