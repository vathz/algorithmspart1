package com.kabilan.tests;

import com.kabilan.sort.Sort;

public class HeapSortTest {
	public static void main(String[] args) {
		System.out.println("heapsort");
		Integer[] arr = new Integer[]{0, 3, 2, 19, 37, 22, 1, 99, 78, 36, 28, 46, 59, 90};
		Sort.heapSort(arr);
		System.out.println(arr.length);
		for (Integer element : arr) {
			System.out.print(element + " ");
		}
	}
}