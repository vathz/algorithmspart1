package com.kabilan.search;

public class UF {
	private int[] id;

	public UF(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}

	public boolean connected(int p, int q) {
		if(id[p] == id[q]) {
			return true;
		}
		return false;
	}

	public void union(int p, int q) {
		// iterate the entire list and change all entries with value at index p
		// to value at index q
		int targetValue = id[q];
		int sourceValue = id[p];
		for (int i = 0; i < id.length; i++) {
			if (id[i] == sourceValue) {
				id[i] = targetValue;
			}
		}
	}
}