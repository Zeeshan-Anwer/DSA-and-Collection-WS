package com.practice.iterators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapQuestion {
	
	public static void main(String[] args) {
		
		Map<Integer,String> Codes=new HashMap<>();
		Codes.put(404,"NotFound");
		Codes.put(200, "OK");
		Codes.put(202, "CREATED");
		
		System.out.println(Codes);
		Iterator<Integer,String> itr=codes.iterator();
		while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  
		//check();
		
		
		
	}
//	public static void check() {
//	
//		Function<Integer,String> fun=(i)->{
//			if(i==1)
//				return ("Congrats No 1");
//			else
//				return("Not 1st");
//		};
//		Supplier<String> sup=()->{return("I am supplier");};
//		Consumer<String> con=(i)->{System.out.println("I consumed "+i);};
//		
//		System.out.println(fun.apply(1));
//		System.out.println(sup.get());
//		con.accept("z");
//		
//		
//
//
//}