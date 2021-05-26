package com.onebill.trainig.errors;

public class ThrowException {

	public static void main(String[] args) {
       try {
    	   System.out.println("before exception");
    	   throw new ArithmeticException();
       }catch (ArithmeticException e) {
    	   System.out.println("Airthmetic Exception");
       }
       System.out.println("Completed..");
	}

}
