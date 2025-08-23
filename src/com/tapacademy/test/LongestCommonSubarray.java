package com.tapacademy.test;

import java.util.*;

	public class LongestCommonSubarray {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input first array
	        int n = sc.nextInt();
	        int[] arr1 = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr1[i] = sc.nextInt();
	        }

	        // Input second array
	        int m = sc.nextInt();
	        int[] arr2 = new int[m];
	        for (int i = 0; i < m; i++) {
	            arr2[i] = sc.nextInt();
	        }

	        // Solve using DP
	        int result = findLength(arr1, arr2);
	        System.out.println(result);
	    }

	    public static int findLength(int[] A, int[] B) {
	        int n = A.length, m = B.length;
	        int[][] dp = new int[n + 1][m + 1];
	        int maxLen = 0;

	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= m; j++) {
	                if (A[i - 1] == B[j - 1]) {
	                    dp[i][j] = dp[i - 1][j - 1] + 1;
	                    maxLen = Math.max(maxLen, dp[i][j]);
	                }
	            }
	        }
	        return maxLen;
	    }
	}
