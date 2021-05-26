package com.onebill.training.assignment.array;

import java.util.Scanner;

public class ReversingArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array elements:");
        int n =sc.nextInt();
        int[] arr =new int[n];
        
        for(int i=0;i<n;i++) {
        System.out.print("Enter arr["+i+"]:");
        arr[i] =sc.nextInt();
        }
        System.out.print("Original Array: ");
        for(int x:arr) {
        	System.out.print(x+" ");
        }
        System.out.println();
        System.out.print("Reversed Array: ");
        for(int i=n-1;i>=0;i--) {
        	System.out.print(arr[i]+" ");
        }
        sc.close();
	}

}
