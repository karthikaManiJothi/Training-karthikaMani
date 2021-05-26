package com.onebill.training.arrays;

public class Squares {

	public static void main(String[] args) {
     int[][] squares =new int[10][2];
     for(int i=0;i<10;i++) {
    	 for(int j=0;j<2;j++) {
    		 squares[i][0] = i+1;
    		 squares[i][1] =(i+1)*(i+1);
    		 }
     }
     for(int i=0;i<10;i++) {
    	 for(int j=0;j<2;j++) {
    		 System.out.print(squares[i][j]+" ");
    	 }
    	 System.out.println();	 
	}
     
}
}
