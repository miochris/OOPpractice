package com.fdmgroup.currency;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;



public class testReadXML {
	
	@Test
	public void testMapContainsUSD(){
		//Arrange
		ReadXML rXML = new ReadXML();
		Map<String , Double> curMap = new HashMap<String , Double>();
		//Act
		rXML.readXML();
		curMap=rXML.currencyMap;
		//Assert
		Assert.assertTrue(curMap.containsKey("USD"));
		
		}
	
	@Test
	public void testMapContainsCNY(){
		//Arrange
		ReadXML rXML = new ReadXML();
		Map<String , Double> curMap = new HashMap<String , Double>();
		//Act
		rXML.readXML();
		curMap=rXML.currencyMap;
		//Assert
		Assert.assertTrue(curMap.containsKey("CNY"));
		
		}
	
	@Test
	public void testMapSize32(){
		//Arrange
		ReadXML rXML = new ReadXML();
		Map<String , Double> curMap = new HashMap<String , Double>();
		//Act
		rXML.readXML();
		curMap=rXML.currencyMap;
		//Assert
		Assert.assertEquals(32, curMap.size());
		
		}

}
