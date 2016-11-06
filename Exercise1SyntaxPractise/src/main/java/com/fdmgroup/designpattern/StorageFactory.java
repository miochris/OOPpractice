package com.fdmgroup.designpattern;

public class StorageFactory {
	
	IStorage iStore = new UserArrayListStorage ();
	
	public IStorage getStorage(){
		
		return iStore;
	}

}
