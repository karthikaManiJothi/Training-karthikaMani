package com.onebill.training.assignment.errors;

import java.util.Scanner;

class WrongGuessException extends Exception{           //CustomException
	public WrongGuessException(String s) {
		super(s);
	}
}
class Rethrowing{
	int answer = 4;
	public void check(int number) throws WrongGuessException {
		try {
		     if(number==answer) 
			       System.out.println("you guessed correctly!");
		     else 
			       throw new WrongGuessException("Wrongly guessed!");
		}catch(WrongGuessException e) {
			System.out.println("rethrowing..");          
			throw e;                                       //rethrow
		}
	}
}
public class Rethrow {

	public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     Rethrowing rethrow =new Rethrowing();
     System.out.print("Enter a number (within 1-9):");
     int number =sc.nextInt();
     
     try {
         rethrow.check(number);
     }catch(Exception e) {
    	 System.out.println(e.getMessage());
       }
     
	}

}
