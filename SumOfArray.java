package Prgrams;

public class SumOfArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int sum=0;
		
		/*
		 * for(int i=0;i<4;i++) {
		 * 
		 * sum=sum+a[i]; }
		 */
		
		
		for(int value:a) {
			sum=sum+value;
		
		}
		System.out.println(sum);
	}

}
