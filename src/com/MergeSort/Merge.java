package com.MergeSort;

import java.util.Arrays;

public class Merge {

	private Integer[] arr;
	private Integer[] current;
	
	public Merge(Integer arr[]) {
		this.arr = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++) {
			this.arr[i] = arr[i];
		}
		current = new Integer[arr.length];
	};

	public void sort() {
		int l = arr.length - 1;
		doMerge(0, l);
		System.out.println(Arrays.toString(arr));
	}

	private void doMerge(int from, int to) {
		if (from < to) {
			int middle = from + (to - from) / 2;
			doMerge(from, middle);
			doMerge(middle + 1, to);
			merge(from, middle, to);
		}

	}

	private void merge(int from, int middle, int to) {
		
		for (int i = 0; i < arr.length; i++) {
			current[i] = arr[i];
		}

		int i = from;
		int j = middle + 1;
		int k = from;
		while (i <= middle && j <= to) {
			System.out.println(5);
			if (current[i] <= current[j]) {
				arr[k] = current[i];
				i++;
			} else {
				arr[k] = current[j];
				j++;
			}
			k++;
		}

		while (i <= middle) {
			arr[k] = current[i];
			k++;
			i++;
		}

	}

	@Override
	public String toString() {
		return "Merge [arr=" + Arrays.toString(arr) + "]";
	}
	
}
