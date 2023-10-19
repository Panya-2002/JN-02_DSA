//
package com.tns.collections.set.builtinobjects;
import java.util.ArrayList;

public class LinkedHashSetExecutor {

	public static void main(String[] args) {
		
		LinkedHashSetDemo lhset1 = new LinkedHashSetDemo();

		lhset1.insert(10);
		lhset1.insert(40);
		lhset1.insert(20);
		lhset1.insert(70);
		lhset1.insert(60);
		lhset1.insert(30);
		lhset1.insert(10);
		lhset1.insert(50);
		
		lhset1.display();
		
		// sort using ArrayList/TreeSet

		// Convert LinkedHashSet to an ArrayList
		ArrayList<Integer> array = new ArrayList<>(lhset1.lhset);
		
		lhset1.sort(array);

	}

}
