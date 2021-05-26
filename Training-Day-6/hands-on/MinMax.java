package com.onebill.training.arrays;

public class MinMax {

	public static void main(String[] args) {
		
      int[] numbers =new int[5];
      int min,max;
      
      numbers[0]=99;
      numbers[1]=0;
      numbers[2]=-9;
      numbers[3]=999;
      
      min=max=numbers[0];
      
      for(int i=0;i<=4;i++) {
    	  if(numbers[i]<min)
    		  min=numbers[i];
    	  if(numbers[i]>max)
    		  max =numbers[i];
      }
     System.out.println("Min and Max Values are:"+min+" and "+max);
      
	}

}
