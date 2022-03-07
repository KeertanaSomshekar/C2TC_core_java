import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

class Program04 {

	@Test
	void testAssumeTrueOnTestEnv() {
		System.setProperty("ENV", "TEST");
		assumeTrue("TEST".equals(System.getProperty("ENV")));
		assertTrue(Math.random() > 0);
	}
	
	@Test
	void testAssumeTrueOnTestEnvWithFalseCondition() {
		System.setProperty("ENV", "TEST");
		assumeTrue("PRODUCTION".equals(System.getProperty("ENV")));
		assertTrue(Math.random() > 0);
	}
	
	@Test
	void testAssumeTrueOnTestEnvWithTrueCondition() {
		System.setProperty("ENV", "PRODUCTION");
		assumeTrue("PRODUCTION".equals(System.getProperty("ENV")));
		assertTrue(Math.random() > 0);
	}

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
