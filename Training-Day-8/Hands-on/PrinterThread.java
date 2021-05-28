package com.onebill.training.threads;


class Printer{
	synchronized void printDocuments(int num_of_copies,String document_name) {
	  for(int i=1;i<=num_of_copies;i++) {
		  System.out.println("Printing <<<:"+document_name+" "+i);
	  }
}
}
class MyOwnThread extends Thread{
	Printer printerRef;
	public MyOwnThread(Printer p) {
		printerRef =p;
	}
	public void run() {
		printerRef.printDocuments(10, "karthika.pdf");
	}
}

class OtherPersonThread extends Thread{
	Printer printerRef;
	public OtherPersonThread(Printer p) {
		printerRef =p;
	}
	public void run() {
		printerRef.printDocuments(10, "sowmya.pdf");
	}
}
public class PrinterThread {

	public static void main(String[] args) {
		System.out.println("Printing Started...");
		Printer printer  =new Printer();
		MyOwnThread t1 =new MyOwnThread(printer);
		OtherPersonThread t2 =new OtherPersonThread(printer);
		t1.start();
		t2.start();

	}

}
