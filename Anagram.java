package Prgrams;

import java.util.Arrays;


public class Anagram {

	public static void main(String[] args) {
		String str1 = "LISTEN";
		String str2 = "SILENT";

		char c1[] = str1.toCharArray();
		System.out.println(c1);
		char c2[] = str2.toCharArray();

		if (c1.length != c2.length) {

			System.out.println("Not a A anagram");
			System.exit(0);
		}

		Arrays.sort(c1);
		Arrays.sort(c2);

		for (int i = 0; i < c1.length; i++) {
			if (c1[i] != c2[i]) {
				System.out.println("Not a anagram");
				System.exit(0);

			}

		}

		System.out.println("Anagram no is here");
	}

}
