package com.onebill.training.assign.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetImplementation {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhashset =new LinkedHashSet<>();
		
		lhashset.add(10);
		lhashset.add(20);
		lhashset.add(30);
		lhashset.add(null);
		lhashset.add(30);         // no duplicates allowed
		lhashset.add(null);       //possible to add null for 1 time
		
		 System.out.println(lhashset);
		
		 System.out.println("Size:"+lhashset.size());
	        
	     Iterator<Integer> iterator =lhashset.iterator();
	        while(iterator.hasNext()) {
	        	System.out.print(iterator.next()+" ");
	        }
	}

}
