//Program to demonstrate Vector methods
package com.tns.collections.list.builtinobjects;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	Vector<Integer>  vec = new Vector<Integer>();
	void insert(int a) {
		vec.add(a);
	}
	void display() {
		System.out.println("Vector is: "+vec);
	}
	void returnSize() {
		System.out.println("Size of Vector is : "+vec.size());
	}
	void contain(int a) {
		System.out.println(a+" is present in list: "+vec.contains(a));
	}
	void returnFirstElement() {
		System.out.println("First element of the Vector is: "+vec.firstElement());;
	}
	void returnLastElement() {
		System.out.println("Last element of the Vector is: "+vec.lastElement());
	}
	void delete(int a) {
		System.out.println("Remove first occourence of element "+a+": "+vec.removeElement(a));
	}
	void deleteIndex(int a) {
		try {
			System.out.println("Remove element at index "+a+" :"+vec.remove(a));
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	void iterate() {
		 Iterator<Integer> itr = vec.iterator();  
         while(itr.hasNext()){  
              System.out.println(itr.next());  
         }   
	}
	void sort() {
		 //Sorting the vector  
        Collections.sort(vec);  
	}
	@SuppressWarnings("unchecked")
	void duplicate() {
		 //clone the vector vec  
        Vector<Integer> vecclone = new Vector<Integer>();  
        vecclone = (Vector<Integer>) vec.clone();  
        //Print all the elements available in vecclone  
        System.out.println("Elements in vecclone vector are: ");                  
        for (Integer num : vecclone) {           
           System.out.println("Number = " + num);  
        }  
	}
	void clear() {
		vec.clear();
	}
}
