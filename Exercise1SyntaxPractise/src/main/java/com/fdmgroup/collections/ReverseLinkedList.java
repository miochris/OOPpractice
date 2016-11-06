package com.fdmgroup.collections;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

	private List<String> oldList = new LinkedList<String>();
	private List<String> newList = new LinkedList<String>();

	public List<String> reverse(List<String> list) {

		for (int i = (list.size() - 1); i > -1; i--) {
			newList.add(list.get(i));
		}

		return newList;
	}

	public List<String> getOldList() {

		return oldList;
	}

	public List<String> getNewList() {

		return newList;
	}

	public void insert(int index, String s) {

		oldList.add(index, s);

	}

}
