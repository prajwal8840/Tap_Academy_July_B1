package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	
	
	public static int binarySearch(int[] a , int key){
		int low = 0, high = a.length - 1, mid = 0;
		
		while(low <= high) {
			mid = (low + high) / 2;
			if(key == a[mid]) {
				return mid;
			}else if(key < a[mid]) {
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Leetcode 34---Find First and Last Position of Element in Sorted Array
	
	public static int[] searchRange(int[] nums, int target) {
		
		int low = 0, high = nums.length - 1, mid = 0;
		int[] res = {-1,-1};
		
		while(low <= high) {
			mid = (low + high) / 2;
			
			if(target == nums[mid]) {
				res[0] = mid;
				high = mid - 1;
			}
			else if(nums[mid] < target) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		
		
		low = 0;
		high = nums.length-1;
		mid = 0;
				
				
				
		while(low <= high) {
			mid = (low + high) / 2;
			
			if(target == nums[mid]) {
				res[1] = mid;
				low = mid + 1;
			}
			else if(nums[mid] < target) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return res;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int rotatedSortedArray(int[] nums, int target) {
		
		int low = 0, high = nums.length - 1, mid = 0;
		
		while(low <= high) {
			mid = (low + high) / 2;
			
			if(target == nums[mid]) {
				return mid;
			}
			// left sorted portion
			else if(nums[low] <= nums[mid]) {
				if(target >= nums[low] && target < nums[mid]) {
					high = mid - 1;
				}
				else {
					low = mid + 1;
				}
			}
			// right sorted portion
			else {
				if(target > nums[mid] && target <= nums[high]) {
					low = mid + 1;
				}
			}
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	// count-digit
	public static int countDigits(int n) {
		int count = 0;
		
		while(n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//check the array is sorted!...
	static boolean isSorted(int[] ar) {
		for(int i = 1; i < ar.length; i++) {
			if(ar[i] < ar[i-1]) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	// reverse of an Array...
	public static void reverse(int[] ar) {
		int i = 0, j = ar.length-1;
		
		while(i < j) {
			int temp = ar[i];
			 ar[i] = ar[j];
			 ar[j] = temp;
			 i++;
			 j--;
		}
	}
	
	
	
	
	
//	public static void main(String[] args) {
//		int[] ar = {2,4,6,8,10,12,14,16};
//		
//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i] + " ");
//		}
//		reverse(ar);
//		
//		System.out.println();
//		
//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i] + " ");
//		}
//		
//	}
//	
//}
//
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int sqrt(int n) {
		if(n == 1 || n == 0) {
			return n;
		}
		int l = 2, h = n/2;
		int res = 0;
		
		while(l <= h) {
			int m = (l + h) / 2;
			if(m * m == n) {
				return m;
			}
			else if(m * m < n) {
				l = m + 1;
				res = m;
			}
			else {
				h = m - 1;
			}
		}
		return res;
	}
	
	
	
	

	public static void main(String[] args) {
		int n = 24;
		System.out.println(sqrt(n));
	}
}














