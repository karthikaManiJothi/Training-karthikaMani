package com.onebill.training.arraylist;
import java.util.*;

public class ArrayListClass {

	public static void main(String[] args) {
      ArrayList<Integer> arrayList =new ArrayList<Integer>();
      arrayList.add(10);
      arrayList.add(30);
      arrayList.add(50);
      arrayList.add(70);
      arrayList.add(90);
      
      System.out.println("-------using for loop------");
      for(int i=0;i<arrayList.size();i++) {
    	  System.out.println(arrayList.get(i));
      }
      
      System.out.println("-------using for each-----");
      for(Integer i :arrayList) {
    	  System.out.println(i);
      }
      
     System.out.println(".....Iterator........");
     Iterator<Integer> iterator =arrayList.iterator();
     while(iterator.hasNext()) {
    	 System.out.println(iterator.next());
     }
     
     System.out.println("----- List Iterator....");
     ListIterator<Integer> listiterator =arrayList.listIterator();
     while(listiterator.hasNext()) {
    	 System.out.println(listiterator.next());
     }
     
     System.out.println("----- List Previous Iterator....");
     ListIterator<Integer> listiteratorprevious =arrayList.listIterator(arrayList.size());
     while(listiteratorprevious.hasPrevious()) {
    	 System.out.println(listiteratorprevious.previous());
     }
	}

}
