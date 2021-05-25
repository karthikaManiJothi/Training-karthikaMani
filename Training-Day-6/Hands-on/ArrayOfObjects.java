package com.onebill.training.arrays;

class Student{
	int rollno;
	String sname;
	public Student(int rollno, String sname) {
		super();
		this.rollno = rollno;
		this.sname = sname;
	}
	
}
public class ArrayOfObjects {

	public static void main(String[] args) {
         Student[] arr =new Student[3];
         arr[0]= new Student(1,"karthi");
         arr[1]=new Student(2,"kavin");
         arr[2] =new Student(3,"Dhoni");
         for(int i=0;i<arr.length;i++) {
        	 System.out.println(arr[i].rollno+ " "+arr[i].sname);
         }
	}

}
