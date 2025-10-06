package CollectionsFramework;

import java.util.*;

public class Main {
	
	
	
	public static void removeDuplicate(String s){
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i = 0; i < s.length(); i++) 
		{
			set.add(s.charAt(i));
		}
		
		String t = "";
		for(char x : set) 
		{
			t = t + x;
		}
		System.out.println(t);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Lexicographical Deduplication
	public static String removeDuplicatesAndSort(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        // Using charAt instead of toCharArray
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        ArrayList<Character> list = new ArrayList<>(set);
        Collections.sort(list);

        String t = "";
        for (char c : list) {
            t += c + " ";
        }

        return t;
    }

	
	
	
	
	
	
	
	public static void removeUrl(String s) {
		String[] ar = s.split(",");
		
		  TreeSet<String> set = new TreeSet<String>();
		  for(int i = 0; i < ar.length; i++) {
			  set.add(ar[i]);
		  }
		  for(String x : set) {
			  System.out.println(x);
		  }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Unique Integer Filter
	public static void removeDuplicates(int[] arr) {
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		for (int x : set) {
			System.out.print(x + " ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Unique Names Collector
	public static void removeDuplicates(String[] arr) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (String name : set) {
            System.out.println(name);
        }
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] ar = new String[n];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextLine().trim();
        }

        removeDuplicates(ar);
    }
}
