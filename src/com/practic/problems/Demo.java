package com.practic.problems;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
	// reverse String
	public static void reverseString(String s){
		String t = "";
		for(int i = s.length() - 1; i >= 0; i--) {
			t = t + s.charAt(i);
		}
		System.out.println(t); 
	}
	
	
	
	
	
	
	
	
	
	
	// find missing elemrnts
	
	
	public static int findMissingElement(int[] ar){
		int n = ar.length + 1;
		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;

		for (int i = 0; i < ar.length; i++) {
			actualSum = actualSum + ar[i];
		}
		return expectedSum - actualSum;
	}
	
	
	
	
	
	
	
	
	
//	second Largest Number
	
	public static void secondLargest(int[] ar){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for(int i = 0; i < ar.length;i++){
            if(ar[i] > max1){
                max2 = max1;
                max1 = ar[i];
            }else if(ar[i] > max2 && ar[i] != max1){
                max2 = ar[i];
            }
        }
        System.out.println(max2);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	print repeating element
	
	public static void printReaeating(int[] ar){
		boolean found = false;
		
		for (int i = 1; i < ar.length; i++) {
			if(ar[i] == ar[i-1] && (i == 1 || ar[i] != ar[i-2])) {
				System.out.print(ar[i] + " ");
				found = true;
			}
		}
		if(!found) {
			System.out.println("-1");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Array Element Occurrence
	
	public static void printArrayOccurreance(int[] ar){
		Map<Integer,Integer> map = new LinkedHashMap<>();
		
		for(int num : ar) {
			map.put(num,map.getOrDefault(num,0) + 1);
		}
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Print All pairs
	
	public static void printPairsAll(int[] ar){
        for(int i = 0;i < ar.length-1;i++){
            for(int j = i+1;j < ar.length;j++){
                System.out.println(ar[i] + " " + ar[j]);
            }
        }
    }
	
	
	
	
	
	
	
	
	
	
	
	
//	Pairs with Sum K

	
	public static void printPairsSum(int[] ar,int k){
        for(int i = 0;i < ar.length-1;i++){
            for(int j = i+1;j < ar.length;j++){
                if(ar[i] + ar[j] == k)
                System.out.println(ar[i] + " " + ar[j]);
            }
        }
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	All possible Subarray
	
	public static void printAllSubarrays(int[] ar) {
		for(int size = 1; size <= ar.length; size++) {
			for (int i = 0; i <= ar.length - size; i++) {
				for(int j = i; j < i + size;j++) {
					System.out.print(ar[j] + " ");
				}
				System.out.println();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	All Subarrays of Size K
	
	public static void printSubarraysOfSize(int[] ar,int size) {
		for (int i = 0; i <= ar.length-size; i++) {
			for(int j = i; j < i + size;j++) {
				System.out.print(ar[j] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Sum of Subarrays of Size K
	
	
	public static void sumOfSubarrays(int[] ar,int size) {
		for (int i = 0; i <= ar.length-size; i++) {
			int sum = 0;
			for(int j = i; j < i+size;j++) {
				sum = sum + ar[j];
			}
			System.out.print(sum + " ");
		}
	}
	
	
	
	
	
	
	
	
//	Rearrange Array with -1 at the Beginning

	 public static void rearrangeArray(int[] ar) {
	        int n = ar.length;
	        int[] result = new int[n];
	        int index = 0;
	        
	        // Step 1: Add all -1 first
	        for (int i = 0; i < n; i++) {
	            if (ar[i] == -1) {
	                result[index++] = -1;
	            }
	        }

	        // Step 2: Add remaining elements in original order
	        for (int i = 0; i < n; i++) {
	            if (ar[i] != -1) {
	                result[index++] = ar[i];
	            }
	        }

	        // Print the rearranged array
	        for (int i = 0; i < n; i++) {
	            System.out.print(result[i] + " ");
	        }
	    }
	
	
//	or -1 at beginning
	 
	 public static void rearrangeArrays(int[] ar) {
	        // Step 1: print all -1 first
	        for (int i = 0; i < ar.length; i++) {
	            if (ar[i] == -1) {
	                System.out.print(ar[i] + " ");
	            }
	        }
	        
	        // Step 2: print remaining elements
	        for (int i = 0; i < ar.length; i++) {
	            if (ar[i] != -1) {
	                System.out.print(ar[i] + " ");
	            }
	        }
	    }
	
	
	
	
	
	
	
	 public static void rearrangeArrayFirstZero(int[] ar){
	        int n = ar.length;
	        for (int i = 0; i < n; i++){
	            if(ar[i] == 0){
	                System.out.print(ar[i] + " ");
	            }
	        }
	        for(int i = 0;i < n ; i++){
	            if(ar[i] != 0){
	                System.out.print(ar[i] + " ");
	            }
	        }
	    }
	
	
	
	
	
	
	
	
	 
//	 rearrange array -1
	 
	 public static void rearrangeArray1(int[] ar){
	        int i = ar.length-1,j = ar.length-1;

	        while(i >= 0){
	            if(ar[i] == -1){
	                i--;
	            }
	            else{
	                ar[j] = ar[i];
	                j--;
	                i--;
	            }
	        }
	        while(j >= 0){
	            ar[j] = -1;
	            j--;
	        }
	    }
	 
	 
	 
	 
	 
	 
	 
	 
//	 rearrange array ending with zero
	 
	 public static void rearrangeArrayEndsWith0(int[] ar) {
		int i = 0,j = 0;
		
		while(i < ar.length) {
			if(ar[i] == 0) {
				i++;
			}
			else {
				ar[j] = ar[i];
				i++;
				j++;
			}
		}
		while(j < ar.length) {
			ar[j] = 0;
			j++;
		}
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		rearrangeArrayEndsWith0(ar);
		for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
	}

}
