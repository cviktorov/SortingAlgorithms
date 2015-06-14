package com.InsertionSort;

import java.util.Arrays;

public class Insertion {

	public static void sort(Integer[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j + 1, j);
				}
			}
		}
		
	}

	private static void swap(Integer[] arr, int index1, int index2) {
		Integer a = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = a;
	}
}
