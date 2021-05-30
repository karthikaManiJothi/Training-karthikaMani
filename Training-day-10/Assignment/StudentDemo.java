package com.onebill.training.day10.exec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SortByName implements Comparator<Student>{      // sort by name

	@Override
	public int compare(Student o1, Student o2) {
		return o1.sname.compareTo(o2.sname);
	}
}

class SortById implements Comparator<Student>{       // sort by id

	@Override
	public int compare(Student o1, Student o2) {
		return o1.sid-o2.sid;
	}
}

class SortByAge implements Comparator<Student>{     // sort by age

	@Override
	public int compare(Student o1, Student o2) {
		return o1.age - o2.age;
	}
}

class SortByMarks implements Comparator<Student>{    // sort by marks

	@Override
	public int compare(Student o1, Student o2) {
		return o1.marks - o2.marks;
	}
	
}


public class StudentDemo {

	public static void main(String[] args) {
		
	 Scanner sc =new Scanner(System.in);
		
     ArrayList<Student> studentlist =new ArrayList<>();
     studentlist.add(new Student(2,"Karthi",21,90));
     studentlist.add(new Student(1,"Youasri",20,88));
     studentlist.add(new Student(5,"Anusha",23,99));
     studentlist.add(new Student(7,"Bhavana",20,90));
     studentlist.add(new Student(4,"Sundeep",25,85));
     studentlist.add(new Student(9,"Dhanush",22,97));
     studentlist.add(new Student(3,"Reshma",23,79));
     studentlist.add(new Student(6,"Monika",24,93));
     studentlist.add(new Student(10,"Abitha",23,96));
     studentlist.add(new Student(8,"Kaviya",24,94));
    
     System.out.println("Sort By: \n1.Name\n2.Id\n3.Age\n4.Marks");
     System.out.print("Enter your Choice:");
     int choice =sc.nextInt();
     
     switch(choice){
     
     case 1:
    	 System.out.println("\nSorting by Name:\n");
    	 Collections.sort(studentlist,new SortByName());
         break;
     case 2:
    	 System.out.println("\nSorting by Id:\n");
    	 Collections.sort(studentlist,new SortById());
    	 break;
     case 3:
    	 System.out.println("\nSorting by Age:\n");
    	 Collections.sort(studentlist,new SortByAge());
    	 break;
     case 4:
    	 System.out.println("\nSorting by Marks:\n");
    	 Collections.sort(studentlist,new SortByMarks());
    	 break;
     default:
    	 System.out.println("\nWrong Choice!");
    	 System.exit(0);
     }
     
     for(Student stu :studentlist) {
    	 System.out.println(stu.getSid()+" "+stu.getSname()+"  "+stu.getAge()+" "+stu.getMarks());
     }
     sc.close();
  }

}
