//Program to demonstrate ArrayList Execution

package com.tns.collections.list.builtinobjects;
import java.util.ArrayList;
import java.util.List;

public class Executor {

	public static void main(String[] args) {
		
		List list1 = new ArrayList();// creates empty raw ArrayList (allows heterogeneous elements)
		System.out.println("Size : "+list1.size());
		System.out.println("Is list empty? "+list1.isEmpty());
		System.out.println("List is "+list1);
		list1.add(10);
		list1.add(20);
		list1.add(true);
		list1.add(false);
		list1.add(20);
		list1.add("Hello");
		list1.add(56.78);
		list1.add(20);
		list1.add('A');
		list1.add(5, "Hi");
		list1.add(20);
		System.out.println("List is "+list1);
		System.out.println("Size : "+list1.size());
		System.out.println("Element at 5 location is : "+list1.get(5));
		//System.out.println("Element removed "+list1.remove(16)); //RTE
		System.out.println("Element removed "+list1.remove(10));
		System.out.println("Element removed "+  list1.remove(list1.indexOf(10)));
		System.out.println("List is "+list1);
		
		  System.out.println("Element removed : "+list1.remove(list1.lastIndexOf(20)));
		  // remove 20 (last occurrence)
		  System.out.println("Element removed : "+list1.remove(list1.indexOf(20))); 
		  //	  remove 20 (first occurrence) 
		  System.out.println("List is "+list1);
		  
		  list1.clear(); System.out.println("List is "+list1);
		  
		  ArrayListDemo al = new ArrayListDemo();
		  
		  //insertion 
		  al.insert(10); al.insert(20); al.insert(50); al.insert(70);
		  al.insert(30); al.insert(80); al.insert(5);
		
		  al.print(); //to display ś
		  al.contains(15); //Check 15 is present in the list	  or not
	 
		  al.remove(5); al.print(); al.reverse();
		  
		  //Sorting 
		  al.sortAscending(); 
		  al.sortDescending();
		  
		  //traverse 
		  al.traverse(); 
		  al.traverseReverse();
		 
			
	}


}
