//
package com.tns.collections.set.builtinobjects;

import java.util.HashSet;

public class HashSetExecutor {

	public static void main(String[] args) {
		
		HashSetDemo hs = new HashSetDemo();
		
		//Unordered and unsorted set
		HashSet<Integer> numberHashSet = new HashSet<Integer>();
		hs.addElements(numberHashSet);
		
		System.out.println("Hashset is: ");
		hs.display(numberHashSet);
		
		HashSet<Integer> numberHashSet2 = new HashSet<Integer>();
		hs.addElements2(numberHashSet2);
		System.out.println("Hashset2 is: ");
		hs.display(numberHashSet2);
		
		HashSet<Integer> duplicate = new HashSet<Integer>();
		hs.addElements(duplicate);
		
		hs.union(duplicate, numberHashSet2);
		
		hs.clear(duplicate);
		hs.addElements(duplicate);
		hs.intersection(duplicate, numberHashSet2);
		
		hs.clear(duplicate);
		hs.addElements(duplicate);
		hs.setDifference(duplicate, numberHashSet2);
		
		System.out.println("-------Iterated HashSet2-------");
		hs.iterate(numberHashSet2);
		
		System.out.println("-------Iterated HashSet1-------");
		hs.iterate(numberHashSet);
		
		hs.clear(numberHashSet2);
		hs.display(numberHashSet2);
	}

}
