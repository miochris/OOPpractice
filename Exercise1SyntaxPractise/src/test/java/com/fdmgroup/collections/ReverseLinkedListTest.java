package com.fdmgroup.collections;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class ReverseLinkedListTest {
	
	
	@Test
	public void testReverseLinkedList (){
		//Arrange
		List<String> list = new LinkedList<String>();
		List<String> reversedList = new LinkedList<String>();
		ReverseLinkedList rLL = new ReverseLinkedList();
		
		
		//Act
		rLL.insert(0, "A");
		rLL.insert(1, "C");
		rLL.insert(2, "E");
		rLL.insert(3, "M");
		
		list=rLL.getOldList();
		
		reversedList = rLL.reverse(list);
		
		//Assert
		Assert.assertEquals(rLL.getOldList(), list);
		Assert.assertEquals(rLL.getNewList(), reversedList);
		Assert.assertEquals("A", reversedList.get(3));
		Assert.assertEquals("M", reversedList.get(0));
		
		
	}

}
