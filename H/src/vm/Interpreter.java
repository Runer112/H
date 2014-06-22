package vm;

import java.io.InputStream;
import java.io.OutputStream;

public class Interpreter {

	private final InputStream	code;
	private final InputStream	in;
	private final OutputStream	out;
	private final OutputStream	err;

	public Interpreter(final InputStream code) {
		this(code, System.in, System.out, System.err);
	}

	public Interpreter(final InputStream code, final InputStream in, final OutputStream out, final OutputStream err) {
		this.code = code;
		this.in = in;
		this.out = out;
		this.err = err;
	}

}
