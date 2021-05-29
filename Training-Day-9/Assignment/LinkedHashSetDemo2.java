package com.onebill.training.assign.collections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetDemo2 {

	public static void main(String[] args) {
		LinkedHashSet<StudentClass> studentlist =new LinkedHashSet<>();
	      studentlist.add(new StudentClass(1,"Anusha",97));
	      studentlist.add(new StudentClass(2,"Abi",88));
	      studentlist.add(new StudentClass(3,"Yamuna",95));
	      studentlist.add(new StudentClass(4,"Karthika",90));
	      studentlist.add(new StudentClass(5,"Bhavana",89));
	      
	      for(StudentClass st:studentlist) {
	    	   System.out.println(st.getMarks());
	       }
	      
	      //converting to treeset
	      TreeSet<StudentClass> tree_set =new TreeSet<>(studentlist);
	      System.out.println("\nSorting:\n");
	      
	      for(StudentClass st:tree_set) {
	   	   System.out.println(st.getMarks());
	      }
	}

}
