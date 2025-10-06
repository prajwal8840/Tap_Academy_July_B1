package WordManipulation;

import java.util.Scanner;

public class Main {
	
	public static String smallestWord(String s){
		String[] words = s.split(" ");
		String smallest = words[0];
		
		for (int i = 0; i < words.length; i++) {
			if(words[i].length() < smallest.length()) {
				smallest = words[i];
			}
		}
		return smallest;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String largestWord(String s){
		String[] words = s.split(" ");
		String largest = words[0];
		
		for (int i = 0; i < words.length; i++) {
			if(words[i].length() > largest.length()) {
				largest = words[i];
			}
		}
		return largest;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static String getWordWithCount(String str) {
        String[] words = str.split(" ");  // split into words
        String result = "";

        for (int i = 0; i < words.length; i++) {   // ✅ use .length (not .length())
            result = result + words[i] + words[i].length();
            if (i < words.length - 1) {
                result = result + " ";
            }
        }

        return result;
    }
	
	
	
	
	
	public static String reverseEachWord(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String reversedWord = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversedWord = reversedWord + words[i].charAt(j);
            }
            result = result + reversedWord;
            if (i < words.length - 1) {
                result = result + " ";
            }
        }

        return result;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String result = reverseEachWord(input);
        System.out.println(result);
    }
}




















