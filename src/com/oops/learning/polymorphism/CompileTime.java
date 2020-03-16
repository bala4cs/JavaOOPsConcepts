package com.oops.learning.polymorphism;

class MultiplyFunction{
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	
	public double multiply(double a , double b) {
		return a * b;
	}
	
}


/**
 * Method Overloading: When there are multiple functions with same name but different parameters then these functions are said to be overloaded. 
 * Functions can be overloaded by change in number of arguments or/and change in type of arguments.
 * 
 * @author bala
 *
 */
public class CompileTime {
	
	public static void main(String...strings ) {
		MultiplyFunction multiplyFunction = new MultiplyFunction();
		System.out.println(multiplyFunction.multiply(1, 3));
		System.out.println(multiplyFunction.multiply(3.3, 6.9));
	}
	
}
