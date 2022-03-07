//afterAll Demo Program

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

class Program03 {

	@RepeatedTest(5)
	void addNumbers(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.println("Running Test -> "+repetitionInfo.getCurrentRepetition());
		Assertions.assertEquals(2, Calculator.add(1, 1));
	}

	@AfterAll
	public static void init() {
		System.out.println("After All init method called");
	}
}
