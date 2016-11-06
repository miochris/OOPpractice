package com.fdmgroup.bookstore;

import java.util.ArrayList;

public class Checkout {
	double totalPrice;
	static int bookNum;
	static ArrayList<Book> bookList;

	public double calulatePrice(Basket basket) {
		bookList = basket.getBooksInBasket();
		bookNum = bookList.size();

		int multiplesOfThree = bookNum / 3;
		int oneWhenMoreThanTen = 0;
		double different = 1;
		double twoSame =1;
		
		if ((checkIfAllDifferent() == true) && bookNum >= 3) {
			different = 0.95;
		}
		if (bookNum >= 10) {
			oneWhenMoreThanTen = 1;
		}
		if (checkIfAllDifferent()==true) {
			twoSame = 0.5;
		}
		
		twoSame();

		for (Book b : bookList) {
			totalPrice = totalPrice + b.bookPrice;
		}

		return totalPrice * (1 - multiplesOfThree * 0.01 - 0.1 * oneWhenMoreThanTen) * different;
	}

	public static boolean checkIfAllDifferent() {
		for (int i = 0; i < bookNum; i++)
			for (int j = i + 1; j < bookNum; j++) {
				if (bookList.get(i) == bookList.get(j)) {
					return false;
				}

			}

		return true;

	}

	public static boolean twoSame() {
		for (int i = 0; i < bookNum; i++)
			for (int j = i + 1; j < bookNum; j++) {
				if (bookList.get(i) == bookList.get(j)) {
					bookList.get(i).bookPrice=bookList.get(i).bookPrice*0.5;
					
					return true;
				}

			}

		return false;

	}

}
