package com.onebill.trainig.errors;

class FinalDemo{
	public static void generateException(int dem) {
		int[] nums =new int[2];
		try {
		switch(dem) {
		case 0: int answer =10/dem;       //divisible by zero
		        System.out.println(answer);
		        break;
		case 1: nums[3]=40;              // IndexOutOfBound error
		        break;
		case 2: System.out.println("no exceptions");
		        break;
		}
		}catch(ArithmeticException e) {
			System.out.println("Cannot divisible by zero");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array over run");
		}finally {
			System.out.println("...final loop completed..");
		}
	}
}

public class FinalErrorDemo {

	public static void main(String[] args) {
     for(int i=0;i<3;i++) {
    	 FinalDemo.generateException(i);
     }
	}

}
