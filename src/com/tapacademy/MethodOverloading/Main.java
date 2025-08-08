package com.tapacademy.MethodOverloading;

class Calculator {
	public int add(int a , int b) 
	{
		return a + b ;
	}
	
	public double add(double a , double b , double c)
	{
		return a + b + c ;
	}
	
	public float add(float a , float b)
	{
		return a + b;
	}
	
	public double add(int a , double b)
	{
		return a + b;
	}	
}

public class Main {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int intSum = cal.add(5 , 10);
		System.out.println("sum of two integer: " + intSum);
		
		double doubleSum = cal.add(3.5, 4.5, 5.5);
		System.out.println("sum of three double: " + doubleSum);
		
		float floatSum = cal.add(2.5f, 3.5f);
		System.out.println("sum of two float: " + floatSum);
		
		double mixedSum = cal.add(4, 7.5);
		System.out.println("sum of integer and double: " + mixedSum);
		
	}
}




//class Calculator {
//
//    // Method 1: Divide two integers
//    public int divide(int a, int b) {
//        return a / b;
//    }
//
//    // Method 2: Divide three doubles
//    public double divide(double a, double b, double c) {
//        return a / b / c;
//    }
//
//    // Method 3: Divide two floats
//    public float divide(float a, float b) {
//        return a / b;
//    }
//
//    // Method 4: Divide an integer by a double
//    public double divide(int a, double b) {
//        return a / b;
//    }
//}
//
//public class Demo {
//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//
//        // Divide 20 by 5 (two integers)
//        int intQuotient = calculator.divide(20, 5);
//        System.out.println("Quotient of two integers: " + intQuotient);
//
//        // Divide 45.0 by 3.0 by 5.0 (three doubles)
//        double doubleQuotient = calculator.divide(45.0, 3.0, 5.0);
//        System.out.println("Quotient of three doubles: " + doubleQuotient);
//
//        // Divide 9.0f by 3.0f (two floats)
//        float floatQuotient = calculator.divide(9.0f, 3.0f);
//        System.out.println("Quotient of two floats: " + floatQuotient);
//
//        // Divide 30 by 2.5 (int by double)
//        double mixedQuotient = calculator.divide(30, 2.5);
//        System.out.println("Quotient of an integer and a double: " + mixedQuotient);
//    }
//}
