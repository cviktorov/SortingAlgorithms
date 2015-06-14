package com.SelectionSort;

public class Selection {
	public static void sort(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
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
