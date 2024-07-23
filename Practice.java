package Prgrams;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		int n = 123456789;
		int evencount = 0;
		int oddcount = 0;
		while (n > 0) {

			int rem = n % 10;
			if (rem % 2 == 0) {
				evencount++;

			}
			
			else 
			{
				oddcount++;
			}
			
			
n=n/10;
		}
		

	}

}
