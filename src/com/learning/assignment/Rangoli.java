package com.learning.assignment;

public class Rangoli {

	public static void main(String...strings) {
		int n = 6;
		for(int i = 0 ; i <n ;i++) {
			for(int j = 0 ; j < n;j++) {
				
				if (i == j || j ==n-1|| j ==0 || i ==0 || i ==n-1) {
					System.out.print("#");
				} else {
					System.out.print(1);
				}
				if (j ==n-1) {
					System.out.println("");
				}
			}
		}
	}

}
