package com.onebill.training.day10.handson;

import java.util.Optional;

public class OptinalExample2 {
	
	public Integer sum(Optional<Integer> a,Optional<Integer> b) {
		System.out.println("First parameter is :"+a.isPresent());
		System.out.println("Second parameter is :"+b.isPresent());
		
		Integer firstvalue =a.orElse(new Integer(0));
		Integer secondvalue =b.get();
		return firstvalue+secondvalue;
		
		//returns the value if present or else it will return the default value
		}

	 public static void main(String[] args) {
      
		OptinalExample2 opemp =new OptinalExample2();
		Integer value1 =null;
		Integer value2 =new Integer(10);
		
		Optional<Integer> val1 = Optional.ofNullable(value1);
		Optional<Integer> val2 = Optional.of(value2);
		
		System.out.println("Sum :"+ opemp.sum(val1,val2));
	}

}
