package com.java.swc.practice;

public class Sort {

	public static void main(String[] args) {

		int array[] = { 10, 8, 7, 6, 9 };

		System.out.println("Original Array: ");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		// nested for loop.
		for (int i = 0; i < array.length; i++) {
			// ang gagawin nito, ichecheck niya yung current value ng array at yung susunod
			// na value ng array, kapag mas malaki, pagpapalitin niya. yung array.length -1,
			// para hindi mag out of bounds.
			for (int j = 0; j < array.length - 1; j++) {

				if (array[j] > array[j + 1]) {

					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		System.out.println("\n\nNew Array: ");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
