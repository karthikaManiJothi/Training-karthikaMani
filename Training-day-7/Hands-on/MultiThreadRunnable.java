package com.onebill.trainig.threads;
class MultiThread implements Runnable{
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getId()+"is running");
		
	}
}
public class MultiThreadRunnable {

	public static void main(String[] args) {
          for(int i=0;i<5;i++) {
        	  Thread obj =new Thread(new MultiThread());
        	  obj.start();
          }
	}

}
