//beforeEach Demo Program

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

class Program02 {

	@RepeatedTest(5)
	void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.println("Running Test -> "+repetitionInfo.getCurrentRepetition());
		Assertions.assertEquals(2, Calculator.add(1, 1));
	}

	@BeforeEach
	public void initEach() {
		System.out.println("Before All initEach method called");
	}
}
