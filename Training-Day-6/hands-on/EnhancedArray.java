package com.onebill.training.arrays;

public class EnhancedArray {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		int sum=0,avg;
		for(int i=0;i<10;i++) {
			sum+=num[i];
		}
		avg =sum/num.length;
		System.out.println(sum);
		System.out.println(avg);
		System.out.println();
		sum=0;
		
		for(int n:num) {
			sum+=n;
		}
		avg=sum/num.length;
		System.out.println(sum);
		System.out.println(avg);
	}

}
