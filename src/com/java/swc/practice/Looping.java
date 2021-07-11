package com.java.swc.practice;

public class Looping {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 3) {
				System.out.println(i + " == 3");
			} else if (i == 6) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}
}
