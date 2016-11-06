package com.fdmgroup.pension;

public class PersonLogic {

	public boolean isPensionable(Person pPensionable){
		
		//String[] parts = (pPensionable.getDateOfBirth()).split("/");
		
		
		
		String[] parts = pPensionable.getDateOfBirth().split("/");
		String part3 = parts[2];
		int year = Integer.parseInt(part3);
		
		
	//	String[] parts = .split("/");
		
		boolean result;
		result = (2014-year) >= 65 ? true: false;
			
	    return result;
	
}
	
	
}