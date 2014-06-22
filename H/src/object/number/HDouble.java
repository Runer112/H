package object.number;

import java.math.BigDecimal;
import java.math.BigInteger;

public class HDouble extends HNumber {

	public static HDouble valueOf(final double value) {
		return new HDouble(value);
	}

	private final double	value;

	protected HDouble(final double value) {
		this.value = value;
	}

	@Override
	public int intValue() {
		return (int) value;
	}

	@Override
	public long longValue() {
		return (long) value;
	}

	@Override
	public float floatValue() {
		return (float) value;
	}

	@Override
	public double doubleValue() {
		return value;
	}

	@Override
	public BigInteger bigIntegerValue() {
		return bigDecimalValue().
	}

	@Override
	public BigDecimal bigDecimalValue() {
		return BigDecimal.valueOf(value);
	}

	@Override
	public String toString() {
		return Long.toString(value);
	}

}
