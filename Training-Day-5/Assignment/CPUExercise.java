package com.onebill.handson.nestedclass;

class CPU{
	class RAM{
		int totalram = 32;
		private void displayRAM() {
			System.out.println("RAM Size in my computer:"+totalram);
		}
	}
	class Processor{
		String processortype ="media Processor";
		double processorCost =62555.55;
		private void displayProcessor() {
			System.out.println("Processor Type:"+processortype);
			System.out.println("Processor Cost:"+ processorCost);
		}
	}
	public void objectCreation() {
		RAM ram =new RAM();
		Processor pro =new Processor();
		ram.displayRAM();
		pro.displayProcessor();
	}
}
public class CPUExercise {

	public static void main(String[] args) {
       CPU cpu =new CPU();
       cpu.objectCreation();
       
	}

}
