//Program to demonstrate ArrayList methods
package com.tns.collections.list.builtinobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class ArrayListDemo {
	
	List<Integer> list2 = new ArrayList<Integer>(); 		// Using Generic we can create Homogeneous List
	void insert(int a) {
		list2.add(a);
	}
	void print() {
		System.out.println("List is "+list2);
	}
	void contains(int a) {
		System.out.println("Is list conatins "+a+"? "+list2.contains(a));
	}
	void remove(int a) {
		list2.remove(a);
	}
	
	//printing list in reverse
	void reverse() {
		Collections.reverse(list2);
		System.out.println("Reverse Name List is "+list2);
	}
	
	// Traversing a list
	void traverse() {
		System.out.println("--------------- Traversing a list ---------------");
		Iterator<Integer> i = list2.iterator();
		while (i.hasNext()) {
			Integer nm = i.next();
			System.out.println(nm);
		}
	}
	
	// Traversing a list in reverse
	void traverseReverse() {
		System.out.println("--------------- Traversing a list in backward manner ---------------");
		ListIterator<Integer> li=list2.listIterator(list2.size());
		while(li.hasPrevious())
		{
			Integer nm = li.previous();
			System.out.println(nm);			
		}
	}
	
	//Sorting in ascending order
	void sortAscending() {
		Collections.sort(list2);
		System.out.println("Sorting in Ascending order " + list2);
	}
	
	//Sorting in descending order
	void sortDescending() {
		Collections.sort(list2);
		Collections.reverse(list2);
		System.out.println("Sorting in Descending order " + list2);
	}

}
