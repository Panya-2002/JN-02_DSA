//Program to demonstrate LinkedList methods
package com.tns.collections.list.builtinobjects;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	LinkedList<Integer> ll = new LinkedList<Integer>();
	void insert(int a) {
		ll.add(a);
	}
	void insertFirst(int a) {
		ll.addFirst(a);
	}
	void insertLast(int a) {
		ll.addLast(a);
	}
	void insertPosition(int a, int b){
		ll.add(a, b);
	}
	void display() {
		System.out.println(ll);
	}
	void getFirst() {
		System.out.println("First Element is " + ll.getFirst());
	}
	void getLast() {
		System.out.println("Last Element is " + ll.getLast());
	}
	
	//Traverse the list 
	void iterate() {
		ListIterator<Integer> li = ll.listIterator();

		while (li.hasNext())
			System.out.print(li.next() + "\t");
	}
	
	//Traverse the list in reverse order
	void iterateReverse() {
		ListIterator<Integer> li = ll.listIterator();
		System.out.println("\n");
		li = ll.listIterator(ll.size());
		while (li.hasPrevious()) {
			System.out.print(li.previous() + "\t");
		}	
	}
	void removeFirst() {
		ll.removeFirst();	//Remove first element
	}
	void removeLast() {
		ll.removeLast();	//Remove last element
	}
	void sort() {
		Collections.sort(ll);	//sort in ascending order
		System.out.println("Number List in Ascending order is " + ll);
	}
	void reverse() {
		Collections.sort(ll);
		Collections.reverse(ll);	//sorting in descending order
		System.out.println("Number List in Descending order is " + ll);
	}

}
