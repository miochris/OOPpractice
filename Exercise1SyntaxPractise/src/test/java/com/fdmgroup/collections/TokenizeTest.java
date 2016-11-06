package com.fdmgroup.collections;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

public class TokenizeTest {

	@Test
	public void testTokenizeReturnNumOfWord_colon() {
		Tokenize tk = new Tokenize();

		tk.tokenTheSpring("The:Find:method:is:well:documented", ":");
		Set<String> tokens = tk.getTokens();
		
		System.out.println(tokens);

		 Assert.assertTrue( tokens.contains("Find"));
//		Assert.assertTrue(tokens.contains("well"));

	}

}
