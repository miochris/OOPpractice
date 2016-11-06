package com.fdmgroup.pension;

public class PensionController {
	
	
	public void handlePensions(Person[] people){
		
		
		
		for (int i=0; i<3; i++){
		PersonLogic pLogic = new PersonLogic();
		
		System.out.println("Person " + i + " is pensionable? " + pLogic.isPensionable(people[i]));
		
		
		// for print out eligible
		
		View nc = new View();
		
		nc.printEligible(people[i]);
		nc.printIneligible(people[i]);


		
		}
		
	}
}
