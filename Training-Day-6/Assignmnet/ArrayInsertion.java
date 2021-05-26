package com.onebill.training.assignment.array;

import java.util.Scanner;

public class ArrayInsertion {

	public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of array elements:");
            int n =sc.nextInt();
            int[] arr =new int[n];
            
            for(int i=0;i<n;i++) {
            System.out.print("Enter arr["+i+"]:");
            arr[i] =sc.nextInt();
            }
            
            
            System.out.println("Enter the position and number to be inserted:");
            int pos =sc.nextInt();
            int number=sc.nextInt();
            
            System.out.print("Before Insertion: ");
            for(int m :arr) {
            	System.out.print(m+" ");
            }
            System.out.println();
            
            arr[pos-1]=number;
            System.out.print("After Insertion : ");
            for(int m :arr) {
            	System.out.print(m+" ");
            }
            sc.close();
     }

}
