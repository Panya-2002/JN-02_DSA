//Program to demonstrate Multidimensional Array
package com.tns.arrays;

class MLArray
{
	static void printArray(int c[][])
	{
		System.out.println("Array Elements are as follows: ");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++)
				System.out.print(c[i][j] + " ");
			System.out.println();
		}
	}
}

public class MultiDimArrayDemo {
	public static void main(String[] args) {

		int c[][] = { { 12, 45 }, { 10, 40 }, { 5, 7 } }; // new int[3][2];

		System.out.println("No. of Rows in C array : " + c.length);

		MLArray.printArray(c);
	}

}
