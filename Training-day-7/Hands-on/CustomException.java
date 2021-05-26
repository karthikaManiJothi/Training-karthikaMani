package com.onebill.trainig.errors;

class NewCustomException extends Exception{
	public NewCustomException(String s)
	{
		super(s);
		System.out.println(s);
	}
}
public class CustomException {
	
     public static void main(String[] args)  {
    	  try{
				throw new NewCustomException("new Exception class ");
		   }catch (NewCustomException ex){
					System.out.println(ex.getMessage());
		    }
	}
}


