package com.onebill.training.assign.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

    // put() method
    lhm.put(3, "well");
    lhm.put(2, "is");
    lhm.put(1, "all");

    // print mappings to the console
    //System.out.println("LinkedHashMap : " + lhm);
    
    //iterating
    Set<Map.Entry<Integer,String>> m1 =lhm.entrySet();
    
    for(Entry<Integer,String> entry: m1) {
  	  System.out.print(entry.getKey()+" : ");   // getKey() - to get keys
  	  System.out.println(entry.getValue());
	}

}
}
