package com.fdmgroup.bookstore;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckoutTest {

	double totalPrice;
	private Basket basket;
	private Checkout checkout;
	int bookNumToTest;
	private double priceExpected;

	@Before
	public void setup() {

		totalPrice = 0.0;
		basket = new Basket();
		checkout = new Checkout();
		bookNumToTest = 0;
	}

	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroWhenPassedAnEmptyBasket() {
		// Arrange
		priceExpected = 0;
		// Act

		// Assert

	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook() {

		// Arrange
		priceExpected = 10;
		// Act
		basket.addBook(new Book(10));
		// Assert

	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTwoBooks() {

		// Arrange
		priceExpected = 30;
		// Act
		basket.addBook(new Book(10));
		basket.addBook(new Book(20));
		// Assert

	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithThreeBooks() {

		// Arrange
		priceExpected = 99*0.95;
		// Act
		basket.addBook(new Book(30));
		basket.addBook(new Book(15));
		basket.addBook(new Book(55));
		// Assert

	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithSevenBooks() {

		// Arrange
		priceExpected = 10*7*0.98*0.95;
		// Act
		basket.addBook(new Book(10));
		basket.addBook(new Book(10));
		basket.addBook(new Book(10));
		basket.addBook(new Book(10));
		basket.addBook(new Book(10));
		basket.addBook(new Book(10));
		basket.addBook(new Book(10));
		// Assert

	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTenBooks() {

		// Arrange
		priceExpected = 25.99 * 10 * 0.87*0.95;
		// Act
		basket.addBook(new Book(25.99));
		basket.addBook(new Book(25.99));
		basket.addBook(new Book(25.99));
		basket.addBook(new Book(25.99));
		basket.addBook(new Book(25.99));
		basket.addBook(new Book(25.99));
		basket.addBook(new Book(25.99));
		basket.addBook(new Book(25.99));
		basket.addBook(new Book(25.99));
		basket.addBook(new Book(25.99));
		// Assert

	}
	
	@Test
	public void test_AllDifferent5AdditionalDiscount(){
		priceExpected = 25.99 * 10 * 0.87*0.95;
		// Act
		basket.addBook(new Book(25.99));
		basket.addBook(new Book(25.99));
		basket.addBook(new Book(25.99));
		basket.addBook(new Book(25.99));
		basket.addBook(new Book(25.99));
		basket.addBook(new Book(25.99));
		basket.addBook(new Book(25.99));
		basket.addBook(new Book(25.99));
		basket.addBook(new Book(25.99));
		basket.addBook(new Book(25.99));
		// Assert
		
	}
	
	@Test
	public void test_NotAllDifferentNoAdditionalDiscount(){
		priceExpected = 25*0.5 * 4* 0.99;
		// Act

		Book book1 =new Book(25);
		basket.addBook(book1);
		basket.addBook(book1);
		basket.addBook(book1);
		basket.addBook(book1);

		// Assert
	}
	
	@Test
	public void test_twoBookSame(){
		priceExpected = 50;
		// Act

		Book book1 =new Book(50);
		basket.addBook(book1);
		basket.addBook(book1);
		

		// Assert
	}

	@After
	public void after() {
		// Act
		totalPrice = checkout.calulatePrice(basket);
		// Assert
		Assert.assertEquals(priceExpected, totalPrice, 0.01);
	}

}
