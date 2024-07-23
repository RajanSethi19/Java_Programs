package Prgrams;

import java.util.Scanner;

public class PlaindromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string here");
		String str = sc.next();
		String str_new = str;
		int len = str.length();
		String rev = " ";

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}

		if (str_new.equals(rev)) {

			System.out.println(str_new + " it is a paldirom string");
		} 
		else {

			System.out.println(str_new + " it is not a paldirom string");
		}

	}

}
