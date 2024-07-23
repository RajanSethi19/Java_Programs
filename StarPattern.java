package Prgrams;

import java.util.Arrays;

public class StarPattern {

	public static void main(String[] args) {

		int a[] = { 40, 30, 60, 10, 20, 80, 50, 100, 90, 70 };

		int n = a.length;
		System.err.println(n);
		int temp = 0;
		System.out.println("Array before soarting " + Arrays.toString(a));
		for (int i = 0; i< n-1 ; i++) {
			
			for (int j = 0; j < n - 1; j++) {

				if (a[j] > a[j + 1]) {

					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}

		System.out.println("Array after soarting " + Arrays.toString(a));

	}

}
