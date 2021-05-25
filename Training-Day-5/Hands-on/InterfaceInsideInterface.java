package com.onebill.handson.exce;

 // demonstrating interface class inside interface class
interface Outer{
  interface Inner{
	void showInnerInterface();
}
  void showOuterInterface();
}

class Demo implements Outer.Inner, Outer{

	@Override
	public void showOuterInterface() {
    System.out.println("Implememtation for showOuterInterface");		
	}

	@Override
	public void showInnerInterface() {
     System.out.println("display showInnerInterface");		
	}
	
}
public class InterfaceInsideInterface {

	public static void main(String[] args) {
      Demo demo =new Demo();
      demo.showOuterInterface();
      demo.showOuterInterface();
	}

}
