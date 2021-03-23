package day29abstractclass;

/*
 	1)BlindCalculator is an abstract class, even I did not override
 	  abstract methods form Operatios class, it is not complaining.
 	  Because, it is not must to override abstract methods for an abstract child class.
 */
public abstract class BlindCalculator extends Operations {
	
	public abstract void read();
	
}
