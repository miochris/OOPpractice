package com.fdmgroup.generics.catalogue;

public class App {
	public static void main(String[] args) {
		Catalog<Book> c = new Catalog<Book>();
		Book book1 = new Book();
		Book book2 = new Book();
		c.addItem(book1);
		c.addItem(book2);

		System.out.println(c.getAllItems().size());

		Catalog<Loan> l = new Catalog<Loan>();
		Loan loan1 = new Loan();
		l.addItem(loan1);
		Loan loan2 = new Loan();
		l.addItem(loan2);
		l.addItem(loan2);
		//
		// System.out.println(l.getAllItems().size());

		for (Book b : c.getAllItems()) {
			// if (b.getItemId() == 01) {
			System.out.println(b.toString());
			// }

		}
		for (Loan ll : l.getAllItems()) {
			System.out.println(ll.toString());

		}

	}

}
