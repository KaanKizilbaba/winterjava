package day28exceptions;

/*
 	To create an unchecked exception, extend to "RuntimeException" Class
 */

public class InvalidEmailIdUnCheckedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidEmailIdUnCheckedException(String message) {
		super(message);
	}
}
