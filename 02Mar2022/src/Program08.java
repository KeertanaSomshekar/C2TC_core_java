import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
class Program08 {

	@Test
	void testWillBeSkipped() {
		System.out.println("Test will be skipped");
	}

	@Disabled
	void testSkipped() {
		System.out.println("Test Skipped");
	}
}
