package com.gmail.the.test2;

import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		double[] array = new double[100];
		for (int i = 0; i < 100; i++) {
			Random random = new Random();
			int t = random.nextInt(1000);
			array[i] = t;
		}

		quickSort(array, 0, 99);
		for (int i = 0; i <= 99; i++) {
			System.out.println(array[i]);

		}
	}

	public static void quickSort(double[] array, int startIndex, int endIndex) {
		if (startIndex >= endIndex) {
			return;
		}

		double key = array[endIndex];
		double t;
		int j = startIndex;

		for (int i = startIndex; i < endIndex; i++) {
			if (array[i] <= key) {
				t = array[j];
				array[j++] = array[i];
				array[i] = t;
			}
		}

		array[endIndex] = array[j];
		array[j] = key;

		quickSort(array, startIndex, j - 1);
		quickSort(array, j, endIndex);
	}
}
