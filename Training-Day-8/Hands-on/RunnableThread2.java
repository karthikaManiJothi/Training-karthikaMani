package com.onebill.training.threads;

public class RunnableThread2 implements Runnable {
 
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
}
