package com.onebill.training.exe;

class ErrorMsg{
	final int OUTERR =0;
	final int INERR=1;
	final int DISKERR=2;
	final int INDEXERR=3;
	String[] msgs= {"ouput error","Input error","Disk error","Index error"};
	String getErrorMsg(int i) {
		if(i>=0&& i<msgs.length)
			return msgs[i];
		else
			return "Invalid Code";
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ErrorMsg errorMsg =new ErrorMsg();
		System.out.println(errorMsg.getErrorMsg(7));

	}

}
