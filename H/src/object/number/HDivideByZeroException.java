package object.number;

import exception.HRuntimeException;

@SuppressWarnings("serial")
class HDivideByZeroException extends HRuntimeException {

	public HDivideByZeroException() {
		super("Cannot divide by unsigned zero");
	}

}
