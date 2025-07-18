package com.tapacademy.Examples;

import java.util.Scanner;

public class LargestNumberOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		
		// using ternary operator
		
		int largest = (n >= m) ? ((n >= l) ? n : l) : ((m >= l) ? m : l);

        System.out.println(largest);
    }
}
		
//		if(n>m) {
//			System.out.println(n);
//		} else if(m>l) {
//			System.out.println(m);
//		}else {
//			System.out.println(l);
//		}
//	}
//
//}
		
		
//		int largest;
//        if (n >= m && n >= l) {
//            largest = n;
//        } else if (m >= n && m >= l) {
//            largest = m;
//        } else {
//            largest = l;
//        }
//
//        System.out.println(largest);
//    }
//}
