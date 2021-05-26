package com.onebill.training.arrays;

//2D Arrays

public class TwoDArrays {

  public static void main(String[] args) {
     int[][] table =new int[3][4]; //3 rows and 4 columns
     int i,j;
     for(i=0;i<3;i++) {
    	 for(j=0;j<4;j++) {
    		 System.out.print(table[i][j]+" ");
    	 }
        System.out.println();
     }
  }

}
