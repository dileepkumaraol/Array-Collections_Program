package org.array_collections;

public class Prgm2_Array_avg {

	public static void main(String[] args) {
		int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		float avg, sum=0;
		
		for(int r:a)
		{
			sum=sum+r;
		}
		avg=sum/a.length;
		System.out.println("The average of all array is: "+avg);
	}

}
