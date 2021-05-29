package com.onebill.training.day9.handson;

import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
		
	  //creating String arrayList
      ArrayList<String> arrayString =new ArrayList<String>();
      arrayString.add("welcome");
      arrayString.add("to");
      arrayString.add("Onebill");
      
      //creating String array
      String[] stringarray =new String[arrayString.size()];
      
      // converting string ArrayList to string Array
      for(int i=0;i<arrayString.size();i++) {
    	  stringarray[i]=arrayString.get(i);
      }
      
      for(String s :stringarray) {
    	  System.out.print(s+" ");
      }
	}

}
