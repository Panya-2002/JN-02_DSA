//
package com.tns.collections.set.builtinobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=1;i<=20;i+=2)
			System.out.print(hs.add(i));
		System.out.println(hs);
		System.out.println(hs.add(10));
		System.out.println(hs);
		
		HashSet<Integer> hs1=new HashSet<Integer>();
		for(int i=11;i<=20;i++)
			hs1.add(i);
	
		System.out.println(hs1);
		
		hs.addAll(hs1); //SET UNION
		System.out.println(hs);
		
		hs.clear();
		for(int i=1;i<=20;i+=2)
			hs.add(i);
		
		hs.retainAll(hs1); //SET INTERSECTION
		System.out.println(hs);
		
		hs.clear();
		for(int i=1;i<=20;i+=2)
			hs.add(i);
		hs1.removeAll(hs); //SET DIFFERENCE
		System.out.println(hs1);
		hs.add(null);
		System.out.println(hs);
		
		//Collections.sort(hs);
		hs.clear();
		for(int i=1;i<=20;i+=2)
			hs.add(i);
		List<Integer> l1=new ArrayList<Integer>(hs);
		Collections.sort(l1);
		System.out.println(l1);
		hs.clear();
		hs=new HashSet<Integer>();
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		for(int i=1;i<=20;i+=2)
			lhs.add(i);
		lhs.add(90);
		lhs.add(18);
		System.out.println(lhs);
		
		System.out.println("---------------------------");
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(5);
		ts.add(12);
		ts.add(7);
		//ts.add("7");
		ts.add(null); //RTE
		
		System.out.println(ts);
	}

}
