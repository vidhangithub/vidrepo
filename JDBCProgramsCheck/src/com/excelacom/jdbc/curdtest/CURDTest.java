package com.infosys.jdbc.curdtest;

import java.util.Iterator;
import java.util.List;

public class CURDTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	BookService bookService= new BookService();
	//BookBean bookbean=null;
	
	/*//verifyUser()
	int x=bookService.verifyUser("vidhan", "chandra");
	System.out.println("return value of verifyUser()"+x);*/
	
	//Adding the book
	/*BookBean bookbean1= new BookBean("100124", "hibernate", "vidhan", "2", "GTS PUB", "Red book", "1300");
	int x1=bookService.addBook(bookbean1);
	System.out.println("return value of addBook()"+x1);*/
	
	/*//updating the book
	BookBean bookbean1= new BookBean("100121", "JDBC-JSF", "kumar", "2", "100ME", "white book", "600");
	int x2=bookService.updateBook(bookbean1);
	System.out.println("return value of updateBook()"+x2);*/
	
	/*//deleteing the book
	int x3=bookService.deleteBook("100121");
	System.out.println("return value of deleteBook()"+x3);*/
	
	//get books by bid
	/*bookbean=bookService.getBookByBid("100123");
	System.out.println(bookbean.getAuthor());
	System.out.println(bookbean.toString());*/
	
	//get All book info
	List<BookBean> bookList=bookService.getAllBook();
	Iterator<BookBean> it=bookList.iterator();
	while (it.hasNext()) {
		BookBean bookBean = (BookBean) it.next();
		System.out.println(bookBean);
	}
	}

}
