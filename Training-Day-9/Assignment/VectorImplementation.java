package com.onebill.training.assign.collections;

import java.util.List;
import java.util.Vector;

/*similar to the ArrayList, but with two differences-
  1.Vector is synchronized.
  2.contains many legacy methods
 (that are not the part of a collections framework)..
*/
public class VectorImplementation {

	public static void main(String[] args) {
		
     //vector Implementation
		Vector<Integer> vector = new Vector<Integer>(2); 
		
		System.out.println("capacity:"+vector.capacity()); 
		vector.add(10);                      //1.add(int)
		vector.add(0, 20);                   //2.add(index,int)
		vector.add(30);
		vector.add(3,40);
		vector.addElement(60);               //3.addElement()
		System.out.println(vector);
		
		vector.add(4,50);
		System.out.println(vector);
		
		vector.set(0, 10);                   //4.set(index,value)
		vector.setElementAt(20, 1);          //5.setElementAt(value,index)
		
		System.out.println("Capacity:"+vector.capacity());
		
		System.out.println(vector);
		System.out.println("Size:"+vector.size()); //6.size()
		 
	    vector.setSize(10);                         //7.setSize()
	    System.out.println("setSize:"+vector);
	    System.out.println("Size:"+vector.size());
	    System.out.println("Capacity:"+vector.capacity());
	    
	    vector.remove(5);                         //8.remove()
	    vector.remove(8);
	    System.out.println("After Remove operation on index 5 and 8:"+vector);
	    vector.removeElement(50);                 //9.removeElement()
	    System.out.println(vector);   
	    
	    //vector.removeAllElements();            //10.removeAllElements()
	    //vector.removeElementAt(0);             //11.removeElementAt()
	    
	    System.out.println(vector.elementAt(0)); //12.elementAt()
	    
	    System.out.println(vector);
	    System.out.println("firstElement:"+vector.firstElement()); //13.firstElement()
	    System.out.println("lastElement:"+vector.lastElement());   //14.lastElement()
	    //vector.trimToSize();
	    
	    System.out.println(vector);
	    
	    //System.out.println("capacity:"+vector.capacity());	 // 15.capacity() -default 10 
	    
	    List<Integer> sublist =vector.subList(0, 4);  //16. subList()
	    System.out.println(vector.containsAll(sublist)); //17.containsAll()
	    /*vector.set(2, 50);
	    System.out.println(vector);
	    vector.sort(null);
	    System.out.println(vector);*/
	}

}
