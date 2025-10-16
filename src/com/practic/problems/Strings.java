package com.practic.problems;

import java.util.Scanner;

public class Strings {
	
//	words count
	
	public static int countWords(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
				count++;
			}
		}
		return count+1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	reverse String
	
	public static void reverseString(String s) {
		String t = "";
		for(int i = s.length()-1; i >= 0;i--) {
			t = t + s.charAt(i);
		}
		System.out.println(t);
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		reverseString(s);
		scan.close();
	}

}
