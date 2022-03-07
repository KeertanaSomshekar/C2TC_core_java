import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

class Program03 {

	@Test
	void testAssumingThat() {
		System.setProperty("ENV", "CI");
		assumingThat("CI".equals(System.getProperty("ENV")),
				() -> {
					System.out.println("Assuming that executable executed");
				});
		
		assertTrue(Math.random() > 0);
	}
}
