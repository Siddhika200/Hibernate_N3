package org.tnsif.client;

import org.tnsif.services.BookServices;
import org.tnsif.services.BookServicesImpl;

public class Client {

	public static void main(String[] args) {
        BookServices service=new BookServicesImpl();
		
		// return total  books
		System.out.println("Total no.of books: "+service.getCount());
		
		// return specific book id
		System.out.println("Book with specific Id: "+service.getBookByIds(3));
		
		//price range
		System.out.println("Price range between 300 to 600: "+service.getPrice(300f, 600f));
		
		//author name
		System.out.println("Book with specific author: "+service.getBooksAuthor("Yashwanth"));
		
		//return all books
		System.out.println("All books: "+service.getAll());
	}

}


