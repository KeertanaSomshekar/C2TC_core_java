import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class Program01 {

	@Test
	void testOnDev() {
		System.setProperty("ENV","DEV");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
	}

	@Test
	void testOnProd() {
		System.setProperty("ENV", "PROD");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), Program01::message);
	}
	
	private static String message() {
		return "TEST Execution Failed!!";
	}
}
