package com.onebill.training.assignment.array;

import java.util.Arrays;

public class SecondSmallestAndLargestArrayElement {

	public static void main(String[] args) {
        int[] arr ={44,66,99,77,33,22,55}; 
        System.out.print("Array: ");
        for(int i:arr) {
        	System.out.print(i+" ");
        }
        Arrays.sort(arr);
        
        System.out.println();
        System.out.println("Second Smallest Number: "+arr[1]);
        System.out.println("Second largest Number: "+arr[arr.length-2]);
        
        
	}

}
