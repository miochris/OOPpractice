package com.fdmgroup.bookstoremokito;

import java.util.ArrayList;

public class Catalogue {
	ArrayList bookList = new ArrayList();
	private ReadItemCommand rIC;
	private WriteItemCommand wIC;
	// public Catalogue() {

	// }

	public Catalogue(ReadItemCommand rIC) {
		this.rIC = rIC;
	}

	public ArrayList getAllBooks() {
		return rIC.readAll();
	}

	public Catalogue(WriteItemCommand wIC) {
		this.wIC = wIC;
	}

	public void addBook(Book book) {
		wIC.insertItem(book);
	}

}
