package object.number;

import java.math.BigDecimal;
import java.math.BigInteger;

@SuppressWarnings("serial")
public abstract class HNumber extends Number {

	public abstract BigInteger bigIntegerValue();

	public abstract BigDecimal bigDecimalValue();

	@Override
	public abstract String toString();

	public abstract HNumber add(HNumber addend);

	protected abstract HNumber add(HLong addend);

	protected abstract HNumber add(HDouble addend);

	protected abstract HNumber add(HBigInteger addend);

	protected abstract HNumber add(HBigDecimal addend);

	public final HNumber subtract(final HNumber subtrahend) {
		return subtrahend.subtractFrom(this);
	}

	protected abstract HNumber subtractFrom(HNumber minuend);

	protected abstract HNumber subtract(HLong subtrahend);

	protected abstract HNumber subtract(HDouble subtrahend);

	protected abstract HNumber subtract(HBigInteger subtrahend);

	protected abstract HNumber subtract(HBigDecimal subtrahend);

	public abstract HNumber multiply(HNumber multiplier);

	protected abstract HNumber multiply(HLong multiplier);

	protected abstract HNumber multiply(HDouble multiplier);

	protected abstract HNumber multiply(HBigInteger multiplier);

	protected abstract HNumber multiply(HBigDecimal multiplier);

	public final HNumber divide(final HNumber divisor) throws HDivideByZeroException {
		return divisor.divideInto(this);
	}

	protected abstract HNumber divideInto(HNumber dividend) throws HDivideByZeroException;

	protected abstract HNumber divide(HLong divisor) throws HDivideByZeroException;

	protected abstract HNumber divide(HDouble divisor);

	protected abstract HNumber divide(HBigInteger divisor) throws HDivideByZeroException;

	protected abstract HNumber divide(HBigDecimal divisor) throws HDivideByZeroException;

	public final HNumber remainder(final HNumber divisor) throws HDivideByZeroException {
		return divisor.remainderInto(this);
	}

	protected abstract HNumber remainderInto(HNumber dividend) throws HDivideByZeroException;

	protected abstract HNumber remainder(HLong divisor) throws HDivideByZeroException;

	protected abstract HNumber remainder(HBigInteger divisor) throws HDivideByZeroException;

	protected abstract HNumber remainder(HDouble divisor);

	protected abstract HNumber remainder(HBigDecimal divisor) throws HDivideByZeroException;

	public final HNumber[] divideAndRemainder(final HNumber divisor) throws HDivideByZeroException {
		return divisor.divideAndRemainderInto(this);
	}

	protected abstract HNumber[] divideAndRemainderInto(HNumber dividend) throws HDivideByZeroException;

	protected abstract HNumber[] divideAndRemainder(HLong divisor) throws HDivideByZeroException;

	protected abstract HNumber[] divideAndRemainder(HBigInteger divisor) throws HDivideByZeroException;

	protected abstract HNumber[] divideAndRemainder(HDouble divisor);

	protected abstract HNumber[] divideAndRemainder(HBigDecimal divisor) throws HDivideByZeroException;

	public final HNumber modulo(final HNumber divisor) throws HDivideByZeroException {
		return divisor.moduloInto(this);
	}

	protected abstract HNumber moduloInto(HNumber dividend) throws HDivideByZeroException;

	protected abstract HNumber modulo(HLong divisor) throws HDivideByZeroException;

	protected abstract HNumber modulo(HBigInteger divisor) throws HDivideByZeroException;

	protected abstract HNumber modulo(HDouble divisor);

	protected abstract HNumber modulo(HBigDecimal divisor) throws HDivideByZeroException;

}
