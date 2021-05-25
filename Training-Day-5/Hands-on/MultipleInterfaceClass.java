package com.onebill.handson.exce;
interface MyInterfaceOne{
	void interface1();
}

interface MyInterfaceTwo{
	void interface2();
}
interface ImplementationOfInterface extends MyInterfaceOne,MyInterfaceTwo{
	void extendedImplementation();
}
class Implementation implements ImplementationOfInterface{

	@Override
	public void interface1() {
     System.out.println("implementation of interface1");		
	}

	@Override
	public void interface2() {
		System.out.println("implementation of interface2");		
	}

	@Override
	public void extendedImplementation() {
		System.out.println("implementation of extended");		
	}

	
	
}
public class MultipleInterfaceClass {

	public static void main(String[] args) {
      Implementation im =new Implementation();
      im.interface1();
      im.interface2();
      im.extendedImplementation();
	}

}
