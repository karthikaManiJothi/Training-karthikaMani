package com.onebill.training.threads;

class MyThread implements Runnable{
	String tname;
	public MyThread(String tname) {
		this.tname=tname;
	}

	@Override
	public void run() {
          for(int count=0;count<=5;count++) {
        	  try {
				Thread.sleep(200);
				System.out.println("In "+tname+" Count"+count);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        	  
         }
	}
}

public class ThreadExample3 {

	public static void main(String[] args) {
       System.out.println("Main thread starting..");
       MyThread mt =new MyThread("Child Thread");
       
       Thread newthread =new Thread(mt);
       newthread.start();
       
       for(int count=0;count<=10;count++) {
     	  try {
				Thread.sleep(400);
				System.out.println("In Main thread count: "+count);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
     	  
       }
	}

}
