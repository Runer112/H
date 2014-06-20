package object;

import java.math.BigDecimal;

public final class HBigDecimal implements HNumber {

	private final BigDecimal	value;

	public HBigDecimal(final BigDecimal value) {
		this.value = value;
	}

}
