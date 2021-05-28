package com.onebill.training.threads;

public class SynchronizedTable {

	public static void main(String[] args) {
          Tables tables =new Tables();
          
          Runnable ref1 =() ->{
        	  tables.printTable(2);
          };
          
          Runnable ref2 =() ->{
        	  tables.printTable(5);
          };
          
          Thread threadone =new Thread(ref1);
          Thread threadtwo =new Thread(ref2);
          threadone.start();
          threadtwo.start();
	}

}
