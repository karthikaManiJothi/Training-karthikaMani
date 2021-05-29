package com.onebill.training.assign.collections;

import java.util.*;

 class StudentClass implements Comparable<StudentClass> {

	int id;
	String name;
	int marks;
	public StudentClass(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentClass [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(StudentClass o) {
		return this.marks-o.marks;
		
	}
	/*@Override
	public int compare(StudentClass o1, StudentClass o2) {
		return o1.marks -o2.marks;
	}*/
	
	/*@Override
	public int compareTo(StudentClass o) {
		return this.name.compareTo(o.name);
		
	}*/
	

	
	
	

}
