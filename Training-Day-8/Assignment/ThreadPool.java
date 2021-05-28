package com.onebill.training.ass.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThreadPool implements Runnable{
	String name;
	public MyThreadPool(String name) {
		this.name = name;
	}
	
	@Override
	public synchronized void run() {
     System.out.println("Started :"+name);	
     try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
     System.out.println("Ended :"+name);
	}
	
 }

public class ThreadPool {

	public static void main(String[] args) {
             ExecutorService executorservice =Executors.newFixedThreadPool(3);
        	 MyThreadPool threadpool1 =new MyThreadPool("thread-1");
        	 MyThreadPool threadpool2 =new MyThreadPool("thread-2");
        	 MyThreadPool threadpool3 =new MyThreadPool("thread-3");
        	 MyThreadPool threadpool4 =new MyThreadPool("thread-4");
        	 MyThreadPool threadpool5 =new MyThreadPool("thread-5");
        	 executorservice.execute(threadpool1);
        	 executorservice.execute(threadpool2);
        	 executorservice.execute(threadpool3);
        	 executorservice.execute(threadpool4);
        	 executorservice.execute(threadpool5);
             executorservice.shutdown();
	}

}
