package figuras.exceptions;

public class FiguraException extends Exception {

	public FiguraException() {}

	public FiguraException(String message) {
		super(message);
	}

	public FiguraException(Throwable cause) {
		super(cause);
	}

	public FiguraException(String message, Throwable cause) {
		super(message, cause);
	}

	public FiguraException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	
}
