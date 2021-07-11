package com.java.swc.practice;

public class SwitchingAandB {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;

//		int a = 6;
//		int b = 3;
		
		System.out.println("Original values: " + "\na = " + a + "\nb = " + b);

		a = Math.abs(a + b); // 5 + 10 = 15
		b = Math.abs(a - b); // 15 - 10 = 5
		a = Math.abs(a - b); // 15 - 5 = 10
		
		System.out.println("\nNew values: " + "\na = " + a + "\nb = " + b);
	}

}
