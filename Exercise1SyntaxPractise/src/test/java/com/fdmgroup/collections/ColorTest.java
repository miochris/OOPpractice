package com.fdmgroup.collections;

import java.awt.Color;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class ColorTest {

	@Test
	public void test_ReturnBlack() {
		
		//Arrange
		Colorzzz color = new Colorzzz();
		HashMap<String, Color> colorMap = new HashMap<String, Color>();
		//Act
		colorMap = color.getColorMap();
		//Assert
//		Assert.assertTrue(colorMap.containsKey("Black"));
//		Assert.assertTrue(colorMap.containsValue(Color.BLACK));
		Assert.assertEquals(Color.BLACK, colorMap.get("Black"));

	}
	
	@Test
	public void test_Contains13() {
		
		//Arrange
		Colorzzz color = new Colorzzz();
		HashMap<String, Color> colorMap = new HashMap<String, Color>();
		//Act

		colorMap = color.getColorMap();
		//Assert
		Assert.assertEquals(colorMap.size(), 13);
		Assert.assertEquals(Color.BLACK, colorMap.get("Black"));
		Assert.assertTrue(colorMap.containsKey("Red"));
		Assert.assertTrue(colorMap.containsKey("Green"));
		Assert.assertTrue(colorMap.containsKey("White"));
		Assert.assertTrue(colorMap.containsKey("Yellow"));
		Assert.assertTrue(colorMap.containsKey("Gray"));
		

	}

}
