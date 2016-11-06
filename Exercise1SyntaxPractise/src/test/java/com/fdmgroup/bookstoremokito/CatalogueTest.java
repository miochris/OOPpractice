package com.fdmgroup.bookstoremokito;

import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class CatalogueTest {

	@Test
	public void test_GetAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue() {
		// Arrange
		ReadItemCommand mockReadItemCommand = mock(ReadItemCommand.class);
		Catalogue catalogue = new Catalogue(mockReadItemCommand);
		// Act

		ArrayList bookListCatched = catalogue.getAllBooks();
		// Assert
		Assert.assertEquals(0, bookListCatched.size());
	}

	@Test
	public void test_GetAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled() {
		// Arrange
		ReadItemCommand mockReadItemCommand = mock(ReadItemCommand.class);
		Catalogue catalogue = new Catalogue(mockReadItemCommand);
		ArrayList bookList = new ArrayList();
		bookList = catalogue.getAllBooks();
		// Act

		// Assert

		verify(mockReadItemCommand, times(1)).readAll();

	}

	@Test
	public void test_GetAllBooks_ReturnsListOfBooksItReceivesFromReadAllMethodOfReadItemCommand_WhenCalled() {
		// Arrange
		ReadItemCommand mockReadItemCommand = mock(ReadItemCommand.class);
		Catalogue catalogue = new Catalogue(mockReadItemCommand);
		ArrayList mockBookList = mock(ArrayList.class);

		when(mockReadItemCommand.readAll()).thenReturn(mockBookList);
		// Act
		ArrayList bookListCatched = catalogue.getAllBooks();
		// Assert
		Assert.assertEquals(bookListCatched, mockBookList);
	}

	@Test
	public void test_AddBook_CallsInsertItemMethodOfWriteItemCommand_WhenCalled() {
		Book mockBook = mock(Book.class);
		WriteItemCommand mockWriteItemCommand = mock(WriteItemCommand.class);
		Catalogue catalogue = new Catalogue(mockWriteItemCommand);
		// Act
		mockWriteItemCommand.insertItem(mockBook);
		// Assert
		verify(mockWriteItemCommand, times(1)).insertItem(mockBook);
	}

	@Test
	public void test_Addbook_passBookTo_intertItem_methodOfWriteItemCommend() {
		Book mockBook = mock(Book.class);
		WriteItemCommand mockWriteItemCommand = mock(WriteItemCommand.class);
		Catalogue catalogue = new Catalogue(mockWriteItemCommand);
		// Act
		catalogue.addBook(mockBook);

		// Assert
		verify(mockWriteItemCommand).insertItem(mockBook);

	}

}
