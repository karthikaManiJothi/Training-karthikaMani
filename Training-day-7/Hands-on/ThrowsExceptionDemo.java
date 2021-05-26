package com.onebill.trainig.errors;

import java.util.Scanner;

class ThrowsExample{
	int division(int num, int den)throws ArithmeticException{
		 int quo=num/den;
		 System.out.println("Quotient is :"+quo);
		 return quo;
	}
}

public class ThrowsExceptionDemo {

	public static void main(String[] args) {
       ThrowsExample obj =new ThrowsExample();
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter numerator:");
       int num =sc.nextInt();
       System.out.println("Enter Denominator");
       int den =sc.nextInt();
       try {
       obj.division(num,den);}
       catch(Exception e) {
    	   System.out.println("Divisible by zero not possible");
       }
       sc.close();
	}

}
