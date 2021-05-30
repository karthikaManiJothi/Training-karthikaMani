package com.onebill.training.day10.handson;

import java.util.Arrays;
import java.util.List;

//import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
    
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		 
		System.out.println("----for loop-----");
		for(int i=0;i<values.size();i++) {
			System.out.println(values.get(i));
		}
		
		System.out.println("----enhanced for loop----");
		for(int i : values) {
			System.out.println(i);
		}
		System.out.println("-----forEach-----");
		values.forEach(i->System.out.println(i));
		
		System.out.println("-----Stream-----");
		values.stream().forEach(System.out :: println);
				
	   
	}

}
