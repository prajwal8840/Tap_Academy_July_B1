package com.tapacademy.day6.Patterns;

public class Patterns {

	public static void main(String[] args) {
		
		   
		        int n = 5;  
		        int number = 1;

		        for (int i = 1; i <= n; i++) {
		            // Print leading spaces
		            for (int j = 1; j <= n - i; j++) {
		                System.out.print("   "); // 3 spaces
		            }

		            
		            for (int j = 1; j <= i; j++) {
		                System.out.printf("%3d",number); 
		                number++;
		            }

		            System.out.println();
		        }
		    }
		}
