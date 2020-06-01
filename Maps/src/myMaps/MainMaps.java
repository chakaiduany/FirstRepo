package myMaps;

import java.util.HashMap;
import java.util.Map;

public class MainMaps {

	public static void main(String[] args) {
		// Maps consist of key value pairs
		// think of a dictionary (key = word, value = definition)
		// you cannot have duplicate keys, but you can have duplicate definitions
		
		HashMap<String, String> dictionary = new HashMap<String, String>();
		
		dictionary.put("Outgoing", "extroverted in nature");
		dictionary.put("Intelligent", "sharp witted");
		dictionary.put("Shy", "introverted in nature");
		dictionary.put("Timid", "introverted in nature");
		
		System.out.println(dictionary);
		//HashMap has no particular order
		//LinkedMap will maintain order (of insertion)
		//TreeMap will sort KEYS by natural order
		
		//how to iterate through a Map (use an enhanced for loop)
		for(String word : dictionary.keySet()) {
			System.out.println("The key is: " + word);
			System.out.println(word.hashCode());
		}
		
		for(String definition : dictionary.values()) {
			System.out.println("The values is: " + definition);
			
		}
		
		for(Map.Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue() + "\n"); 
		}
				

	}

}
