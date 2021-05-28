package com.onebill.training.ass.threads;

//Process class wait and notify
class Process{
	int num;
	boolean value =false;
	
	public synchronized void produce(int num) {      //producing
		while(value) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Produce:"+num);
		this.num=num;
		value=true;
		notify();
	}
	
	public synchronized void consume() {             //consuming
		while(!value) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consume:"+num); 
		value=false;
		notify();
	}
	
}

//produce class to produce
class Producer extends Thread{
    Process p;
    
	public Producer(Process p) {
		this.p = p;
	}

	@Override
	public void run() {
      int i=1;
      while(true) {
    	  p.produce(i++);
    	  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
      }
	}
	
}

  //consumer class to consume
class Consumer extends Thread{
    Process p;
    
	public Consumer(Process p) {
		this.p = p;
	}

	@Override
	public void run() {
      while(true) {
    	  p.consume();
    	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
      }
	}
	
}

public class ProducerConsumer {

	public static void main(String[] args) {
		 Process process =new Process();
		 Producer pt =new Producer(process);
		 pt.start();
		 Consumer ct =new Consumer(process);
		 ct.start();
	}

}
