import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Program03 {

	@Test
	void demo() {
		Student st = new Student("Ramesh", "Vishal");
		assertAll("student", () -> assertEquals("Ramesh", st.getFirstName()), 
				() -> assertEquals("Vishal", st.getLastName()));
	}
}