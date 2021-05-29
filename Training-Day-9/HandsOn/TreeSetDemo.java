package com.onebill.training.day9.handson;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
       TreeSet<Integer> treeset =new TreeSet<Integer>();
       
       treeset.add(100);
       treeset.add(50);
       treeset.add(10);
       treeset.add(10);     // no duplicates allowed
       treeset.add(30);
       //treeset.add(null); //null not allowed
       System.out.println(treeset);
       
       System.out.println("Size:"+treeset.size());
       
       Iterator<Integer> iterator =treeset.iterator();
       while(iterator.hasNext()) {
       	System.out.print(iterator.next()+" ");
       }
	}

}
