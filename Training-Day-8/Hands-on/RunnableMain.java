package com.onebill.training.threads;

public class RunnableMain {

	public static void main(String[] args) {
		RunnableThread1 one =new RunnableThread1();
		RunnableThread2 two =new RunnableThread2();
		
		Thread tone =new Thread(one);
		Thread ttwo =new Thread(two);
		
		tone.start();
		ttwo.start();
	}

}
