package com.fdmgroup.currency;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class CalculatorTest {

	@Test
	public void testReadXMLCallrsMethodreadXML() {
		// Arrange
		ReadXML mockReadXML = mock(ReadXML.class);
		Calculator cal = new Calculator(mockReadXML);
		// mockReadXML = cal.rXML;
		// Act
		cal.readMap(mockReadXML);
		// Assert
		verify(mockReadXML, times(1)).readXML();

	}

	@Test
	public void testCalculator10USD_to_JPY() {
		// Arrange
		ReadXML mockReadXML = mock(ReadXML.class);

		String currencyHave = "USD";
		String currencyWant = "JPY";
		Double moneyGot = 10d;
		Map mockMap = mock(Map.class);
		Calculator cal = new Calculator(currencyHave, currencyWant, moneyGot, mockMap, mockReadXML);

		when(mockMap.get(currencyHave)).thenReturn((Double) 1.1170d);
		when(mockMap.get(currencyWant)).thenReturn((Double) 114.24d);

		double result = cal.calculateExchange(currencyHave, currencyWant, moneyGot);

		System.out.println(result);
		
		Assert.assertEquals(1022.73d, result,0.01);

	}
	
	
	@Test
	public void testCalculatorInvalidCurrencyUUU_to_JPY() {
		// Arrange
		ReadXML mockReadXML = mock(ReadXML.class);

		String currencyHave = "UUU";
		String currencyWant = "JPY";
		Double moneyGot = 10d;
		Map mockMap = mock(Map.class);
		Calculator cal = new Calculator(currencyHave, currencyWant, moneyGot, mockMap, mockReadXML);

		when(mockMap.get(currencyHave)).thenReturn((Double) 1.1170d);
		when(mockMap.get(currencyWant)).thenReturn((Double) 114.24d);

		double result = cal.calculateExchange(currencyHave, currencyWant, moneyGot);

		System.out.println(result);
		
		Assert.assertEquals(1022.73d, result,0.01);

	}

}
