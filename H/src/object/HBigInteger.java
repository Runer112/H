package object;

import java.math.BigInteger;

public final class HBigInteger implements HNumber {

	private final BigInteger	value;

	public HBigInteger(final BigInteger value) {
		this.value = value;
	}

}
