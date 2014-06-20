package vm;

@SuppressWarnings("serial")
class HInternalError extends RuntimeException {

	HInternalError(final String message, final Throwable cause) {
		super(message, cause);
	}

	HInternalError(final String message) {
		super(message);
	}

}
