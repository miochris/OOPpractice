package com.fdmgroup.bookstore;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BasketTest {
	private Basket basket;
	private ArrayList bookList;
//	private Book book;
//	private Book book2;

	@Before
	public void setup() {
		basket = new Basket();
		bookList = new ArrayList();
//		book = new Book();
//		book2 = new Book();
	}

	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded() {
		// Arrange

		// Act
		bookList = basket.getBooksInBasket();
		int bookNum = bookList.size();
		// Assert
		Assert.assertEquals(0, bookNum);

	}

	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook() {
		// Arrange
		// Book book = new Book();

		// Act
		basket.addBook(new Book(0));
		bookList = basket.getBooksInBasket();

		int bookNum = bookList.size();

		// Assert
		Assert.assertEquals(1, bookNum);
	}

	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithTwoBook() {
		// Arrange

		// Act
		basket.addBook(new Book(0));
		basket.addBook(new Book(0));
		bookList = basket.getBooksInBasket();

		int bookNum = bookList.size();

		// Assert
		Assert.assertEquals(2, bookNum);
	}

}
