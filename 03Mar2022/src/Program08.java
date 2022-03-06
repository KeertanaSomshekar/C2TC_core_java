import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class Program08 {

	@Test
	void assertTrueDemo() {
		BookService bs = new BookService();
		List<Book> listOfBooks = bs.books();
		assertTrue(listOfBooks.isEmpty());
	}

}
