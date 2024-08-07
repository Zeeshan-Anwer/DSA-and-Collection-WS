package com.practice.interThreadCommunication;

public class Producer extends Thread{

	Company c;
	
	public Producer(Company c) {
		this.c=c;
	}
	
	@Override
	public void run() {

		int i=1;
		super.run();
		
		while(true) {
			
			
			try {
				c.produce_item(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			/*
			 * try { Thread.sleep(1000); } catch (InterruptedException e) {
			 * e.printStackTrace(); }
			 */
		
			i++;
			
		}
	}
	
}
