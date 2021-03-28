package day29abstractclass;

/*
 	1)BlindCalculator is an abstract class, even though I do not override
 	  abstract methods form Operations class, it is not complaining.
 	  Because, it is not must to override abstract methods for an abstract child class.
 */
public abstract class BlindCalculator extends Operations {
	
	public abstract void read();
	
}
