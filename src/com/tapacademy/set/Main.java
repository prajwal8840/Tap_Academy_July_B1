package com.tapacademy.set;

import java.util.LinkedHashSet;
import java.util.Scanner;

//removeDuplicate Characters

public class Main {
	
	public static void removeDuplicate(String s) {
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		String t = "";
		for(char x : set) {
			t = t + x;
		}
		System.out.println(t);
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		removeDuplicate(input);
	}

}
