package com.kabilan.search;

public class QU {
	private int[] id;
	private int[] size[];

	public QU(int N) {
		id = new int[N];
		size = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
			size[i] = 1;
		}
	}

	public boolean connected(int p, int q) {
		return (findRoot(p) == findRoot(q));
	}

	public void union(int p, int q) {
		int i = findRoot(p);
		int j = findRoot(q);
		if (size[i]<=size[j]) {
			id[i] = j;
			size[j]+=size[i];
		}
		else {
			id[j] = i;
			size[i]+=size[j];
		}
	}

	private int findRoot(int p) {
		// returns the root of the corresponding element
		if (id[p] == p) {
			return p;
		}
		int k = findRoot(id[p]);
		id[p] = k;
		return k;
	}
}
