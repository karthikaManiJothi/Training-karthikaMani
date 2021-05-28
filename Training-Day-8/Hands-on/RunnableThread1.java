package com.onebill.training.threads;

public class RunnableThread1 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}

}
