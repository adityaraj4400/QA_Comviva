package library;

import java.util.ArrayList;
import java.util.List;

import library.Book;

public class LibraryCatalouge {
	private List<Book> books;
	 public LibraryCatalouge() {
	 this.books = new ArrayList<Book>();
	 }
	 public void addBook(Book book) {
	 books.add(book);
	 }
	 public List<Book> getBooks() {
	 return new ArrayList<Book>(books);
	 }

	 public void borrowBook(String title) {
	 for (Book book : books) {
	 if (book.getTitle().equals(title) && book.isAvailable()) {
	 book.setAvailable(false);
	 return; 
	 }
	 }
	 }

	 public void returnBook(String title) {
	 for (Book book : books) {
	 if (book.getTitle().equals(title) && !book.isAvailable()) {
	 book.setAvailable(true);
	 return;
	 }
	 }
	 }
}
