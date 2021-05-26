package com.onebill.training.assignment.array;

import java.util.Scanner;

public class ArrayDeletion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of array elements:");
        int n =sc.nextInt();
        int[] arr =new int[n];
        
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++) {
            arr[i] =sc.nextInt();
        }
        
        System.out.print("Enter the index to be deleted:");
        int pos =sc.nextInt();
        
        System.out.print("Before Deletion: ");
        for(int m :arr) {
        	System.out.print(m+" ");
        }
        System.out.println();
        
        int[] arr1 =new int[n-1];
        int count=0;
        for(int i=0;i<n;i++) {
        	if((i+1)==pos) {
        		continue;
        	}
        	else {
        		arr1[count]=arr[i];
        	}
        	count++;
        }
       
        System.out.print("After Deletion: ");
        for(int m :arr1) {
        	System.out.print(m+" ");
        }
        sc.close();
	}

}
