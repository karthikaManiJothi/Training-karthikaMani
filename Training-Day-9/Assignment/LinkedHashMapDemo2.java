package com.onebill.training.assign.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class LinkedHashMapDemo2 {

	public static void main(String[] args) {
		 LinkedHashMap<EmployeeDemo,Integer> tm =new LinkedHashMap<EmployeeDemo,Integer>() ;
	     
	     // adding value to the TreeMap using put()
	     tm.put(new EmployeeDemo(1,"Bindhu"),1);
	     tm.put(new EmployeeDemo(2,"Archana"), 5);
	     tm.put(new EmployeeDemo(3,"Chaitra"),3);
	     
	     Set<Map.Entry<EmployeeDemo,Integer>> m1 =tm.entrySet();
	     
	     System.out.println("Before Sorting:\n");
	     for(Entry<EmployeeDemo,Integer> val :m1) {        //getting key 
	    	 System.out.println(val.getKey());
	     }
	     /*for(Entry<EmployeeDemo,Integer> val :m1) {      //getting value
	    	 System.out.println(val.getValue());
	     }*/
	     
	     System.out.println();
	     System.out.println("After Sorting:\n");
	     TreeMap<EmployeeDemo,Integer> treemap =new TreeMap<>(tm);
	     
	     Set<Map.Entry<EmployeeDemo, Integer>> m2 =treemap.entrySet();
	     
	     for(Entry<EmployeeDemo,Integer> val :m2) {        
	    	 System.out.println(val.getKey());
	     }
	}

}
