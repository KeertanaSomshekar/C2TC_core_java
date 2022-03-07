//beforeAll Demo Program

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

class Program01 {

	@RepeatedTest(5)
	void addNumbers(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.println("Running Test -> "+repetitionInfo.getCurrentRepetition());
		Assertions.assertEquals(2, Calculator.add(1, 1));
	}

	@BeforeAll
	public static void init() {
		System.out.println("Before All init method called");
	}
}
