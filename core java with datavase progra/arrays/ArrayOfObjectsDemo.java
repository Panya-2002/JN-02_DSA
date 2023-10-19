//Program to demonstrate Array of Student Objects
package com.tns.arrays;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		// declares an Array of integers.
		Student[] arr;
		// allocating memory for 5 objects of type Student.
		arr = new Student[5];
		// initialize the first elements of the array
		arr[0] = new Student(1, "Shaglin");
		// initialize the second elements of the array
		arr[1] = new Student(2, "Vishal");
		// so on...
		arr[2] = new Student(3, "Nidhi");
		arr[3] = new Student(4, "Lisha");
		arr[4] = new Student(5, "Saurav");
		
		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " + arr[i].getRollNo()+ " " + arr[i].getName());
	}

}
