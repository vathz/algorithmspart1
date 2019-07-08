package com.kabilan.tests;

import com.kabilan.search.QU;

import java.util.Scanner;

public class ConnectivityTestQU {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		QU qu = new QU(N);
		while(!scanner.nextLine().equals("\n")) {
			int p = scanner.nextInt();
			int q = scanner.nextInt();
			if (!qu.connected(p, q)) {
				qu.union(p,q);
				System.out.println(p + " " + q);
			}
		}
	}
}