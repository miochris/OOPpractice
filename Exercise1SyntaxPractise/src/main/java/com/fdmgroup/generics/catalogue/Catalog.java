package com.fdmgroup.generics.catalogue;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author qiang.liu
 *
 * @param <T>
 */
public class Catalog<T extends Item> {

	// private String itemId;
	// private String name;

	private List<T> allItems = new ArrayList<T>();

	public List<T> getAllItems() {
		return allItems;
	}
	/**
	 * 
	 * @param item
	 */

	// public int getItemId(){
	//
	//
	// return 0;
	// }

	public void addItem(T item) {

		allItems.add(item);
	}

	public T searchItem(int itemId) {

		for (T searchedItem : allItems) {
			if (searchedItem.getItemId() == itemId){
				return searchedItem;
			}
		}
		return null;
	}

}
