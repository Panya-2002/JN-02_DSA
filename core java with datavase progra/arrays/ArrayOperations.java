package com.tns.arrays;

public class ArrayOperations
{
	//print int array
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
		System.out.println();
	}
	
	// variable argument function
	public static int getSum(int... n) {
		int sum = 0;
		for (int no : n)
			sum += no;
		return sum;
	}
	
	//count no. of odd elements
	public static int getOddCount(int b[])
	{
		int count=0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 != 0)
				count++;		
		}
		return count;
	}
	
	//count no. of even elements
	public static int getEvenCount(int b[])
	{
		return b.length-getOddCount(b);
	}
}

