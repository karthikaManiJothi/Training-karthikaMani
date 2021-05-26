package com.onebill.trainig.errors;

class ExceptionTest{
	static void generateException() {
		 int[] numbers =new int[4];
	     System.out.println("Before Exception...");
	     numbers[5]=10;
	     System.out.println("this wont be displayed");
	}
}
public class ErrorDemo2 {

	public static void main(String[] args) {
      try {
    	  ExceptionTest.generateException();
      }catch(Exception e) {
    	  System.out.println("Index out of bounds");
      }
      System.out.println("Completed execution....");
      System.out.println("other business logic");
	}

}
