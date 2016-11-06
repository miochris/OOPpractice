package com.fdmgroup.collections;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordInSentence {
	public static String[] wordArray = new String[100];
	Map<String, Integer> occurrences = new HashMap<String, Integer>();
	
public Map<String,Integer> getOccurrences (){
	return occurrences;
}
	
	
	public  void countDuplicate(String s) {
		s=s.toUpperCase();

		wordArray = s.split("\\s+");

		for (String word : wordArray) {

			Integer count = occurrences.get(word);
			if (count == null) {
				count = 0;
			}
			
			occurrences.put(word, count+1);
			
		}
		
		
		printOutHashMap();

	}

	private void printOutHashMap() {
		for (String word : occurrences.keySet()){
			if(occurrences.get(word)>1){
				System.out.println(word + "  " + occurrences.get(word));
			}
		}
//		System.out.println(occurrences.get("DOG"));
		
	} 
	

}
