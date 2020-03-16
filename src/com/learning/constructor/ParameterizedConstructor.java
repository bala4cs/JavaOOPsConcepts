package com.learning.constructor;


class CheckParameter {
	
	String name;
	int id;
	
	CheckParameter(String name, int id){
		this.name = name;
		this.id = id;
	}
}

public class ParameterizedConstructor {

	public static void main(String...strings) {
		
		
		CheckParameter checkParameter = new CheckParameter("bala", 3);
		System.out.println(checkParameter.name +" "+ checkParameter.id);
	}

}
