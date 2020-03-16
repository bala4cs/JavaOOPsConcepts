package com.learning.constructor;


class Demo {
	
	String details;
	
	Demo(){
		System.out.println("NO arguments constructor");
	}
}

public class NoArgumentConstructor {

	public static void main(String...strings) {
		
		Demo demo = new Demo();
	}

}
