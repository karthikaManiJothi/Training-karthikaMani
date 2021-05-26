package com.onebill.training.assignment.array;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int matrix1[][]= {    
	    		 {1,2,3},             // 3x3
	    		 {1,2,3},
	    		 {1,2,3}};
	     int matrix2[][]= {
	    		 {3,2,1},              // 3x3
	    		 {3,2,1},
	    		 {3,2,1} };
	     
	     int m =matrix1.length;
	     int n=matrix2.length;
	     int c[][]=new int[m][n];
	     System.out.println("Matrix Multiplication: ");
	     for(int i=0;i<m;i++) {
	    	 for(int j=0;j<n;j++) {
	    		       
	    		 for(int k=0;k<m;k++)      
	    		 {      
	    		 c[i][j]+=matrix1[i][k]*matrix2[k][j];      
	    		 }
	    		 System.out.print(c[i][j]+" ");  
	    	 }
	    	 System.out.println();
	      }
	   }
  }
