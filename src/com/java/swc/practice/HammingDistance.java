package com.java.swc.practice;

public class HammingDistance {

	public static void main(String[] args) {

		int numberOfDigits = 4;
//		int numberOfOnes = 2;

		String arr[] = new String[20];
		int iterator = 0;
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 1; j++) {
				for (int k = 0; k <= 1; k++) {
					for (int l = 0; l <= 1; l++) {
//						System.out.println(i + "" + j + "" + k + "" + l);
						arr[iterator] = i + "" + j + "" + k + "" + l;
						iterator++;
					}
				}
			}
		}

		String array[] = new String[iterator];
		int twoOnesIterator = 0;

		for (int i = 0; i < iterator; i++) {
//			if (arr[i] != null) {
//				System.out.println(arr[i]);
//			}

			int oneCounter = 0;

			for (int j = 0; j < numberOfDigits; j++) {

				if (arr[i].charAt(j) == '1') {
					oneCounter++;
					if (oneCounter > 2) {
						break;
					}
				}
			}

			if (oneCounter == 2) {
				array[twoOnesIterator] = arr[i];
				twoOnesIterator++;
			}
		}
		System.out.println("8421");
		System.out.println("____");
		for (int i = 0; i < twoOnesIterator; i++) {
			System.out.print(array[i] + ": ");
			System.out.println(Integer.parseInt(array[i], 2));
		
		}
		
		
	}

}
