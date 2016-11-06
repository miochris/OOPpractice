package com.fdmgroup.collections;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class CountDuplicateWordinSentence {
	
	@Test
	public void test_check_Dup_inSentence (){
		//Arrange
		DuplicateWordInSentence cl = new DuplicateWordInSentence();
		Map<String, Integer> occurr = new HashMap<String, Integer>();
		//Act
		cl.countDuplicate("Hello world, hello dog, hello ... cat, DOG cat CAT");
		occurr=cl.getOccurrences();
		//Assert
		Assert.assertEquals(3, (int)occurr.get("HELLO"));
		Assert.assertEquals(2, (int)occurr.get("CAT"));
	}
	
	@Test
	public void test_check_Dup2_inSentence (){
		//Arrange
		DuplicateWordInSentence cl = new DuplicateWordInSentence();
		Map<String, Integer> occurr = new HashMap<String, Integer>();
		//Act
		cl.countDuplicate("Hello world, hello dog, hello cat, DOG cat CAT e e E cAt !! ..");
		occurr=cl.getOccurrences();
		//Assert
//		Assert.assertEquals(3, (int)occurr.get("HELLO"));
		Assert.assertEquals(3, (int)occurr.get("CAT"));
	}

}
