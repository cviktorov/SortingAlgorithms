package com.MergeSort;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Integer[] arr = {12,5,8,3,2,4,10,9,17,21};
		Merge m = new Merge(arr);
		m.sort();
		System.out.println(m);

	}

}
