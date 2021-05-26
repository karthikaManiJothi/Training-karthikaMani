package com.onebill.training.arrays;

import java.util.Arrays;

public class JaggedArray {

 public static void main(String[] args) {
     int[][] arr= new int[3][];
     arr[0]=new int[] {1,2,3};
     arr[1]=new int[] {4,5,6,7};
     arr[2] =new int[] {8,9};
     
     for(int[] i:arr) {
	    System.out.println(Arrays.toString(i));
     }
  }
}
