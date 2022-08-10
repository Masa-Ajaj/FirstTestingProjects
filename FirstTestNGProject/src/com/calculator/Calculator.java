package com.calculator;

import java.text.DecimalFormat;

public class Calculator {
	
	private static DecimalFormat doubleFormater = new DecimalFormat("#.####");
	
	public static double add(double first, double second) {
		return Double.parseDouble(doubleFormater.format(first + second));
	}

	public static double subtract(double first, double second) {
		return Double.parseDouble(doubleFormater.format(first - second));
	}

	public static double multiply(double first, double second) {
		return Double.parseDouble(doubleFormater.format(first * second));
	}

	public static double divide(double first, double second){
		if(second == 0)
			throw new ArithmeticException("Division by zero is not allowed");
		return Double.parseDouble(doubleFormater.format(first / second));
	}
	
	/**
	 * calculate the square root for a number
	 * @param number to find the square  for
	 * @return the square for the number
	 */
	public static double squar(double number) {
		return Double.parseDouble(doubleFormater.format( multiply(number, number)));
	}
	
	/**
	 * find the square root for a number
	 * @param number to check.
	 * @return the square root for the number
	 */
	public static double squareRoot(double number) {
		double squareRoot = 0;
		if(number == 0)
			return number;
		else if (number < 0)
			throw new ArithmeticException("invalid Operation: cannot calculate square root for negative numbers");
		else {
			double t;
			squareRoot = number / 2;
			do {
				t = squareRoot;
				squareRoot = (t + (number / t)) / 2;
			} while ((t - squareRoot) != 0);
		}
		return Double.parseDouble(doubleFormater.format(squareRoot));
	}
	
	/**
	 * find if an integer is prime or not
	 * @param number integer parameter to check.
	 * @return true if the number is prime or false if not.
	 */
	public static boolean isPrime(int number) {
		for(int i = 2; i < number/2; i++) {
			if(number%i == 0)
				return false;
		}
		return true;
	}
	
	/**
	 * find the greatest common divisor between two integers
	 * @param x first integer
	 * @param y second integer
	 * @return the greatest common divisor
	 */
	public static int greatestCommonDivisor(int x, int y) {
		if(x%y == 0)
			return y;
		return greatestCommonDivisor(y, x%y);
	}
	
	/**
	 * calculate the exponential value for a number
	 * @param number integer parameter to check. 
	 * @param factor the exponential factor
	 * @return value of number^factor
	 */
	public static double exponential(double number, int factor) {
		double result = 1;
		for(int i = 0; i < factor; i++) {
			result = result * number;
		}
		return Double.parseDouble(doubleFormater.format(result));
	} 
	
	/**
	 * calculate the factorial for a number
	 * @param number integer parameter to
	 * @return factorial(number)
	 */
	public static int factorial(int number) {
		if(number == 3)
			return number;
		return number * factorial(--number);
	}
	
	public static boolean isEven(int number) {
		return (number/2==0)?true:false;
	}
	
	public static boolean isOdd(int number) {
		return (number/2==0)?true:false;
	}
	
	public static double mod(double first, double second) {
		return first % second;
	}
}
