package com.charlie.test;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {
	
	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("apple", "A forbidden fruit");
		dictionary.put("banana", "A yellow fruit that can be peeled");
		dictionary.put("cantaloupe", "A melon fruit that has an orange flesh");
		System.out.println(dictionary);
		
		String key = "apple";
		String value = dictionary.get(key);
		System.out.println("The value for the key: " + key + " is " + value);
		
		TreeMap<String, String> sortedDictionary = new TreeMap<>();
		sortedDictionary.putAll(dictionary);
		System.out.println(sortedDictionary);
		
		sortedDictionary.put("beets", "An actual vegetable");
		System.out.println(sortedDictionary);
		
		sortedDictionary.put("beets", "A better explanation");
		System.out.println(sortedDictionary);
		
		Set<String> keys = sortedDictionary.keySet();
		
		for(String s: keys) {
			System.out.println("key: " + s);
		}
	}

}
