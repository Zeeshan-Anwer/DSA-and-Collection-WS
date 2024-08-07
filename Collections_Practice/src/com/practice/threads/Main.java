package com.practice.threads;

public class Main  {

	public static void main(String[] args) {
		
		 System.out.println(Thread.currentThread().getName());
		
		   MyThread t2=new MyThread();
		   Thread t1=new Thread(t2); 
		   t1.start(); 
		   t1.run(); 
		   System.out.println(Thread.currentThread().getName());
		 	System.out.println("Get name of thread "+ t1.getName());
		 	t1.setName("2nd Thread");
		 	System.out.println("Get name of thread"+t1.getName());
		 	
			System.out.println("Get Priority"+t1.getPriority());
			System.out.println("Get Id "+t1.getId());
		
			//Using Lambda Expression
		Runnable r1=()->{
			try {
				t1.sleep(50);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("I am printing using lambda expression");
		};
		r1.run();
		
		//Using Anonymous 
		Runnable rt1=new Runnable() {
			public void run() {
				System.out.println("I am using anonymous class ");
			}
		};
		
		rt1.run();
		System.out.println("Is Deamon: "+Thread.currentThread().isDaemon());
		
		try{
			Thread.currentThread().setDaemon(true);
			}
		
		catch(Exception e)
		{
			System.out.println("Exception Caught");
			 e.printStackTrace();
			}
		
		System.out.println("Is Deamon: "+Thread.currentThread().isDaemon());
		MehtodChaining m1=new MehtodChaining();
		MehtodChaining m2=m1.setId(1).setName("Zeeshan").setLocation("Bangalore");
		System.out.println(m1);
		System.out.println(m2);
		
		
		//MehtodChaining m3=new MehtodChaining(2,"Shadab","Hyderabad");
		MehtodChaining m3=MehtodChaining.Of().setId(3).setLocation("Kormangla").setName("Ayshman");
		System.out.println(m3);
	}
}

