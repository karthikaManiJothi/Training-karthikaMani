package com.onebill.handson.staticexec;

class Employee1{
	int empId;
	String empName;
	static String companyName="onebill";
	static void ChangeName() {
		companyName ="Accenture";
	}
	public Employee1(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	void display() {
	System.out.println(empId+ " "+empName+" "+companyName);
  }
}
public class StaticMethodDemo {

	public static void main(String[] args) {
		Employee1 emp1 = new Employee1(111,"karthika");
        Employee1 emp2 =new Employee1(222,"Mani");
        emp1.display();
        Employee1.ChangeName();
        emp2.display();
	}

}
