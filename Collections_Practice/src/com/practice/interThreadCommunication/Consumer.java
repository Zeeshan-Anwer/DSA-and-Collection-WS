package com.practice.interThreadCommunication;

public class Consumer extends Thread {

	Company c;
	
	public Consumer(Company c) {
		
		this.c=c;
	}
	
	@Override
	public void run() {
		super.run();
		while(true) {
			
			try {
				c.consume_item();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
			
			/*
			 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
		}
	}
}
