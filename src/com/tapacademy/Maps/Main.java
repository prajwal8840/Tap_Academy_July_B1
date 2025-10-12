package com.tapacademy.Maps;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

//	Char Occurrence Counter

//public class Main {
//
//    public static void printCharOccurrence(String s) {
//        s = s.toLowerCase();
//
//        Map<Character, Integer> map = new LinkedHashMap<>();
//
//        for (char ch : s.toCharArray()) {
//            if (ch == ' ') continue; // skip spaces
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        printCharOccurrence(s);
//        scanner.close();
//    }
//}





//	Char Occurrence Counter


public class Main {


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
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	count-words occur more then 3 times
	
		public static void countWords(String s){
			String[] ar = s.split(" ");
			
			LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
			
			for (int i = 0; i < ar.length; i++) {
				if(map.containsKey(ar[i])) {
					int c = map.get(ar[i]);
					map.put(ar[i], c+1);
				}
				else {
					map.put(ar[i], 1);
				}
			}
			Set<Entry<String, Integer>> entries = map.entrySet();
			for(Entry<String, Integer> e : entries) {
				if(e.getValue() > 3) {
					System.out.println(e.getKey());
				}
			}
		}
	
	
	


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		countWords(s);
	}

}

//	Input : fear leads to anger anger leads to hatred hatred leads to conflict  conflict leads to suffering

//	Output : leads
//			 to









