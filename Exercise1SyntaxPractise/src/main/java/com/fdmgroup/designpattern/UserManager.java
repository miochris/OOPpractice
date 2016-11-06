package com.fdmgroup.designpattern;

public class UserManager {
	
	public static void main(String[] args) {
		IStorage iStoreArrayList = new UserArrayListStorage ();
		StorageFactory factory = new StorageFactory();
		iStoreArrayList= factory.getStorage();
		
		// instantiate an user
		User u1 = new User();
		u1.setUsername("Fina");
		u1.setPassword(123);
		u1.setId(1000);
		u1.setEmail("fina@google.com");
		
		User u2 = new User();
		u2.setUsername("Nina");
		u2.setPassword(456);
		u2.setId(1001);
		u2.setEmail("nina@google.com");
		
		
		
		iStoreArrayList.create(u1);
		iStoreArrayList.create(u2);
		
		System.out.println(iStoreArrayList.readAll().size());
		System.out.println(iStoreArrayList.readAll());
		
		
		iStoreArrayList.delete(1000);
		System.out.println(iStoreArrayList.readAll().size());
		System.out.println(iStoreArrayList.readAll());
		
		
	}

}
