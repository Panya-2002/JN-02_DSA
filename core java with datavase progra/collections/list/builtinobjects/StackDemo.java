//Program to demonstrate Stack methods
package com.tns.collections.list.builtinobjects;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {
	Stack<String> stk = new Stack<String>();
	void insert(String a) {
		stk.push(a);
	}
	void delete() {
		stk.pop();
	}
	void returnTop() {
		System.out.println("Top element is : "+stk.peek());
	}
	void search(String a) {
		System.out.println("Location of "+a+" is :"+stk.search(a));
	}
	void sizeOf() {
		System.out.println("Size of Stack is "+stk.size());
	}
	void display() {
		System.out.println("Stack is: "+stk);
	}
	
	//traverse in given order
	void iterator() {
		Iterator<String> iterate = stk.iterator();
		System.out.println("-------Iteration from begining-------");
		while(iterate.hasNext()) {
			Object value = iterate.next();
			System.out.println(value);
		}
	}
	
	//traverse in reverse order
	void iterateReverse() {
		ListIterator<String> list = stk.listIterator(stk.size());
		System.out.println("-------Iteration from last-------");
		while(list.hasPrevious()) {
			String pre = (String) list.previous();
			System.out.println(pre);
		}
		
	}
}
