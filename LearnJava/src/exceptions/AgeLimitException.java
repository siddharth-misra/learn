package exceptions;

public class AgeLimitException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AgeLimitException(String message) {
		super(message);
	}

}
