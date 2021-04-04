package lambda;

import java.util.stream.IntStream;

public class LambdaForForLoop {

	public static void main(String[] args) {
		
		printOneToHundred(1, 20); 
		System.out.println();
		printOneToHundredFunctional(1, 20);
		System.out.println();
		System.out.println(findSum(3, 98));
		System.out.println();
		System.out.println(findEvenSum(3, 98));
		System.out.println();
		System.out.println(findOddProd(3, 11));
		System.out.println();
		System.out.println(findFactorial(9));
		System.out.println();
		System.out.println(prodOfFirst(7));
		System.out.println();
		System.out.println(prodOfFirst2(7));
		System.out.println();
		System.out.println(addFirstOdds(23));
		System.out.println();
		System.out.println(prodFirstOdds(5));
	}
	
	/*
	 	Print all integers from 1 to 20 without using any loop
	*/
	
	//1)Use structured programming
	public static void printOneToHundred(int starting, int ending) {		
		System.out.print(starting + " ");	
		starting++;
		if(starting<ending+1) {	
			printOneToHundred(starting, ending);	
		}
	}
	
	//2)Functional Programming
	//In range() method second parameter is exclusive
	//In rangeClosed() method first and second parameters are inclusive
	public static void printOneToHundredFunctional(int starting, int ending) {	
		//IntStream.range(starting, ending).forEach(t->System.out.print(t + " "));
		IntStream.rangeClosed(starting, ending).forEach(t->System.out.print(t + " "));	
	}
	
	/*
 		Find the sum of integers from 3 to 98 by using functional programming
    */
	public static int findSum(int starting, int ending) {
		return IntStream.rangeClosed(starting, ending).sum();	
	}
	/*
		Find the sum of even integers from 3 to 98 by using functional programming
    */
	public static int findEvenSum(int starting, int ending) {
		return IntStream.rangeClosed(starting, ending).filter(Utils::checkToBeEven).sum();	
	}
	
	//Find the multiplication of odd integers from 3 to 28
	public static int findOddProd(int starting, int ending) {
		return IntStream.rangeClosed(starting, ending).filter(Utils::checkToBeOdd).reduce(1, Math::multiplyExact);
	}
	
	//Find 9! by using functional programming (9!=1*2*3...*9)
	public static int findFactorial(int num) {	
		return IntStream.rangeClosed(1, num).reduce(1, Math::multiplyExact);
	}
	
	//Find the multiplication of first 7 even counting numbers (2,4,6,8,10,12,14)
	
	//1.Way: Not recommended
	public static int prodOfFirst(int num) {
		return IntStream.rangeClosed(1, 2*num).filter(Utils::checkToBeEven).reduce(1, Math::multiplyExact);
	}
	
	//2.Way:Recommended
	public static int prodOfFirst2(int num) {
		return IntStream.iterate(2, t->t+2).limit(num).reduce(1, Math::multiplyExact);
	}
	
	//Find the sum of first 23 odd counting numbers
	public static int addFirstOdds(int num) {
		return IntStream.iterate(1, t->t+2).limit(num).sum();
	}
	
	//Find the multiplication of first 5 odd counting numbers which are greater than 6 ==> 7, 9, 11, 13, 15
	public static int prodFirstOdds(int num) {
		return IntStream.iterate(7, t->t+2).limit(num).reduce(1, Math::multiplyExact);
	}

}
