package com.fdmgroup.collections;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class StoreNameTest {

	@Test
	public void test_VerifyCanReadFirstName() {

		// Arrange
		StoreName storeName = new StoreName();
		Set<String> nameL = new HashSet<String>();
		// Act
		storeName.readFirstName("Ming");
		nameL = storeName.getNameList();
		// Assert
		// nameList.contains(firstName);
		Assert.assertTrue(nameL.contains("Ming"));

	}

	@Test
	public void test_VerifyCanReadTwoFirstName() {

		// Arrange
		StoreName storeName = new StoreName();
		Set<String> nameL = new HashSet<String>();
		// Act
		storeName.readFirstName("Ming");
		storeName.readFirstName("Liang");
		nameL = storeName.getNameList();
		// Assert
		// nameList.contains(firstName);
		Assert.assertTrue(nameL.contains("Ming"));
		Assert.assertTrue(nameL.contains("Liang"));

	}
	
	@Test
	public void test_VerifyNoDuplicate() {

		// Arrange
		StoreName storeName = new StoreName();
		Set<String> nameL = new HashSet<String>();
		// Act
		storeName.readFirstName("Ming");
		storeName.readFirstName("Liang");
		storeName.readFirstName("Ming");
		storeName.readFirstName("Ming");
		nameL = storeName.getNameList();
		// Assert
		// nameList.contains(firstName);
		Assert.assertTrue(nameL.contains("Ming"));
		Assert.assertTrue(nameL.contains("Liang"));
		Assert.assertEquals(2, nameL.size());

	}

}
