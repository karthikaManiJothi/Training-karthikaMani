package com.onebill.training.ass.threads;


class MyThread extends Thread{
	public void run()
	{
	for (int i = 1; i < 999999; i++) {
		System.out.println("Thread:"+i);
	}
	}
}

public class ThreadSuspendResumeStop  {
          
			@SuppressWarnings("deprecation")
			public static void main(String args[]) throws InterruptedException {
				MyThread t1 = new MyThread();
				
				Thread.sleep(500);
				t1.start();  
				/*
				Thread.sleep(400);         //stoping thread 1
				t1.stop();*/
				
				Thread.sleep(5);
				t1.suspend();        //suspending thread 1
				
				/*Thread.sleep(5000);
				t1.resume();*/      //resuming thread1
				
			}
		

	}


