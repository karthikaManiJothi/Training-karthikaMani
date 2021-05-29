package com.onebill.training.day9.handson;

import java.util.List;
import java.util.ArrayList;

public class ArrayListGetSet {

	public static void main(String[] args) {
       ArrayList<Integer> arrayList =new ArrayList<Integer>();
       arrayList.add(20);
       arrayList.add(10);
       arrayList.add(2,30);
       arrayList.add(3,40);
       
       System.out.println(arrayList);
       
       //performing set operation - to replace a value in the ArrayList
       System.out.println("Set Operation");
       arrayList.set(2,90);   
       System.out.println(arrayList);
       
       // creating sublist
       List<Integer> sublist =arrayList.subList(0, 3);
       System.out.println("SubList:"+sublist);
       
       //finding array size
       System.out.println(arrayList.size());
       System.out.println(sublist.size());
       
       //containsAll() operation -return boolean value
       System.out.println(arrayList.containsAll(sublist));
       
       //ArrayList Sorting
       System.out.println("Before Sorting:"+arrayList);
       arrayList.sort(null);
       System.out.println("Sorted Array:"+arrayList);
       
       System.out.println(arrayList.subList(1, 3));
       
       //indexOf()
       System.out.println(arrayList.indexOf(90));
       System.out.println(arrayList.indexOf(new Integer(40)));
	}

}
