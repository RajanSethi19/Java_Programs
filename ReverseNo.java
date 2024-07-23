package Prgrams;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {

		int num=121;
		
		int num2=num;
		int rev=0;
		while(num>0) {
			
			rev=rev*10+num%10;
			num=num/10;
		}
		
		
		if(num2==rev) {
			System.out.println("it is a palindrom no");
		}
		else {
			
			System.out.println("it is not a palindrom no");
		}
		
	}

}
