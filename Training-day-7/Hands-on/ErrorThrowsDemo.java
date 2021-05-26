package com.onebill.trainig.errors;

import java.io.IOException;

public class ErrorThrowsDemo {
	
    public static char prompt(String str) throws IOException{
    	System.out.println(str);
    	return (char) System.in.read();
    }
	
	public static void main(String[] args) {
         char ch;
         try {
        	 ch =prompt("Enter a letter: ");
         }catch(IOException e) {
        	 System.out.println("IOException");
        	 ch='x';
         }
         System.out.println("you entered:"+ch);
	}

}
