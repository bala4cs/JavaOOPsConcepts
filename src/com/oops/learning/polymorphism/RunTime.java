package com.oops.learning.polymorphism;

class Bike {
	void run() {
		System.out.println("Bike is running");
	}
	
}

class Splendor extends Bike{
	void run() {
		System.out.println("Splendor Bike is running");
	}
}
/**
 * Runtime polymorphism: It is also known as Dynamic Method Dispatch. It is a process in which a function call to the overridden method is resolved at Runtime. 
 * This type of polymorphism is achieved by Method Overriding.
	Method overriding, on the other hand, occurs when a derived class has a definition for one of the member functions of the base class.
	 That base function is said to be overridden.
 * 
 * 
 * Upcasting --> If the reference variable of parent class refers to the object of child class. It is known as upcasting 
 * @author bala
 *
 */
public class RunTime {
	
	public static void main(String...strings ) {
		Bike b = new Splendor();
		b.run();
	}
	
}
