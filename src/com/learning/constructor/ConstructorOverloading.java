package com.learning.constructor;


class TestParamConstructor {
	
	String name;
	int id;
	
	TestParamConstructor(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	TestParamConstructor(String name){
		this.name = name;
	}
	
}

public class ConstructorOverloading {

	public static void main(String...strings) {
		
		
		TestParamConstructor param = new TestParamConstructor("bala", 3);
		System.out.println(param.name +" "+ param.id);
		
		TestParamConstructor param1 = new TestParamConstructor("Overloading");
		System.out.println(param1.name);
		
	}

}
