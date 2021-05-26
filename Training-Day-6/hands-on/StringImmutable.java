package com.onebill.training.string;

/*one reference variable of a string changes the value of the object,
it will be affected to all the reference variables */

public class StringImmutable {
    
	public static void main(String[] args) {
       String s1="Hello";
       s1.concat("user");
       System.out.println(s1);   //output :Hello -immutable 
       
       s1 =s1.concat(" user");    //explicitely assign it to the reference variable    
       System.out.println(s1);   // output :Hello user
	}

}
