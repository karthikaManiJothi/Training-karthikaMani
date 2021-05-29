package com.onebill.training.day9.handson;

import java.util.ArrayList;
import java.util.Collections;

public class PersonArrayList {

	public static void main(String[] args) {
		
      ArrayList<Person> personlist =new ArrayList<Person>();
      
      personlist.add(new Person(25,"Rohan"));
      personlist.add(new Person(20,"Aswin"));
      personlist.add(new Person(30,"Bharath"));
      
      System.out.println(personlist);
      
      for(Person p: personlist) {
    	  System.out.println(p);
      }
      //sorting
      //personlist.sort(null);
      Collections.sort(personlist); 
      for(Person p: personlist) {
    	  System.out.println(p.getName());
      }
      }

}
