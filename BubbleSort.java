package Prgrams;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = { 10, 40, 80, 60, 30, 100, 50, 20, 70, 90 };

		int n = a.length;
		
		System.out.println(n);
		System.out.println("Array before sorting" + Arrays.toString(a));
		for (int i = 0; i <n-1; i++) {

			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {

					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}

		}
		System.out.println("Array after sorting" + Arrays.toString(a));

	}

}
