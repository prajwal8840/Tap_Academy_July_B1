package com.tapacademy.set;

import java.util.Scanner;
import java.util.TreeSet;

//URL Lexicographical Sorter

public class Main3 {
	
	public static void removeURL(String s) {
		TreeSet<String> set = new TreeSet<String>();
		String[] ar = s.split(",");
		
		for (int i = 0; i < ar.length; i++) {
			set.add(ar[i]);
		}
		
		for(String x : set) {
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		removeURL(input);
		scan.close();
	}

}




//	https://openai.com,https://google.com,https://openai.com,https://github.com






