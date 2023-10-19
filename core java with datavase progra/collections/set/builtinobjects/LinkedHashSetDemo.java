/*Program to demonstrate LinkedHashSet Collection*/
package com.tns.collections.set.builtinobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	LinkedHashSet<Integer> lhset = new LinkedHashSet<Integer>();

	void insert(int a) {
		lhset.add(a);
	}
	void display() {
		System.out.println("Linked Hash Set is: "+lhset);
	}
	
	/*void sort() {
		Collections.sort(lhset);	//CTE - cannot directly sort HashSet/LinkedHashSet
	}*/
	
	void sort(ArrayList<Integer> array) {
		Collections.sort(array);
		System.out.println("-------After Sorting-------");
		System.out.println(array);
	}
	
}
