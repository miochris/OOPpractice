package com.fdmgroup.calculator;
import org.junit.Test;


import static org.junit.Assert.*;

import org.junit.Assert;

public class CalculatorTest {
	
	
	@Test
	public void testEvaluateReturnsDoubleFourWhenStringFourIsPassedIn(){
		
		Calculator cal =new Calculator();
		Assert.assertEquals(4.0, cal.stringToDouble("4"),0); 
		
	}

	

}
