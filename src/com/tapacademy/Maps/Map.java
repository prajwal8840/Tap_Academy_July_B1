package com.tapacademy.Maps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("India", 5000);
		map.put("Italy", 3000);
		map.put("China", 4000);
		
		Set<Entry<String,Integer>> entries = map.entrySet();
		
		for(Entry<String,Integer > entry: entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
