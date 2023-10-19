//Program to Demonstrate Arrays Class
package com.tns.arrays;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {

		// Get the Array
		int intArr[] = { 110, 28, 15, 212, 35 };

		// To print the elements in one line
		System.out.println(Arrays.toString(intArr));
		
		Arrays.sort(intArr);
		
		System.out.println("-----------------After Sorting---------------");
		System.out.println(Arrays.toString(intArr));

		int intKey = 212;

		// Print the key and corresponding index
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));

		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, 1, 3, intKey));

		
		System.out.println("First Array : " + Arrays.toString(intArr));
		
		//Get the second Array
		int intArr1[] = { 10, 15, 22 };
		System.out.println("Second Array : " + Arrays.toString(intArr1));

		// To compare both arrays
		if (Arrays.compare(intArr, intArr1) == 0)
			System.out.println("Both arrays are equal");
		else
			System.out.println("Arrays are not equal");

		//creates a copy of array
		System.out.println("\nNew Arrays by copyOf:\n");
		int intArr2[]=Arrays.copyOf(intArr, 10);
		System.out.println("Integer Array: " + Arrays.toString(intArr2));

		System.out.println("\nNew Arrays by copyOfRange:");
		// To copy the array into an array of new length
		int intArr3[]=Arrays.copyOfRange(intArr, 1, 3);
		System.out.println("Integer Array: " + Arrays.toString(intArr3));

		// To fill the arrays
		Arrays.fill(intArr, intKey);
	
		System.out.println("Integer Array on filling 22: " + Arrays.toString(intArr));

	}

}
