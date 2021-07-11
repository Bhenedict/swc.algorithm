package com.java.swc.practice;

import java.util.Scanner;

public class Donut {

	static Scanner sc = new Scanner(System.in);

	static int N = sc.nextInt();

	static int n = sc.nextInt();

	static int array[][] = new int[N][N];

	public static void main(String[] args) {

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				array[i][j] = sc.nextInt();
			}
		}

		int limit = N - n; // 4-3

		for (int i = 0; i <= limit; i++) {
			for (int j = 0; j <= limit; j++) {

				System.out.println("(" + i + "," + j + "): " + array[i][j]);

				// sum to the right:
				for (int x = j; x < n + j; x++) { // 0 1 2

					System.out.print(array[i][x] + " ");

				}
				System.out.println();
			}
		}

		sc.close();
	}

}
