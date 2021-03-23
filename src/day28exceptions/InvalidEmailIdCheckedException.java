package day28exceptions;

/*
 	1)Name the class by using "Exception" word at the end.
      Using "Exception" word at the end is not must but it is naming convention
    2)To create a "checked exception", you should extend to "Exception" class
    3)Create constructor with a "String" parameter, and inside the sonstructor use super()
 */

public class InvalidEmailIdCheckedException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidEmailIdCheckedException(String message) {
		super(message);
	}

}
