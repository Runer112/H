package vm;

import exception.HRuntimeException;

@SuppressWarnings("serial")
public class HStackException extends HRuntimeException {

	HStackException() {
		super();
	}

	HStackException(final String message, final Throwable cause, final boolean enableSuppression,
			final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	HStackException(final String message, final Throwable cause) {
		super(message, cause);
	}

	HStackException(final String message) {
		super(message);
	}

	HStackException(final Throwable cause) {
		super(cause);
	}

}
