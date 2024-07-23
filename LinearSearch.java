package Prgrams;

public class LinearSearch {

	public static void main(String[] args) {
		int num[] = { 10, 20, 30, 40, 50, 60 };

		int no_seacrh = 50;
		boolean flag = false;
		for (int i = 0; i < num.length; i++) {

			if (no_seacrh == num[i]) {

				System.out.println("no found at the position " + i);
				flag = true;
			}
		}

		if (flag == false) {

			System.out.println("no not found");
		}

	}

}
