//DisplayName Demo Program

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

class Program05 {
	
	@DisplayName("Program number 5")
	@RepeatedTest(5)
	void addNumbers(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.println("Running Test -> "+repetitionInfo.getCurrentRepetition());
		Assertions.assertEquals(2, Calculator.add(1, 1));
	}

	@AfterEach
	public void initEach() {
		System.out.println("After All initEach method called");
	}
}
