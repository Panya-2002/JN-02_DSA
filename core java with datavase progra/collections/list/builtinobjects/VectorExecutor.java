//Program to demonstrate Vector Execution
package com.tns.collections.list.builtinobjects;

import java.util.Vector;

public class VectorExecutor {

	public static void main(String[] args) {
		VectorDemo vector = new VectorDemo();
		
		vector.display();
		vector.returnSize();
		
		
		  //Insertion 
		for (int i = 0; i<20; i=i+3) {
			vector.insert(i);
		}
		 
		 
		vector.display();
		
		vector.returnSize();				//return size
		vector.returnFirstElement();		//return first element
		vector.returnLastElement();			//return last element
		vector.contain(7);
		vector.delete(4);					//delete element 4
		vector.display();
		vector.deleteIndex(3);				//delete element in index 3
		vector.deleteIndex(11);
		vector.display();
		vector.sort();
		vector.display();
		vector.iterate();					//trsaverse the list
		vector.clear();
		vector.display();
		
		
		Vector<Integer>  vec = new Vector<Integer>();
		//insertion using looping
		for (int i = 0; i<20; i=i+3) {
			vec.add(i);
		}
		System.out.println(vec);
		

	}

}
