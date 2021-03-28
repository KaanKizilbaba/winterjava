package day31interfacecollections;

	/*
	 	Until Java8, we could not create "methods with body" in interfaces
	 	In Java8, Oracle gave us chance to create "methods with body" in interfaces
	 	
	 	1)If you want to create "methods with body" in interfaces you have two options;
	 			a)Use "default" keyword before return type. 
	 			Over here "default" keyword is not access modifier. 
	 			If you create a method in an interface by using "default" keyword, those methods 
	 			are called "default methods"
	 			
	 			b)Use "static" keyword before return type.
	 			  "static" keyword is "static" keyword
	 			  
	     Note: Difference between "default methods" and "static methods" in an interface
	           a)"default methods" can be called just by "objects" but "static methods" can be called by using
	             "interface" names
	           b)If you create "default methods" or "static methods" in an interface no need to override them.
	             Overriding is optional for "default methods" and "static methods"  
	           
	 */

public interface I03 {
	
	public default int add(int a, int b) {
		return a+b;
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}

}
