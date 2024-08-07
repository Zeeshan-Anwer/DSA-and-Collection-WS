package com.practice.interThreadCommunication;

public class Company {
	
	int n;
	
	boolean f=false;
	
	synchronized public void produce_item(int n) throws InterruptedException {
		
		if(f) {
		wait();
		}
		
		System.out.println("Item Produced "+n);
		this.n=n;
		f=true;
		notify();
		
		
		
	}
	
	synchronized public int consume_item() throws InterruptedException {
		
		
		if(!f)
		{
			wait();
		}
		System.out.println("Consumed : "+this.n);
		f=false;
		notify();
		return this.n;
	}
		

}
