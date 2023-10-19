//Program to demonstrate Jagged array 
package com.tns.arrays;

class JaggedArray {
	static void printArray(int d[][]) {
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++)
				System.out.print(d[i][j] + " ");
			System.out.println();
		}

	}
}

public class JaggedArrayDemo {

	public static void main(String[] args) {

		int d[][] = { { 10, 20, 30 }, { 40 }, { 12, 21 }, { 11 } };

		System.out.println("Total Rows in Array d : " + d.length);

		JaggedArray.printArray(d);
	}

}
