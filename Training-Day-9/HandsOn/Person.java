package com.onebill.training.day9.handson;

public class Person implements Comparable<Person> {

	int id;
	String name; 
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
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
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	public int compareTo(Person o) {
		return o.id -this.id; //descending
		//return this.id -o.id //ascending
	}
	 public int hashCode() {
	      return this.id;
     }
	
	}



