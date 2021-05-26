package com.onebill.trainig.errors;

public class ErrorDemo1 {

	public static void main(String[] args) {
      int[] numbers =new int[4];
      try {
    	  System.out.println("Before...");
    	  numbers[5]=10;
    	  System.out.println("After..");
       }catch(Exception e) {
    	  System.err.println("Index out of bound errors occured");
    	  // e.printStackTrace();
       }
	}

}
