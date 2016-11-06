package com.fdmgroup.bookstore;

import java.util.ArrayList;

public class Basket {
	ArrayList bookList = new ArrayList();

	public ArrayList getBooksInBasket() {
		// ArrayList bookList = new ArrayList();

		return bookList;
	}

	public void addBook(Book book) {
		bookList.add(book);

	}

}
