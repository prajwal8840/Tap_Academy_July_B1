package com.tapacademy.strings;

import java.util.*;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	
	public static String trim(String s){
		int si = 0, ei =0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' ') {
				si = i;
				break;
			}
		}
		
		for(int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i) != ' ') {
				ei = i;
				break;
			}
		}
		String t = "";
		for(int i = si; i <= ei ; i++) {
			t = t + s.charAt(i);
		}
		return t;
	}
	
	
	
	
	
	
	
	
	
	public static String trim1(String s){
		int si = 0, ei =0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' ') {
				si = i;
				break;
			}
		}
		
		for(int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i) != ' ') {
				ei = i;
				break;
			}
		}
		String t = "";
		for(int i = si; i <= ei ; i++) {
			if(s.charAt(i) != ' ' || (s.charAt(i) == ' ' && s.charAt(i+1) != ' ')) {
				
				t = t + s.charAt(i);
			}
		}
		return t;
	}
	
	
	public static String printPattern(String s){
		String t ="";
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a') {
				t = t + '*' + s.charAt(i);
			}else {
				t = t + s.charAt(i);
			}
		}
		return t;
	}
	
	
	
	public static String removeVowels(String s){
		String t = "";
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
				t = t + ch;
			}
		} 
		return t;
	}
	
	
	public static String alternateSwapCase(String s) {
		String t = "";
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				t = t + Character.toLowerCase(ch);
			}else if (Character.isLowerCase(ch)) {
				t = t + Character.toUpperCase(ch);
			}else {
				t = t + ch;
			}
		}
		return t;
	}
	
	
	
	
	
	public static String convertToUpper(String s) {
		return s.toUpperCase();
		//return s.toLowerCase();
	}
	
	
	
	
	public static String insertStarBeforeDigits(String s) {
		String t = "";
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(Character.isDigit(ch)) {
				t = t + '*' + ch;
			}else {
				t = t + ch;
			}
		}
		return t;
	}
	
	
	public static String removeConsonants(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

           
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    result += ch;
                }
            } else {
               
                result += ch;
            }
        }
        return result;
    }
	
	
	
	
	
	public static String removeAlbhanumeric(String s){
		String t = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || ch >= '0' && ch <= '9')){
				t = t + ch;
			}
		}
		return t;
	}
	
	
	
	
	
	
	public static String replaceUppercase(String s) {
		String t = "";
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z') {
				t = t + '#';
			}else {
				t = t + ch;
			}
		}
		return t;
	}
	
	
	

	
	
	
	public static String sumOfDigitConcat(String s) {
		String t = "";
		int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch >= '0' && ch <= '9') {
				sum = sum + ch - '0';
			}else {
				t = t + ch;
			}
		}
		return t;
	}
	
	
	
	
	public static String sortString(String s) {
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}
	
	
	
	
	
	
	
	 public static String removeDuplicates(String s) {
	        String result = "";

	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            
	            if (result.indexOf(ch) == -1) {
	                result += ch;
	            }
	        }
	        return result;
	    }
	
	
	 
	 
	 
	 
	 
	 public static String trimWithFor(String s) {
	        int start = 0, end = s.length() - 1;

	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) != ' ') {
	                start = i;
	                break;
	            }
	        }

	        for (int i = s.length() - 1; i >= 0; i--) {
	            if (s.charAt(i) != ' ') {
	                end = i;
	                break;
	            }
	        }

	        return s.substring(start, end + 1);
	    }

	 
	 
	 
	 
	 
	 
	 
	 
	 //substrings
	 
	 public static int countOccurrence(String s1, String s2) {
		int count = 0;
		int size = s2.length();
		
		for(int i = 0; i <= s1.length() - size; i++) {
			String t = "";
			for(int j = i; j < i + size; j++) {
				t = t + s1.charAt(j);
			}
			if(s2.equals(t)) {
				count++;
			}
		}
		return count;
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 //Palindromic Substrings of Length 4
	 public static boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		
		while(i < j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	 
	 
	 
	 public static void palindrome(String str) {
		 int size = 4;
		 for(int i = 0; i <= str.length() - size; i++) {
			 String t = "";
			 for(int j = i; j < i + size; j++) {
				 t = t + str.charAt(j);
			 }
			 if(isPalindrome(t)) {
				 System.out.println(t);
			 }
		 }
	 }
	 
	 
	 
	 
	 
	 //Check characters in a string
	 
	 public static boolean isSubsequence(String str1, String str2) {  
		 int i = 0, j = 0;

	        while (i < str1.length() && j < str2.length()) {  
	            if (str1.charAt(i) == str2.charAt(j)) {
	                j++; // move in str2
	            }
	            i++; // always move in str1
	        }

	        return (j == str2.length()); 
	    }
	 
	 
	 
//		public static void main(String[] args) {
//		
//		 Scanner sc = new Scanner(System.in);
//		 String str1 = sc.nextLine();
//	        String str2 = sc.nextLine();
//
//	        if (isSubsequence(str1, str2)) {
//	            System.out.println("Yes");
//	        } else {
//	            System.out.println("No");
//	        }
//	    }
//	}
	 
	 
	 
	 
	 
	 public static boolean isPalindrome1(String s) {
	        int i = 0;
	        int j = s.length() - 1;
	        
	        while (i < j) {
	            if (s.charAt(i) != s.charAt(j)) {
	                return false;
	            }
	            i++;
	            j--;
	        }
	        return true;
	    }
	    
	    public static void findPalindromicSubstrings(String str) {
	        for (int size = 1; size <= str.length(); size++) {
	            for (int i = 0; i <= str.length() - size; i++) {
	                String substring = str.substring(i, i + size);
	                
	                if (isPalindrome(substring)) {
	                    System.out.println(substring);
	                }
	            }
	        }
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    //Print Largest Palindromic Substring
	    public static boolean checkPalindrome(String s) {
	    	int i = 0;
	    	int j = s.length() - 1;
	    	
	    	while (i < j) {
	    		if (s.charAt(i) != s.charAt(j)) {
	    			return false;
	    		}
	    		i++;
	    		j--;
	    	}
	    	return true;
	    }
	    
	    public static void findLargestPalindromicSubstrings(String s) {
	    	for (int size = s.length(); size >= 1; size--) {
	    		for (int i = 0; i <= s.length() - size; i++) {
	    			String t = "";
	    			for(int j = i; j < i + size;j++) {
	    				t = t + s.charAt(j);
	    			}
	    			
	    			
	    			if (checkPalindrome(t)) {
	    				System.out.println(t);
	    				return;
	    			}
	    		}
	    	}
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    //Substring Frequency
	    
	    public static int countSubstringFrequency(String text, String sub) {
	        int count = 0;
	        int index = 0;

	        while ((index = text.indexOf(sub, index)) != -1) {
	            count++;
	            index = index + 1; 
	        }

	        return count;
	    }
	    
	    
	    
	    
	    
	    

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String S = sc.nextLine();   // main string
	        String SS = sc.nextLine();  // substring

	        int result = countSubstringFrequency(S, SS);

	        System.out.println(result);
	    }
	}
	    
	    
	    
	 




	









