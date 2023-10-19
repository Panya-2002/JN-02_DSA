/*Java program to demonstrate working of ConcurrentHashMap*/
package com.tns.collections.map.map;

import java.util.concurrent.*;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<>();

		m.put(100, "Hello");
		m.put(101, "How are you?");
		m.put(102, "Fine");
		
		System.out.println(m);
		
		//if element not present add new element
		m.putIfAbsent(101, "Hello");
		System.out.println(m);
		
		//Remove 101 entry
		m.remove(101, "How are you?");
		System.out.println(m);
		
		// Now we can add Hello
		m.putIfAbsent(103, "Hello");
		System.out.println(m);
		
		// We can't replace Hello with For as 101 Hello not present
		m.replace(101, "Hello", "For");
		System.out.println(m);

	}
}
