package object.number;

import java.math.BigDecimal;

public class HBigDecimal extends HNumber {

	public static HBigDecimal valueOf(final BigDecimal value) {
		return new HBigDecimal(value);
	}

	private final BigDecimal	value;

	public HBigDecimal(final BigDecimal value) {
		this.value = value;
	}

}
