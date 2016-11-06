package com.fdmgroup.currency;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

public class Calculator {
	private static final Logger Log = Logger.getLogger(Input.class);

	public Calculator(String currencyHave, String currencyWant, Double moneyGot, Map currencyMap, ReadXML rXML) {
		this.currencyHave = currencyHave;
		this.currencyWant = currencyWant;
		this.moneyGot = moneyGot;
		this.rXML = rXML;
		this.currencyMap = currencyMap;

	}
	
	public Calculator(String currencyHave, String currencyWant, Double moneyGot, Map currencyMap) {
		this.currencyHave = currencyHave;
		this.currencyWant = currencyWant;
		this.moneyGot = moneyGot;
		this.currencyMap = currencyMap;

	}
	
	
	
	

	Input input = new Input();
	Map currencyMap = new HashMap();
	String currencyHave = null;
	String currencyWant = null;
	Double moneyGot = null;
	Double result = null;

	ReadXML rXML = new ReadXML();

	public Calculator() {
	}

	public Calculator(ReadXML rXML) {
		this.rXML = rXML;

	}

	public Map readMap(ReadXML rXML) {

		rXML.readXML();
		return currencyMap = rXML.currencyMap;

	}

	public double calculateExchange(String currencyHave, String currencyWant, Double moneyGot) {

		Double possesedCurrenceRate = (Double) (currencyMap.get(currencyHave));
		Log.info("Possesed Currency " + currencyHave + "'s Rate to Euro: " + possesedCurrenceRate);
		Double destinationCurrencyRate = (Double) (currencyMap.get(currencyWant));
		Log.info("Destination Currency " + currencyWant + "'s Rate to Euro: " + destinationCurrencyRate);
		double exchangeRate = destinationCurrencyRate / possesedCurrenceRate;
		Log.info("Exchange rate of " + currencyWant + " to " + currencyHave + " is " + exchangeRate);
		double result = (int) (exchangeRate * moneyGot * 100);
		result = result / 100;

		return result;

	}

	public Map getCurrencyMap() {
		return currencyMap;
	}

	public void setCurrencyMap(Map currencyMap) {
		this.currencyMap = currencyMap;
	}

	public String getCurrencyHave() {
		return currencyHave;
	}

	public void setCurrencyHave(String currencyHave) {
		this.currencyHave = currencyHave;
	}

	public String getCurrencyWant() {
		return currencyWant;
	}

	public void setCurrencyWant(String currencyWant) {
		this.currencyWant = currencyWant;
	}

	public Double getResultnull() {
		return result;
	}

	public void setResultnull(Double resultnull) {
		this.result = resultnull;
	}

}
