package BitManiputation;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.border.CompoundBorder;

public class Main {
	public static boolean powOf2(int n) {
		if(n == 0) {
			return false;
		}
		return (n & (n - 1)) == 0;
	}
	
	
	
	public static String decimalToBinary(int n) {
		String b = "";
		while(n >= 1) {
			int x = n % 2;
				n = n / 2;
				b = x + b;
		}
		return b;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int binaryToDecimal(String b) {
		int result = 0;
		int powOf2 = 1;
		
		for (int i = b.length() - 1; i >= 0; i--) {
			if(b.charAt(i) == '1') {
				result = result + powOf2;
			}
			powOf2 = powOf2 * 2;
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//System.out.println(powOf2(n));
		String b = decimalToBinary(n);
		System.out.println(b);
		System.out.println(binaryToDecimal(b));
	}

}
