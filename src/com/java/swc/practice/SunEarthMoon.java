package com.java.swc.practice;

public class SunEarthMoon {

	public static void main(String[] args) {

		int sun = 365;
		int earth = 24;
		int moon = 29;

		int s = 355;
		int e = 16;
		int m = 8;

		for (int x = 0; x <= 100000; x++) {
//			int year = 0;
			if (x % earth == e && x % moon == m) {
//				year = x;
				if (x % sun == s) {
					System.out.println("Year is: " + x);
					break;
				}
			}
		}
	}
}
