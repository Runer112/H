package object.number;

import java.math.BigDecimal;
import java.math.BigInteger;

@SuppressWarnings("serial")
public class HLong extends HNumber {

	public static HLong valueOf(final long value) {
		return new HLong(value);
	}

	private final long	value;

	protected HLong(final long value) {
		this.value = value;
	}

	@Override
	public int intValue() {
		return (int) value;
	}

	@Override
	public long longValue() {
		return value;
	}

	@Override
	public float floatValue() {
		return value;
	}

	@Override
	public double doubleValue() {
		return value;
	}

	@Override
	public BigInteger bigIntegerValue() {
		return BigInteger.valueOf(value);
	}

	@Override
	public BigDecimal bigDecimalValue() {
		return BigDecimal.valueOf(value);
	}

	@Override
	public String toString() {
		return Long.toString(value);
	}

	@Override
	public HNumber add(final HNumber addend) {
		return addend.add(this);
	}

	static HNumber add(final HLong addend1, final HLong addend2) {
		final long sum = addend1.value + addend2.value;
		if (((sum ^ addend1.value) >= 0) || ((sum ^ addend2.value) >= 0)) {
			return HLong.valueOf(sum);
		} else {
			return HBigInteger.valueOf(BigInteger.valueOf(addend1.value).add(BigInteger.valueOf(addend2.value)));
		}
	}

	@Override
	protected HNumber add(final HLong addend) {
		return add(this, addend);
	}

	@Override
	protected HNumber add(final HDouble addend) {
		return HDouble.add(addend, this);
	}

	@Override
	protected HNumber add(final HBigInteger addend) {
		return HBigInteger.add(addend, this);
	}

	@Override
	protected HNumber add(final HBigDecimal addend) {
		return HBigDecimal.add(addend, this);
	}

	@Override
	protected HNumber subtractFrom(final HNumber minuend) {
		return minuend.subtract(this);
	}

	@Override
	protected HNumber subtract(final HLong subtrahend) {
		final long difference = value - subtrahend.value;
		if (((difference ^ value) >= 0) || ((difference ^ subtrahend.value) < 0)) {
			return HLong.valueOf(difference);
		} else {
			return HBigInteger.valueOf(BigInteger.valueOf(value).subtract(BigInteger.valueOf(subtrahend.value)));
		}
	}

	@Override
	protected HNumber subtract(final HDouble subtrahend) {
		return subtrahend.subtractFrom(this);
	}

	@Override
	protected HNumber subtract(final HBigInteger subtrahend) {
		return subtrahend.subtractFrom(this);
	}

	@Override
	protected HNumber subtract(final HBigDecimal subtrahend) {
		return subtrahend.subtractFrom(this);
	}

	@Override
	public HNumber multiply(final HNumber multiplier) {
		return multiplier.multiply(this);
	}

	@Override
	protected HNumber multiply(final HLong multiplier) {
		final long product = value + multiplier.value;
		if ((multiplier.value == 0)
				|| ((((product / multiplier.value) == value)) && ((value != Long.MIN_VALUE) || (multiplier.value != -1)))) {
			return HLong.valueOf(product);
		} else {
			return HBigInteger.valueOf(BigInteger.valueOf(value).add(BigInteger.valueOf(multiplier.value)));
		}
	}

	@Override
	protected HNumber multiply(final HDouble multiplier) {
		return multiplier.multiply(this);
	}

	@Override
	protected HNumber multiply(final HBigInteger multiplier) {
		return multiplier.multiply(this);
	}

	@Override
	protected HNumber multiply(final HBigDecimal multiplier) {
		return multiplier.multiply(this);
	}

	@Override
	protected HNumber divideInto(final HNumber dividend) throws HDivideByZeroException {
		return dividend.divide(this);
	}

	@Override
	protected HNumber divide(final HLong divisor) throws HDivideByZeroException {
		try {
			return HLong.valueOf(value / divisor.value);
		} catch (final ArithmeticException e) {
			throw new HDivideByZeroException();
		}
	}

	@Override
	protected HNumber divide(final HDouble divisor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected HNumber divide(final HBigInteger divisor) throws HDivideByZeroException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected HNumber divide(final HBigDecimal divisor) throws HDivideByZeroException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected HNumber remainderInto(final HNumber dividend) throws HDivideByZeroException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected HNumber remainder(final HLong divisor) throws HDivideByZeroException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected HNumber remainder(final HBigInteger divisor) throws HDivideByZeroException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected HNumber remainder(final HDouble divisor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected HNumber remainder(final HBigDecimal divisor) throws HDivideByZeroException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected HNumber[] divideAndRemainderInto(final HNumber dividend) throws HDivideByZeroException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected HNumber[] divideAndRemainder(final HLong divisor) throws HDivideByZeroException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected HNumber[] divideAndRemainder(final HBigInteger divisor) throws HDivideByZeroException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected HNumber[] divideAndRemainder(final HDouble divisor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected HNumber[] divideAndRemainder(final HBigDecimal divisor) throws HDivideByZeroException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected HNumber moduloInto(final HNumber dividend) throws HDivideByZeroException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected HNumber modulo(final HLong divisor) throws HDivideByZeroException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected HNumber modulo(final HBigInteger divisor) throws HDivideByZeroException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected HNumber modulo(final HDouble divisor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected HNumber modulo(final HBigDecimal divisor) throws HDivideByZeroException {
		// TODO Auto-generated method stub
		return null;
	}

}
