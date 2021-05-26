package com.onebill.training.assignment.array;

//import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntegerSorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of array elements:");
        int n =sc.nextInt();
        int[] arr =new int[n];
        int temp;
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++) {
            arr[i] =sc.nextInt();
        }
        
        System.out.print("Original Array : ");
        for(int x:arr) {
        	System.out.print(x+" ");
	     }
        System.out.println();
         
        //Arrays.sort(arr);
        
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        	 if(arr[i]>arr[j]) {
        		temp=arr[i];
        		arr[i]=arr[j];
        		arr[j]=temp;
        		}
        	}
        }
           
        System.out.print("Sorted Array : ");
        for(int x:arr) {
        	System.out.print(x+" ");
	     }
        sc.close();
	}
}
