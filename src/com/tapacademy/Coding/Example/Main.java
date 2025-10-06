package com.tapacademy.Coding.Example;

import java.util.Scanner;

public class Main {
	
	public static void printFirstNEven(int n) {
		
		for(int i = 0; i <= n; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	
	
	
	
	
	public static int countDigit(int num) {
		int count = 0;
		while(num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 public static void checkPrime(int n) {
	        if (n <= 1) {
	            System.out.println("Not Prime");
	            return;
	        }

	        int count = 0;
	        for (int i = 1; i <= n; i++) {
	            if (n % i == 0) {
	                count++;
	            }
	        }

	        if (count == 2) {
	            System.out.println("Prime");
	        } else {
	            System.out.println("Not Prime");
	        }
	    }

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        checkPrime(n);
	    }
	}