package com.onebill.training.day9.handson;

import java.util.TreeSet;

public class TreeSetImp1 {

	public static void main(String[] args) {
      TreeSet<PersonTreeSet> ts =new TreeSet<>(new SortByPersonName());
      
      ts.add(new PersonTreeSet(26,"Rahul","good"));
      ts.add(new PersonTreeSet(27,"Kiran","moderate"));
      ts.add(new PersonTreeSet(25,"Aryan","always angry"));
      ts.add(new PersonTreeSet(24,"Bhaskar","best"));
      
      for(PersonTreeSet p:ts) {
    	  System.out.println(p.id+" "+p.p1_name+" "+p.p2_name);
      }
	}

}
