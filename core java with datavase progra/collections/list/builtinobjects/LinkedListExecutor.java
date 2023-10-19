//Program to demonstrate LinkedList Execution
package com.tns.collections.list.builtinobjects;

public class LinkedListExecutor {

	public static void main(String[] args) {
		LinkedListDemo ll = new LinkedListDemo();
		
		//insertion
		ll.insert(10);
		ll.insert(20);
		ll.insert(40);
		
		ll.insertFirst(5);			//insertion in first
		ll.insertPosition(2, 60);	//insertion in index value 2
		ll.insertLast(25);			//insertion at last
		ll.insert(30);
		ll.display();
		
		ll.sort(); 
		ll.display();
		
		ll.reverse();
		ll.display();
		
		ll.removeFirst(); ll.display(); ll.removeLast(); ll.display();
		ll.iterate(); ll.iterateReverse();
	
		
		
	}
}
