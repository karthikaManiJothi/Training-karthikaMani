package com.onebill.training.assignment.array;

//import java.util.Arrays;

public class ArrayStringSorting {

	public static void main(String[] args) {
        String[] str = { "hi","i","am","karthika"};
        
        System.out.print("Original Array : ");
        for(String x:str) {
        	System.out.print(x+" ");
	    }
        System.out.println();
        
         //Arrays.sort(str);           
        
        for(int i=0;i<str.length;i++) {
        	for(int j=i+1;j<str.length;j++) {
        	   if(str[i].compareTo(str[j])>0) {
                 String temp =str[i];
                 str[i]=str[j];
                 str[j]=temp;
        	   }
        	}
        }
        
        System.out.print("Sorted Array : ");
        for(String x:str) {
        	System.out.print(x+" ");
	     }
	}
}
