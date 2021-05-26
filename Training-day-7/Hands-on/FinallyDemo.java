package com.onebill.trainig.errors;

public class FinallyDemo {

	public static void main(String[] args) {
       try {
    	   int quotient =25/0;
    	   System.out.println(quotient);
       }catch(ArithmeticException e) {
    	   System.out.println("Divisible by zero is not possible");
       }finally {
    	   System.out.println("This is finally block");
       }
	}

}
