import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Program06 {

	@Test
	void assertNullWithNoMessage() {
		BookService bs = new BookService();
		
		Book headFirstJavaBook = new Book("1","Head first java","wrox");
		Book headFirstDesignPatternBook = new Book("2","Head first design pattern","pack");
		Book headFirstJavascriptBook = new Book("3","Head first javascript","wrox");
		
		bs.addBook(headFirstJavaBook);
		bs.addBook(headFirstDesignPatternBook);
		bs.addBook(headFirstJavascriptBook);
		
		Book actualBook = bs.getBookById("4");
		
		assertNull(actualBook);
	}
	
	@Test
	void assertNullWithMessage() {
		BookService bs = new BookService();
		
		Book headFirstJavaBook = new Book("1","Head first java","wrox");
		Book headFirstDesignPatternBook = new Book("2","Head first design pattern","pack");
		Book headFirstJavascriptBook = new Book("3","Head first javascript","wrox");
		
		bs.addBook(headFirstJavaBook);
		bs.addBook(headFirstDesignPatternBook);
		bs.addBook(headFirstJavascriptBook);
		
		Book actualBook = bs.getBookById("4");
		
		assertNull(actualBook, "Book is not null!!");
	}
	
	@Test
	void assertNullWithNoSupplier() {
		BookService bs = new BookService();
		
		Book headFirstJavaBook = new Book("1","Head first java","wrox");
		Book headFirstDesignPatternBook = new Book("2","Head first design pattern","pack");
		Book headFirstJavascriptBook = new Book("3","Head first javascript","wrox");
		
		bs.addBook(headFirstJavaBook);
		bs.addBook(headFirstDesignPatternBook);
		bs.addBook(headFirstJavascriptBook);
		
		Book actualBook = bs.getBookById("4");
		
		assertNull(actualBook, () -> "Book is not null!!");
	}

}
