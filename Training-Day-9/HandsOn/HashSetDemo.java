package com.onebill.training.day9.handson;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
        HashSet<Integer> hs =new HashSet<Integer>();
        hs.add(500);
        hs.add(100);
        hs.add(null);
        hs.add(100);  //no duplicates value allowed
        hs.add(200);
        hs.add(300);
        hs.add(null);  //possible to add null for 1 time
       // hs.remove(null);
        
        System.out.println(hs);
        System.out.println("Size:"+hs.size());
        
        Iterator<Integer> iterator =hs.iterator();
        while(iterator.hasNext()) {
        	System.out.print(iterator.next()+" ");
        }
	}

}
