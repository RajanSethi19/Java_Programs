package Prgrams;

public class EvenAndOddInArray {

	public static void main(String[] args) {
		int num[] = { 2, 3, 4, 5, 6, 7, 8 };

		System.out.println("Even no in array is ");
		for (int i = 0; i <= num.length - 1; i++) {

			if (num[i] % 2 == 0) {

				System.out.println(num[i]);
			}
			

		}
		
		System.out.println("odd no in array is ");
		for (int i = 0; i <= num.length - 1; i++) {

			if (num[i] % 2 != 0) {

				System.out.println(num[i]);
			}
			

		}

	}

}
