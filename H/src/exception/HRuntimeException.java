package exception;

@SuppressWarnings("serial")
public class HRuntimeException extends RuntimeException {

	public HRuntimeException() {
		super();
	}

	public HRuntimeException(final String message, final Throwable cause, final boolean enableSuppression,
			final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public HRuntimeException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public HRuntimeException(final String message) {
		super(message);
	}

	public HRuntimeException(final Throwable cause) {
		super(cause);
	}

}
