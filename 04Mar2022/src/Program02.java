import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class Program02 {

	@Test
	void testOnDev() {
		System.setProperty("ENV","DEV");
		Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")));
	}

	@Test
	void testOnProd() {
		System.setProperty("ENV", "PROD");
		Assumptions.assumeFalse("DEV".equals(System.getProperty("ENV")), Program02::message);
	}
	
	private static String message() {
		return "TEST Execution Failed!!";
	}
}
