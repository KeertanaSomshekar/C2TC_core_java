import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class Program09 {

	@Test
	void assertFalseDemo() {
		BookService bs = new BookService();
		List<Book> listOfBooks = bs.books();
		assertFalse(!listOfBooks.isEmpty());
	}

}
