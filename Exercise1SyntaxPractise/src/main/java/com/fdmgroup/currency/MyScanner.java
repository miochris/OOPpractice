package com.fdmgroup.currency;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class MyScanner {

	private Map currencyMap = new HashMap();
	private String currencyHave = null;
	private String currencyWant = null;
	private Double moneyGot = null;

	Scanner sc = new Scanner(System.in);

	public String fisrtQuestion() {

		System.out.println("Please choose the currency you have from: " + currencyMap.keySet());

		return currencyHave = sc.next().toUpperCase();

	}

	public void secondQuestion() {
		System.out.println("Please choose the currency you want from: " + currencyMap.keySet());
		currencyWant = sc.next().toUpperCase();
	}

	public void thirdQuestion() {

		System.out.println("How much " + currencyHave + " you got?");
		moneyGot = sc.nextDouble();
	}

	public void finalResult(double result) {
		System.out.println("Here's your " + result + " " + currencyWant + ".");

	}

	public void readMap() {

		ReadXML rXML = new ReadXML();
		rXML.readXML();
		currencyMap = rXML.currencyMap;

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

	public Double getMoneyGot() {
		return moneyGot;
	}

	public void setMoneyGot(Double moneyGot) {
		this.moneyGot = moneyGot;
	}

}
