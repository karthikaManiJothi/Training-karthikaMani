package com.onebill.training.assign.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetWithStudentImplementation {

	public static void main(String[] args) {
      HashSet<StudentClass> studentlist =new HashSet<>();
      studentlist.add(new StudentClass(1,"Anusha",97));
      studentlist.add(new StudentClass(2,"Abi",89));
      studentlist.add(new StudentClass(3,"Yamuna",95));
      studentlist.add(new StudentClass(4,"Karthika",90));
      studentlist.add(new StudentClass(5,"Bhavana",85));
    
       for(StudentClass st:studentlist) {
    	   System.out.println(st.getMarks()+" "+st.getName());
       }
       
      TreeSet<StudentClass> tree_set =new TreeSet<>(studentlist);
      System.out.println("\nSorting:\n");
      for(StudentClass st:tree_set) {
   	   System.out.println(st.getMarks()+" "+st.getName());
      }
	}

	
}
