package com.onebill.training.assignment.array;

public class MatrixAddition {

	public static void main(String[] args) {
     int matrix1[][]= {    
    		 {1,2,3},             // 3x3
    		 {1,2,3},
    		 {1,2,3}};
     int matrix2[][]= {
    		 {3,2,1},              // 3x3
    		 {3,2,1},
    		 {3,2,1} };
     
     int sum=0;
     System.out.println("Matrix Addition: ");
     for(int i=0;i<matrix1.length;i++) {
    	 for(int j=0;j<matrix2.length;j++) {
    		sum= matrix1[i][j]+matrix2[i][j];
    		System.out.print(" "+sum+" ");
    	  }
    	 System.out.println();
      }
	}

}
