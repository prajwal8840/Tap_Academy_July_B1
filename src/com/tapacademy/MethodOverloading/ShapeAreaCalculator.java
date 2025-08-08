package com.tapacademy.MethodOverloading;

//Define the class with overloaded methods
public class ShapeAreaCalculator {

 // Method 1: Calculate area of a square
 public int calculateArea(int side) {
     return side * side;
 }

 // Method 2: Calculate area of a rectangle
 public double calculateArea(double length, double width) {
     return length * width;
 }

 // Method 3: Calculate area of a circle
 public double calculateArea(double radius) {
     return Math.PI * radius * radius;
 }

 // Method 4: Calculate area of a triangle
 public double calculateArea(int base, double height) {
     return 0.5 * base * height;
 }

 // Main method
 public static void main(String[] args) {
     ShapeAreaCalculator calculator = new ShapeAreaCalculator();

     // Area of square
     int squareArea = calculator.calculateArea(5);
     System.out.println("Area of the square: " + squareArea);

     // Area of rectangle
     double rectangleArea = calculator.calculateArea(7.5, 4.0);
     System.out.println("Area of the rectangle: " + rectangleArea);

     // Area of circle
     double circleArea = calculator.calculateArea(3.0);
     System.out.println("Area of the circle: " + circleArea);

     // Area of triangle
     double triangleArea = calculator.calculateArea(8, 6.5);
     System.out.println("Area of the triangle: " + triangleArea);
 }
}
