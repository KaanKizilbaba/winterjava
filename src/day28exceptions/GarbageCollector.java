package day28exceptions;

public class GarbageCollector {
	
	/*
	 	1)Garbage Collector deatroys the "finalized" objects
	 	2)To finalize an object Java uses "finalize()" method
	 	3)If you want you can call "finalize()" method among your code but
	 	  Java decides when and how to use finalize() method.
	*/
	
	/*
	 	Explain "final", "finally", and "finalize"?
	 	
	 	1)"final" is a keyword, "finally" is a code block, "finalize" is a method
	 	2)"final" ==> a)final variables:
	 						i)Final variables must be initialized
	 						ii)Final variable values cannot be modified
	 						ii)Final variables should be named by using uppercases
	 	              b)final methods:
	 	              		i)Final methods cannot be overridden but can be overloaded
	 	              c)final classes:
	 	              		i)Final classes cannot have child classes. No inheritance, no extends.
	 	              		
	   3)"finally" ==> a)It is used with try block or try-catch block  
	                   b)It is executed when the exception is thrown or the exception is not thrown
	                   c)It is used to end connections with database, or cloud or it is used to 
	                     close a file.
	   
	   4)"finalize" ==> a)It is executed before Garbage Collector destroys the objects
	*/

}
