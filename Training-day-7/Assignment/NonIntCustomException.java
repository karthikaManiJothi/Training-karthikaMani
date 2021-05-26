package com.onebill.training.assignment.errors;

class NonIntResultException extends Exception{
	public NonIntResultException(String s) {
		super(s);
	}
}
public class NonIntCustomException {

	public static void main(String[] args) {
		int[] num = {4,8,-16,32,64,128,256,512};
        int[] deno= {2,0,4,4,0};
        try {
        for(int i=0;i<num.length;i++) {
        	try {
        		if(num[i]<0 || deno[i]<0) 
        			throw new NonIntResultException("Array has negative value");
        		else 
        		     System.out.println(num[i]+"/"+deno[i]+" is "+num[i]/deno[i]);
        		
        	 }catch(ArithmeticException e ) {
        		System.out.println("Cannot be divided by zero");
        	}catch(NonIntResultException e) {
        		System.out.println(e.getMessage());
        	}
        }
        	}catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("No matching denominator found");
            }
        	finally {
        		System.out.println("..completed..");
        	}
        }
        
	}


	

