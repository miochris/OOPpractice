package com.fdmgroup.generics.catalogue;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;


public class CaatalogueTest {
	
	@Test
	public void test_AddItemCalled(){
		
		Catalog <Book> ca = new Catalog<Book>();
		Book mockBook = new Book();
		ca.addItem(mockBook);
		
		
		Assert.assertTrue(ca.getAllItems().contains(mockBook));
		
		
	}
	
	@Test
	public void test_ID(){
		
		Book book1 = new Book();
		Book book2 = new Book();
		
		
		
		Assert.assertTrue(book1.getItemId()!=book2.getItemId());
		
		
	}
	
	
	@Test
	public void test_searchByID(){
		Catalog <Book> ca = new Catalog<Book>();
		Book mockBook = new Book();
		ca.addItem(mockBook);
		
		when(mockBook.getItemId()).thenReturn(9087);
	
		Assert.assertEquals(ca.searchItem(9087),mockBook);
		
//		Assert.assertTrue(ca.searchItem(9087)==mockBook);
		
		
	}

}
