package client;

import entities.Book;
import service.BookService;
import service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {

		BookService service = new BookServiceImpl();
		
		
		System.out.println("************Listing total number of books*************");
		System.out.println("Total books:"+service.getBookCount());
		
		System.out.println("************Listing book with id 106*************");
		System.out.println("Book with ID 106:"+service.getBookById(106));
		
		System.out.println("************Listing All books*************");
		for(Book book:service.getAllBooks()) {
			System.out.println(book);
		}
		
		
		
		System.out.println("************Listing book written by Danny Coward*************");
		for(Book book:service.getAuthorBooks("Danny Coward") ) {
			System.out.println(book);
		}
		
		System.out.println("************Listing book on Android*************");
		for(Book book:service.getBookByTitle("Android")) {
			System.out.println(book);
		}
		
		
		
		System.out.println("************Listing All books between 500 and 600*************");
		for(Book book:service.getBooksInPriceRange(500, 600) ) {
			System.out.println(book);
		}
		
		
		
		

	}
}
