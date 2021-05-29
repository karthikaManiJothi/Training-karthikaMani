package com.onebill.training.day9.handson;


public class PersonTreeSet {//implements Comparable<PersonTreeSet>{
    int id;
    String p1_name;
    String p2_name;
    
	public PersonTreeSet(int id, String p1_name, String p2_name) {
		this.id = id;
		this.p1_name = p1_name;
		this.p2_name = p2_name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getP1_name() {
		return p1_name;
	}
	public void setP1_name(String p1_name) {
		this.p1_name = p1_name;
	}
	public String getP2_name() {
		return p2_name;
	}
	public void setP2_name(String p2_name) {
		this.p2_name = p2_name;
	}

	@Override
	public String toString() {
		return "PersonTreeSet [id=" + id + ", p1_name=" + p1_name + ", p2_name=" + p2_name + "]";
	}

	

	/*@Override
	public int compareTo(PersonTreeSet o) {
		return this.p1_name.compareTo(o.p1_name);
	}
	*/
	
     
}
