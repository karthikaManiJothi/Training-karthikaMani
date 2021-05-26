package com.onebill.trainig.errors;

public class ErrorDemo4 {

	public static void main(String[] args) {
        int[] numb = {4,8,16,32,64,128,256,512};
        int[] demo= {2,0,4,4,0};
        for(int i=0;i<numb.length;i++) {
        	try {
        		System.out.println(numb[i]+"/"+demo[i]+" is "+numb[i]/demo[i]);
        		
        	}catch(ArithmeticException e ) {
        		System.out.println("Cannot be divided by zero");
        	}catch(ArrayIndexOutOfBoundsException e) {
        		System.out.println("Index out of bound exception");
        	}catch(Exception e) {
        		System.out.println("General Exception");
        	}
        }
	}

}
