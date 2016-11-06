package com.fdmgroup.pension;

public class View {

	public void printEligible(Person person){


//ere

		String[] yparts = person.getDateOfBirth().split("/");
		String ypart3 = yparts[2];
		int yearB = Integer.parseInt(ypart3);


		if ((2014-yearB) >= 65) { System.out.println(person.fullName() + " eligible" ); 

		}


	}

	public void printIneligible(Person person){ 

		String[] yBparts = person.getDateOfBirth().split("/");
		String yBpart3 = yBparts[2];
		int yearBB = Integer.parseInt(yBpart3);


		if ((2014-yearBB) < 65) { System.out.println(person.fullName() + " illeligible" ); 

		}


	}

}
