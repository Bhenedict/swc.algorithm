package com.java.swc.practice;

public class DateManipulation {

	public static void main(String[] args) {

		String date = "2019-06-12 1:23:45PM";
		int numbers = 0;
		int iterator = 0;

		for (int i = 0; i < date.length(); i++) {
			char a = date.charAt(i);
			System.out.println("a: " + a);
			if (checkChar(a)) {
				numbers++;
			}
		}

		char newDate[] = new char[numbers];

		for (int i = 0; i < date.length(); i++) {
			char a = date.charAt(i);
			if (checkChar(a)) {
				newDate[iterator] = a;
				iterator++;
			}
		}
		
		String stringDate = new String(newDate);
		System.out.println(stringDate);
		
		
		
	}

	public static boolean checkChar(char a) {
		return a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9'
				|| a == '0';
	}

}
