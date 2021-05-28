package com.onebill.training.threads;


public class ThreadExample2 extends Thread {
    
	public void run() {
		for(int i=0;i<6;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	 }
	
	public static void main(String[] args) {
      ThreadExample2 obj1 =new ThreadExample2();
      ThreadExample2 obj2 =new ThreadExample2();
      obj1.start();
      obj2.start();
	}

}
