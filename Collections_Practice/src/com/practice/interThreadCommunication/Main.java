package com.practice.interThreadCommunication;

public class Main {
	
	public static void main(String[] args) {
		
		Company Tata=new Company();
		
		Producer p=new Producer(Tata);
		Consumer c=new Consumer(Tata);
		
		p.start();
		c.start();
		
		
	}

}
