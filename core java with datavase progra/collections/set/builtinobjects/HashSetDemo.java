/*Program to demonstrate HashSet Collection*/
package com.tns.collections.set.builtinobjects;
import java.util.HashSet;
import java.util.Spliterator;

public class HashSetDemo {
	void addElements(HashSet<Integer> numberHashSet) {
		numberHashSet.add(61);
		numberHashSet.add(41);
		numberHashSet.add(91);
		numberHashSet.add(51);
		numberHashSet.add(80);
		numberHashSet.add(11);
		numberHashSet.add(20);
	}
	void addElements2(HashSet<Integer> numberHashSet1) {
		numberHashSet1.add(20);
		numberHashSet1.add(80);
		numberHashSet1.add(11);
		numberHashSet1.add(50);
		numberHashSet1.add(60);
		numberHashSet1.add(10);
		numberHashSet1.add(51);
	}
	
	void display(HashSet<Integer> hs) {
		System.out.println(hs);
	}
	
	void clear(HashSet<Integer> hs) {
		hs.clear();
	}
	
	// Union of two sets
	void union(HashSet<Integer> hs1, HashSet<Integer> hs2){
		hs1.addAll(hs2);
		System.out.println("Union : " + hs1);
	}
	
	// Intersection of two SETs
	void intersection(HashSet<Integer> hs1, HashSet<Integer> hs2) {
		hs1.retainAll(hs2);
		System.out.println("Intersection : " + hs1);
	}
	
	// SET Difference
	void setDifference(HashSet<Integer> hs1, HashSet<Integer> hs2) {
		hs1.removeAll(hs2);
		System.out.println("Set difference : " + hs1);
	}
	
	//SplitIterator 
	void iterate(HashSet<Integer> hs1) {
		//SplitIterator 
		Spliterator<Integer> spit=hs1.spliterator();
		spit.forEachRemaining(System.out::println);
	}
	

}
