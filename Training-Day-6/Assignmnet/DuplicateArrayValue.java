package com.onebill.training.assignment.array;

import java.util.Scanner;

public class DuplicateArrayValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of array elements:");
        int n =sc.nextInt();
        int[] arr =new int[n];
        
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++) {
            arr[i] =sc.nextInt();
        }
        
        System.out.print("Array : ");
        for(int x:arr) {
        	System.out.print(x+" ");
	     }
        System.out.println();
         
        System.out.print("Duplicate numbers : ");
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		if(arr[i]==arr[j]) {
        			System.out.print(arr[i]+" ");
        		}
        	}
        }
        
       sc.close();
	}
}
