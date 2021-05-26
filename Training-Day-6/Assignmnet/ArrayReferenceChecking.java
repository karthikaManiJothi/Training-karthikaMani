package com.onebill.training.assignment.array;

public class ArrayReferenceChecking {

	public static void main(String[] args) {
        int[] num1= {1,2,3,4,5,6,7,8,9,10};
        int[] num2=num1;
        System.out.println("Before Changing the reference num2 element values:");
        System.out.print("num1 elements: ");
        for(int i:num1) {
        	System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("num1 elements: ");
        for(int i:num2) {
        	System.out.print(i+" ");
        }
        System.out.println("\n");
        
        num2[2]=10;                      //changing
        System.out.println("After Changing the reference num2 element values:");
        System.out.print("num1 elements: ");
        for(int i:num1) {
        	System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("num1 elements: ");
        for(int i:num2) {
        	System.out.print(i+" ");
        }
	}

}
