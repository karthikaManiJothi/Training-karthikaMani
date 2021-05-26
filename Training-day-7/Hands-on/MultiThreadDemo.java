package com.onebill.trainig.threads;
 
class MultiThreading extends Thread{
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getId()+"is running");
		
	}
}
	
public class MultiThreadDemo {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
      	  MultiThreading obj =new MultiThreading();
      	  obj.start();
        }
	}

}
