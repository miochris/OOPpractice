package com.fdmgroup.collections;

import org.junit.Assert;
import org.junit.Test;


public class CountLetterTest {
	
	
	@Test
	public void test_check_A_returnsOneA (){
		//Arrange
		CounterLetter cl = new CounterLetter();
		//Act
		int times = cl.count("A",'A');
		//Assert
		Assert.assertEquals(1, times);
	}
	
	@Test
	public void test_check_AA_returnsTwoA (){
		//Arrange
		CounterLetter cl = new CounterLetter();
		//Act
		int times = cl.count("AA",'A');
		//Assert
		Assert.assertEquals(2, times);
	}
	
	@Test
	public void test_check_AAERTRWET_returnsTwoA (){
		//Arrange
		CounterLetter cl = new CounterLetter();
		//Act
		int times = cl.count("AAERTRWET",'T');
		//Assert
		Assert.assertEquals(2, times);
	}

}
