import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Program02 {

	@Test
	public void simple() {
		int A = 1;
		int B = 1;
		assertEquals(A, B);
	}
	
	@Test
	public void simple1() {
		int A = 1;
		int B = 1;
		assertEquals(A, B);
	}
	
	@Disabled
	@Test
	public void simple2() {
		int A = 1;
		int B = 2;
		assertEquals(A, B);
	}
}
