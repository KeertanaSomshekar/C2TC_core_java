import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Program10 {

	@Test
	void assertThrowsDemo() {
		Throwable exception = assertThrows(IllegalArgumentException.class, 
				() -> {throw new IllegalArgumentException("Exception");
				});
				assertEquals("Exception", exception.getMessage());
		}
	}


