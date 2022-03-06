import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Program05 {
	
	@Test
	void assertArrayEqualsWithNoMessage() {
		BookService bs = new BookService();
		
		Book headFirstJavaBook = new Book("1","Head first java","wrox");
		Book headFirstDesignPatternBook = new Book("2","Head first design pattern","pack");
		Book headFirstJavascriptBook = new Book("3","Head first javascript","wrox");
		
		bs.addBook(headFirstJavaBook);
		bs.addBook(headFirstDesignPatternBook);
		bs.addBook(headFirstJavascriptBook);
		
		String[] actualBookIds = bs.getBookIdsByPublisher("wrox");
		
		assertArrayEquals(new String[] {"1","3"}, actualBookIds);
	}
	@Test
	void assertArrayEqualsWithMessage() {
		BookService bs = new BookService();
		
		Book headFirstJavaBook = new Book("1","Head first java","wrox");
		Book headFirstDesignPatternBook = new Book("2","Head first design pattern","pack");
		Book headFirstJavascriptBook = new Book("3","Head first javascript","wrox");
		
		bs.addBook(headFirstJavaBook);
		bs.addBook(headFirstDesignPatternBook);
		bs.addBook(headFirstJavascriptBook);
		
		String[] actualBookIds = bs.getBookIdsByPublisher("wrox");
		
		assertArrayEquals(new String[] {"1","3"}, actualBookIds, "bookIds didn't match!!");
	}
	
	@Test
	void assertArrayEqualsWithSupplier() {
		BookService bs = new BookService();
		
		Book headFirstJavaBook = new Book("1","Head first java","wrox");
		Book headFirstDesignPatternBook = new Book("2","Head first design pattern","pack");
		Book headFirstJavascriptBook = new Book("3","Head first javascript","wrox");
		
		bs.addBook(headFirstJavaBook);
		bs.addBook(headFirstDesignPatternBook);
		bs.addBook(headFirstJavascriptBook);
		
		String[] actualBookIds = bs.getBookIdsByPublisher("wrox");
		
		assertArrayEquals(new String[] {"1","3"}, actualBookIds, () -> "bookIds didn't match!!");
	}

}
