package com.fdmgroup.collections;

import java.lang.reflect.Array;

public class CounterLetter {
	public static char[] letterArray = new char[100];
	private int numTimes = 0;

	public int count(String s, char c) {

		letterArray = s.toCharArray();

		for (int i = 0; i < letterArray.length; i++) {
			if (c == letterArray[i]) {
				numTimes = numTimes + 1;

			}
		}
		return numTimes;

	}

}
