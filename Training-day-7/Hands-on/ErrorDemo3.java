package com.onebill.trainig.errors;

public class ErrorDemo3 {

	public static void main(String[] args) {
		int[] numbers =new int[4];
	      try {
	    	  System.out.println("Before...");
	    	  numbers[5]=10;
	    	  System.out.println("After..");
	       }catch(ArithmeticException e) {
	    	   // catch block should have the same type of exception...
	    	  System.err.println("Index out of bound errors occured");
	    	  // e.printStackTrace();
	       }
	}

}
