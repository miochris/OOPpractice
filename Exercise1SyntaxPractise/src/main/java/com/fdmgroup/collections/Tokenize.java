package com.fdmgroup.collections;

import java.util.Set;
import java.util.TreeSet;

public class Tokenize {
	
	
	
	
	private Set<String> tokens = new TreeSet<String>(new CaseInsensitiveStringComparator());

	public void tokenTheSpring(String string, String denominator) {
		String[] splitString = string.split(denominator);
		for (int i = 0; i < splitString.length; i++) {

			tokens.add(splitString[i]);
			// System.out.println(tokens.toString());
		}

	}

	public Set<String> getTokens() {
		return tokens;
	}

}
