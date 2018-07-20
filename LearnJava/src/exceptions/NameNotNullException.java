package exceptions;

public class NameNotNullException extends Exception {

	private static final long serialVersionUID = 1L;

	public NameNotNullException(String message) {
		super(message);
	}

}
