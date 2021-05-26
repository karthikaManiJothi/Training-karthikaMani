package com.onebill.training.string;

public class StringDemo {

	public static void main(String[] args) {
      String[] sample = {"This","is","a","test"};
      System.out.println("original Array");
      for(String s:sample) {
    	  System.out.print(s+" ");
      }
      System.out.println();
    	  
      sample[1]="was";
      sample[3]=sample[3].concat(",too!");
      System.out.println("Modified String");
      for(String s :sample) {
    	  System.out.print(s+" ");
      }
	}

}
