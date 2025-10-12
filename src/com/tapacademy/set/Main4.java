package com.tapacademy.set;

import java.util.HashMap;
import java.util.Scanner;

	//Pair Formation Count

public class Main4
{
    public static int countPairs(int[] ar){
        HashMap<Integer,Integer> map = new HashMap<>();
        int pairs = 0;
        for(int num : ar){
            map.put(num, map.getOrDefault(num,0) +1);
        }
        for(int freq : map.values()){
            pairs += freq / 2;
        }
        return pairs;
    }
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int[] ar = new int[n];
	    
	    for(int i = 0; i < n; i++){
	        ar[i]=scan.nextInt();
	    }
	    System.out.println(countPairs(ar));
	}
}