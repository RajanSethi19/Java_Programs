package Prgrams;

public class MaxandMinInArray {

	public static void main(String[] args) {
		int a[]= {40,50,30,80,100};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max) {
				
			max=a[i];	
			}
			
		}
		System.out.println(max);
	}

}
