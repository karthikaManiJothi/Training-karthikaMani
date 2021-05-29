package com.onebill.training.day9.handson;

import java.util.LinkedList;

public class StringLinkedList {

	public static void main(String[] args) {
		
     LinkedList<String> planguages =new LinkedList<String>();
     
     planguages.add("Java");
     planguages.add("html");
     planguages.add("python");            //add() -write
     planguages.add("c++");
     planguages.add("Ruby");
     
     System.out.println("List:"+planguages);  
     
     System.out.println(planguages.get(1));    // get() -read
     
     planguages.set(1, "SQL");                 // set() -rewrite
     System.out.println("List:"+planguages); 
	}

}
