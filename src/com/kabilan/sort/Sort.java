package com.kabilan.sort;

public class Sort {
	// merge sort has worst case sort time of n log(n)
	public static Integer[] mergeSort(Integer[] arr) {
		mergeSort(arr, 0, arr.length - 1);
		return arr;
	}

	private static void mergeSort(Integer[] arr, int l, int r) {
		int m = (l+r)/2;
		if (l<r) {
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			merge(arr, l, m, r);
		}
	}

	private static void merge(Integer[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		// create temp arrays
		Integer[] L = new Integer[n1];
		Integer[] R = new Integer[n2];

		// copy elementss to temp array
		for (int i=0, k=l; i<n1; i++, k++) {
			L[i] = arr[k];
			//System.out.print(L[i] + " ");
		}
		//System.out.println("");

		// copy elements to temp array
		for (int j=0, k=m+1; j<n2; j++, k++) {
			R[j] = arr[k];
			//System.out.print(R[j] + " ");
		}
		//System.out.println("");

		int i=0, j=0, k=l;
		while (i<n1 && j<n2) {
			if(L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else if(L[i] > R[j]) {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// copy remaining elemnts from temp array if any
		while (i<n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j<n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public static void heapSort(Integer[] arr) {
	}
}