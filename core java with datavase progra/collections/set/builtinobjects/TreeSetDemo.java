//
package com.tns.collections.set.builtinobjects;

import java.util.TreeSet;

public class TreeSetDemo<E> {
	TreeSet<String> ts = new TreeSet<String>();
	
	void insert(String a) {
		ts.add(a);
	}
	
	void display() {
		System.out.println("tree Set is :"+ts);	
	}
	
	void lastElement() {
		System.out.println("Highest value is :"+ts.pollLast());
	}
	
	void firstElement() {
		System.out.println("Lowest value is :"+ts.first());
	}
	
	void reverse() {
        System.out.println("Reverse Set: "+ts.descendingSet());  
	}
	
	void headSet(String a) {
        System.out.println("Head Set: "+ts.headSet(a));  
	}
	
	void subSet(String a, String b) {
        System.out.println("Head Set: "+ts.subSet(a, b));  
	}
	
	void tailSet(String a) {
        System.out.println("Head Set: "+ts.tailSet(a));  
	}
}
