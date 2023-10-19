/*Program to demonstrate Hashtable*/
package com.tns.collections.map.map;

import java.util.Enumeration;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String args[]) {

		// Hashtable with String keys and String values
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("nitin123@gmail.com","Nitin");
		ht.put( "deepak123@gmail.com","Deepak");
	//	ht.put(null, "abc"); //RTE not allowed null Keys/values
		ht.put( "harish123@gmail.com","Harish");
	//	ht.put("abc@gmail.com", null);
		ht.put("ravi123@gmail.com","Ravi");
		System.out.println("\nHashtable with name and emailId");
		System.out.println(ht);

		
		  System.out.println("\nTraversing a Hashtable\n"); 
		  Enumeration em = ht.keys();
			while (em.hasMoreElements()) {
				String emailid = em.nextElement().toString();
		  System.out.println(emailid + " : " + ht.get(emailid)); }
		 

	}
}
