//
package com.tns.collections.set.builtinobjects;

public class TreeSetExecutor {

	public static void main(String[] args) {
		TreeSetDemo ts = new TreeSetDemo();
		
		ts.insert("F");
		ts.insert("B");
		ts.insert("D");
		ts.insert("A");
		ts.insert("E");
		ts.insert("G");
		ts.insert("C");
		ts.insert("C");
		
		ts.display();
		
		ts.reverse();
		
		ts.display();
		
		ts.firstElement();
		
		ts.lastElement();
		
		
		
		ts.headSet("D");
		
		ts.subSet("C", "F");
		
		ts.tailSet("D");


	}

}
