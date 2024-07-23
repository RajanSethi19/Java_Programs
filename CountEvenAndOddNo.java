package Prgrams;

public class CountEvenAndOddNo {

	public static void main(String[] args) {
		int num = 123456;
		int EvenCount = 0;
		int OddCount = 0;

		while (num > 0) {
			int rem = num %10;
			if (rem % 2 == 0) {

				EvenCount++;
			}

			else {
				OddCount++;
			}
			num = num / 10;
		}
		System.out.println(EvenCount + " total no of even no count");
		System.out.println(OddCount + " Total no of odd no count");
	}

}
