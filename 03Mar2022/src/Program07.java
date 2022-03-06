import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Program07 {

	@Test
	void assertNotNullWithNoMessage() {
		BookService bs = new BookService();
		
		Book headFirstJavaBook = new Book("1","Head first java","wrox");
		Book headFirstDesignPatternBook = new Book("2","Head first design pattern","pack");
		Book headFirstJavascriptBook = new Book("3","Head first javascript","wrox");
		
		bs.addBook(headFirstJavaBook);
		bs.addBook(headFirstDesignPatternBook);
		bs.addBook(headFirstJavascriptBook);
		
		Book actualBook = bs.getBookById("1");
		
		assertNotNull(actualBook);
	}
	
	@Test
	void assertNotNullWithMessage() {
		BookService bs = new BookService();
		
		Book headFirstJavaBook = new Book("1","Head first java","wrox");
		Book headFirstDesignPatternBook = new Book("2","Head first design pattern","pack");
		Book headFirstJavascriptBook = new Book("3","Head first javascript","wrox");
		
		bs.addBook(headFirstJavaBook);
		bs.addBook(headFirstDesignPatternBook);
		bs.addBook(headFirstJavascriptBook);
		
		Book actualBook = bs.getBookById("1");
		
		assertNotNull(actualBook, "Book is not null!!");
	}
	
	@Test
	void assertNotNullWithNoSupplier() {
		BookService bs = new BookService();
		
		Book headFirstJavaBook = new Book("1","Head first java","wrox");
		Book headFirstDesignPatternBook = new Book("2","Head first design pattern","pack");
		Book headFirstJavascriptBook = new Book("3","Head first javascript","wrox");
		
		bs.addBook(headFirstJavaBook);
		bs.addBook(headFirstDesignPatternBook);
		bs.addBook(headFirstJavascriptBook);
		
		Book actualBook = bs.getBookById("1");
		
		assertNotNull(actualBook, () -> "Book is not null!!");
	}


}
