package com.tapacademy.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

// Lexicographical Deduplication

public class Main2 {

    public static String removeDuplicate(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();  
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        ArrayList<Character> list = new ArrayList<>(set);
        Collections.sort(list);

        String t = "";
        for (char ch : list) {
            t = t + ch + " ";
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(removeDuplicate(input));  
        scan.close();
    }
}
