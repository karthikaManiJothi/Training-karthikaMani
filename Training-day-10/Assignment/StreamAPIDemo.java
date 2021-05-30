package com.onebill.training.day10.exec;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo {

	public static void main(String[] args) {
   
		List<Integer> list =Arrays.asList(10,20,33,45,51,60,72,84,97,100);
		
		// forEach 
		System.out.print("\nList :");
		list.stream().forEach(i ->System.out.print(i+" "));
		
		// adding 2 to each value in the list and printing - using forEach
		System.out.println("\n\n-----map and collect and forEach------");
		list.stream().map(i -> i+2).collect(Collectors.toList()).forEach(System.out::println);
		
		// filter which is divisible by 2 and provide sum of it
		System.out.println("-------filter and reduce-------");
		System.out.println(list.stream().filter(i ->i%2 ==0).reduce((a,b) -> a+b).get());
		
		
		//finding the first occurrence of the number which is divisible by 10
		System.out.println("--------findFirst  and orElse-----");
	    System.out.println(list.stream().filter(i -> i%10 ==0).findFirst().orElse(0));
	    
	    
	    System.out.println("------list  with values greater than 50-----");
	    System.out.println(list.stream().filter(i -> i>50).collect(Collectors.toList()));
	    
	    System.out.println("------Max of List---------");
	    System.out.println(list.stream().max((i,j) -> i.compareTo(j)).get());
	    
	    System.out.println("------Min of  list---------");
	    System.out.println(list.stream().min((i,j) -> i.compareTo(j)).get());
		}

}
