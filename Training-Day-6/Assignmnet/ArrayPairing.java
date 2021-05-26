package com.onebill.training.assignment.array;

import java.util.Scanner;

public class ArrayPairing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of array elements:");
        int n =sc.nextInt();
        int[] arr =new int[n];
        
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++) {
            arr[i] =sc.nextInt();
        }
        
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		if(arr[i]+arr[j]==10) {
        			System.out.println("Pairs whose sum is 10: "+arr[i]+" "+arr[j]);
        		}
        	}
        }
        sc.close();
	}

}
