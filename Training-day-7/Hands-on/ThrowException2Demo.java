package com.onebill.trainig.errors;

public class ThrowException2Demo {
	
    static void validate(int age) {
    	if(age<18) 
    		throw new ArithmeticException("Age not valid");
        else 
    	    System.out.println("Welcome to vote!!");
    
    }
	public static void main(String[] args) {
		try {
             validate(14);
		}catch(ArithmeticException e) {
			System.out.println("Not eligible to vote !!!");
		}
        System.out.println("Other business logic..");
	}

}
