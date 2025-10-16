package com.tapacademy.set;

import java.util.*;

public class RemoveDup {

    // Method to print unique elements using LinkedHashSet
    public static void printUnique(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        // Add elements to the set
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // Print unique elements in order
        for (int num : set) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the method
        printUnique(arr);

        sc.close();
    }
}





//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        int n = sc.nextInt();
//        LinkedHashSet<Integer> set = new LinkedHashSet<>();
//        
//        // Read array elements and add to set
//        for (int i = 0; i < n; i++) {
//            set.add(sc.nextInt());
//        }
//
//        // Print unique elements in order
//        for (int num : set) {
//            System.out.print(num + " ");
//        }
//
//        sc.close();
//    }
//}















