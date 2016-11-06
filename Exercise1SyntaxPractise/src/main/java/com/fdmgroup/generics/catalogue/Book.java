package com.fdmgroup.generics.catalogue;

public class Book implements Item{
	private  int itemId;
	
	
	
	public Book(){
		itemId= hashCode();
	}
	
	public int getItemId() {
		return itemId;
	}

	@Override
	public String toString() {
		return "Book [itemId=" + itemId + "]";
	}



}
