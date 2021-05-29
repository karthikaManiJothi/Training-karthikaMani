package com.onebill.training.day9.handson;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
       LinkedList<Integer> list =new LinkedList<Integer>();
       list.add(90);
       list.add(30);
       list.add(35);
       list.add(20);
       
       //printing LinkedList
       System.out.println(list);
       
       //adding the value with respect to index
       System.out.println("-----add with Index----");
       list.add(0,100);
       list.add(1,80);
       
       System.out.println(list);
        
       //removing the value -by index
       System.out.println("---remove(index) and remove(object)----");
       list.remove();
       System.out.println(list);
       
       list.remove(3);
       list.remove(new Integer(30));
       System.out.println(list);
       
       //Changing the value 
       System.out.println("----set a index-------");
       list.set(1, 75);
       System.out.println(list);
       
       list.add(99);
       list.add(10);
       System.out.println(list);
       
       System.out.println("-----containsAll-------");
       LinkedList<Integer> ls= new LinkedList<Integer>();
       ls.add(100);
       ls.add(99);
       
       System.out.println(list);
       System.out.println(ls);
       System.out.println("------contains all-----");
       System.out.println(list.containsAll(ls));
       
       System.out.println("-----addLast()------");
       ls.addLast(1000);
       System.out.println(ls);
       
       System.out.println("------addFirst()-----");
       ls.addFirst(1);
       System.out.println(ls);
       
       
       
	}

}
