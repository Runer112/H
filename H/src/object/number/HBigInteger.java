package object.number;

import java.math.BigInteger;

public class HBigInteger extends HNumber {

	public static HBigInteger valueOf(final BigInteger value) {
		return new HBigInteger(value);
	}

	private final BigInteger	value;

	protected HBigInteger(final BigInteger value) {
		this.value = value;
	}

}
