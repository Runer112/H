package object;

public interface HNumber {

	HLong longValue();

	HBigInteger bigIntegerValue();

	HDouble doubleValue();

	HBigDecimal bigDecimalValue();

	HNumber add(HNumber addend);

	HNumber add(HLong addend);

	HNumber add(HBigInteger addend);

	HNumber add(HDouble addend);

	HNumber add(HBigDecimal addend);

}
