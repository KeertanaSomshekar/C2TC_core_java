//Tag Demo Program

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("fast")
@Tag("model")
class Program07 {

	@Test
	@Tag("taxes")
	void testingTaxCalculation() {
		System.out.println("Tax Calculation");
	}

}
