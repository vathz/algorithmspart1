package com.kabilan.search;

public class Search{
	public static boolean binarySearch(Integer[] arr, Integer key) {
		return binarySearch(arr, key, 0, arr.length - 1);
	}

	private static boolean binarySearch(Integer[] arr, Integer key, int start, int end) {
		if(start > end){
			System.out.println("reached end");
			return false;
		}

		int m = (start + end) / 2;
		if(arr[m] == key) {
			return true;
		}

		if(key < arr[m]) {
			return binarySearch(arr, key, start, m - 1);
		}

		return binarySearch(arr, key, m + 1, end);
	}

	public static void main(String[] args) {
		System.out.println(binarySearch(new Integer[]{0, 1, 2, 3, 5, 7, 9, 11, 14, 16, 17, 19, 20}, 7));
	}
}