package com.tapacademy.Examples;
import java.util.Scanner;

public class main{
public static String reversedString(String s) {
	String reversed = "";
	for(int i = s.length()-1 ; i >= 0 ; i--) {
		reversed += s.charAt(i);
	}
	return reversed;
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(reversedString(input));
		
	}

}


//import java.util.Scanner;
//
//public class ReverseString {
//    
//    // Method to reverse a string
//    public static String reverseString(String input) {
//        String reversed = "";
//        for (int i = input.length() - 1; i >= 0; i--) {
//            reversed += input.charAt(i);  // Append characters in reverse order
//        }
//        return reversed;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        // Read input
//        String input = sc.nextLine();
//        
//        // Call the method and print the reversed string
//        String result = reverseString(input);
//        System.out.println(result);
//        
//        sc.close();
//    }
//}
