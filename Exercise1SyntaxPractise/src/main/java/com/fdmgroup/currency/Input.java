package com.fdmgroup.currency;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Input {
	private static final Logger Log = Logger.getLogger(Input.class);

	private Map currencyMap = new HashMap();
	private String currencyHave = null;
	private String currencyWant = null;
	private Double moneyGot = null;

	Scanner sc = new Scanner(System.in);

	public void doAllInput() {
		readMap();
		fisrtQuestion();
		currencyHave = getCurrencyHave();
		secondQuestion();
		currencyWant = getCurrencyWant();
		thirdQuestion();
		moneyGot = getMoneyGot();
	}
	
	public double callCalculator(){
	Calculator nCal=new Calculator(currencyHave,currencyWant,moneyGot,currencyMap);
	return nCal.calculateExchange(currencyHave, currencyWant, moneyGot);
	
	
	}
	public void fisrtQuestion() {
//		PropertyConfigurator.configure(	"C:\\Users\\qiang.liu\\JavaEclipseWorkspace\\Exercise1SyntaxPractise\\src\\main\\resources\\log4j.properties");
		PropertyConfigurator.configure(	"/Users/Ludovic/Documents/workspace/maven.1471472035592/Exercise1SyntaxPractise/src/main/resources/log4j.properties");

		
		
		Log.info("Please choose the currency you have from: " + currencyMap.keySet());
		String s1 = sc.next().toUpperCase();

		if (currencyMap.keySet().contains(s1)) {
			currencyHave = s1;

		} else {
			fisrtQuestion();
		}

	}

	public void secondQuestion() {
		System.out.println("Please choose the currency you want from: " + currencyMap.keySet());
		String s2 = sc.next().toUpperCase();

		if (currencyMap.keySet().contains(s2)) {
			currencyWant = s2;

		} else {
			secondQuestion();
		}
	}

	public void thirdQuestion() {

		System.out.println("How much " + currencyHave + " you got?");
		moneyGot = sc.nextDouble();
	}

	public void finalResult(double result) {

		Log.info("Here's your " + result + " " + currencyWant + ".");

		// System.out.println("Here's your " + result + " " + currencyWant +
		// ".");
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
