package assert_tests;

import librarycatalouge.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Assert_library_catalouge {
	@Test
	public void borrowbook() {
		LibraryCatalouge librarycatalouge =new LibraryCatalouge();
		Book book1= new Book("Live like a monk","Jay Shetty");

		librarycatalouge.addBook(book1);
		librarycatalouge.borrowBook("Live like a monk");
		assertFalse(book1.isAvailable());
	}

	@Test
	public void returnbook() {
		LibraryCatalouge librarycatalouge =new LibraryCatalouge();
		Book book1= new Book("Live like a monk","Jay Shetty");
		librarycatalouge.addBook(book1);
		librarycatalouge.returnBook("Live like a monk");
		assertTrue(book1.isAvailable()); 
	}

}
