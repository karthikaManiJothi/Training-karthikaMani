package com.onebill.handson.staticexec;


class Employee{
	int empId;
	String empName;
	static String companyName ="Onebill";
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	void display() {
	System.out.println(empId+ " "+empName+" "+companyName);
  }
}
public class StaticMemberDemo {

	public static void main(String[] args) {
        Employee emp1 = new Employee(111,"karthika");
        Employee emp2 =new Employee(222,"Mani");
        emp1.display();
        Employee.companyName ="Accenture";
        emp2.display();
	}

}
