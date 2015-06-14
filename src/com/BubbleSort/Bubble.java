package com.BubbleSort;

public class Bubble {
	public static void sort(Integer[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]){
					swap(arr, j, j+1);
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
