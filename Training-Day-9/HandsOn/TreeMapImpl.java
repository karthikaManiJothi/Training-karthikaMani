package com.onebill.training.day9.handson;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapImpl {

	public static void main(String[] args) {
		
	 // Creating TreeMap
     TreeMap<EmployeeDemo,Integer> tm =new TreeMap<EmployeeDemo,Integer>();
     
     // adding value to the TreeMap using put()
     tm.put(new EmployeeDemo(1,"Bindhu"),1);
     tm.put(new EmployeeDemo(2,"Archana"), 5);
     tm.put(new EmployeeDemo(3,"Chaitra"),3);
    
     Set<Map.Entry<EmployeeDemo,Integer>> m1 =tm.entrySet();
   
     for(Entry<EmployeeDemo,Integer> val :m1) {        //getting key 
    	 System.out.println(val.getKey());
     }
     for(Entry<EmployeeDemo,Integer> val :m1) {        //getting value
    	 System.out.println(val.getValue());
     }
	}

}
