package com.kabilan.search;

public class QU {
	private int[] id;

	public QU(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}

	public boolean connected(int p, int q) {
		return (findRoot(p) == findRoot(q));
	}

	public void union(int p, int q) {
		int i = findRoot(p);
		int j = findRoot(q);
		id[i] = j;
		;
	}

	private int findRoot(int p) {
		// returns the root of the corresponding element
		while(id[p] != p) {
			p = id[p];
		}
		return p;
	}
}
