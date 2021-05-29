package com.onebill.training.assign.collections;

//import java.util.Comparator;

public class EmployeeDemo implements Comparable<EmployeeDemo>  {
	 int emp_id;
	 String emp_name;
	public EmployeeDemo(int emp_id, String emp_name) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	@Override
	public String toString() {
		return "EmployeeDemo [emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
	}
	
	@Override
	public int compareTo(EmployeeDemo o) {
		return this.emp_name.compareTo(o.emp_name);
	}
	
	/*class SortByEmployeeName implements Comparator<EmployeeDemo>{
	@Override
	public int compare(EmployeeDemo o1, EmployeeDemo o2) {
		return o1.emp_name.compareTo(o2.emp_name);
	}
	}*/
}
