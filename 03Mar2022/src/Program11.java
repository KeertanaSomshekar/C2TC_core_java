import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

class Program11 {

	@Test
	void assertTimeOutDemo() {
		BookService bs = new BookService();
		for (int i = 1; i <= 1000; i++) {
			bs.addBook(new Book(String.valueOf(i), "Head First Java", "wrox"));
		}
		
		List<String> actualTitles = new ArrayList<>();
		
		assertTimeout(Duration.ofMillis(1), () -> {
			actualTitles.addAll(bs.getBookTitlesByPublisher("wrox"));
		});
		
		assertEquals(1000, actualTitles.size());
	}
}
