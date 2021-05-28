package com.onebill.training.threads;

public class ThreadsExample implements Runnable{

	public static void main(String[] args) {
       Thread t1 =new Thread("First");
       Thread t2 =new Thread("First");
       t1.start();
       System.out.println(t1.getId());
       System.out.println(t1.getName());
       System.out.println(t1.getPriority());
       t2.start();
       System.out.println(t2.getId());
       System.out.println(t2.getName());
       System.out.println(t2.getPriority());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
