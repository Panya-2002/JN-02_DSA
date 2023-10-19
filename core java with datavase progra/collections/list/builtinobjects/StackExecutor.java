//Program to demonstrate Stack Execution
package com.tns.collections.list.builtinobjects;

public class StackExecutor {

	public static void main(String[] args) {
		StackDemo s = new StackDemo();
		
		//Insertion
		s.insert("Dell");
		s.insert("HP");
		s.insert("Lenova");
		s.insert("Apple");
		s.insert("Asus");
		s.insert("Acer");
		s.insert("Samsung");
		
		s.display();
		s.returnTop();			//Return top element
		s.delete();
		s.display();
		s.returnTop();
		s.search("Apple");
		s.sizeOf();
		
		//traverse
		s.iterator();
		s.iterateReverse();

	}

}
