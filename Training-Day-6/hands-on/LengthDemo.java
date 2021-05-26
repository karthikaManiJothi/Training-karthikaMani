package com.onebill.training.arrays;

public class LengthDemo {

	public static void main(String[] args) {
       int[] list =new int[10];
       int[] num = {1,2,3};
       int[][] table = {
    		   {1,2,3},
    		   {4,5},
    		   {6,7,8,9}
       };
       System.out.println("length of list:"+list.length);
       System.out.println("num length :"+num.length);
       System.out.println("table length :"+table.length);
       System.out.println("table[0] length :"+table[0].length);
       System.out.println("table[0] length :"+table[1].length);
       System.out.println("table[0] length :"+table[2].length);
	}

}
