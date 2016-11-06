package com.fdmgroup.currency;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {

		ReadXML rXML = new ReadXML();
		
		String currencyHave = null;
		String currencyWant = null;
		Double moneyGot = null;

		Input in = new Input();
		
		in.doAllInput();
		
		currencyHave = in.getCurrencyHave();
		currencyWant=in.getCurrencyWant();
		moneyGot=in.getMoneyGot();
		
		Calculator cal=new Calculator();
		cal.readMap(rXML);
		double result=cal.calculateExchange(currencyHave, currencyWant, moneyGot);
		in.finalResult(result);
		

	}

}
