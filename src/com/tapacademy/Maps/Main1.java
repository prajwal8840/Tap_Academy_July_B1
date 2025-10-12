package com.tapacademy.Maps;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

//	Char Occurrence Counter


public class Main1 {

	
	public static void countCharacters(String s){
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			if(map.containsKey(ch)) 
			{
				int c = map.get(ch);
				map.put(ch, c+1);
			}
			else
			{
				map.put(ch,1);
			}
		}
		
		Set<Entry<Character,Integer>> entries = map.entrySet();
		String t = "";
		
		for(Entry<Character,Integer> entry : entries)
		{
//			System.out.println(entry.getKey() + "" + entry.getValue());
//			System.out.println(entry.getKey() + ":" + entry.getValue());
			
			t = t + entry.getKey() + entry.getValue();
		}
		System.out.println(t);
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		countCharacters(s);
	}

}
