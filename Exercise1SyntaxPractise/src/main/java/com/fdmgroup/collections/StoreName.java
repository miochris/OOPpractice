package com.fdmgroup.collections;

import java.util.HashSet;
import java.util.Set;

public class StoreName {
	private Set<String> nameList = new HashSet<String>();

	public void readFirstName(String firstName) {
		nameList.add(firstName);

	}

	public Set<String> getNameList() {
		return nameList;
	}

}
