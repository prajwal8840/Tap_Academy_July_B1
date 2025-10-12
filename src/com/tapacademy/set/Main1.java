package com.tapacademy.set;

import java.util.LinkedHashSet;
import java.util.Scanner;

// removeDuplicate Integers

public class Main1 {
	
	public static void removeDuplicate(int[] ar) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < ar.length; i++) {
			set.add(ar[i]);
		}
		
		for(int x : set) {
			System.out.print(x + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for(int i = 0;i<n;i++) {
			ar[i] = scan.nextInt();
		}
		removeDuplicate(ar);
	}

}
