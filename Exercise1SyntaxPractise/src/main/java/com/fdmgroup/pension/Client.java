package com.fdmgroup.pension;

public class Client {

	public static void main(String[] args) {

		Person person1 = new Person();

		person1.setFirstname("John");
		person1.setLastname("Smith");
		person1.setDateOfBirth("28/06/1993");

		// Person person1={"","",""}
		
		Person person2 = new Person();

		person2.setFirstname("Jane");
		person2.setLastname("Doe");
		person2.setDateOfBirth("05/01/1950");

		Person person3 = new Person();

		person3.setFirstname("Fred");
		person3.setLastname("Bloggs");
		person3.setDateOfBirth("12/12/1949");

		Person[] pp = new Person[3];
		pp[0] = person1;
		pp[1] = person2;
		pp[2] = person3;

		PensionController pC = new PensionController();

		pC.handlePensions(pp);

		//System.out.println(pp[0].getFirstname());

		//System.out.println(person1.getDateOfBirth());

	}
}