package com.fdmgroup.generics.catalogue;

public class Loan implements Item{
	private int itemId;
	
	
	
	public Loan(){
		itemId= hashCode();
	}
	
	public int getItemId() {
		return itemId;
	}

	@Override
	public String toString() {
		return "Loan [itemId=" + itemId + "]";
	}


}
