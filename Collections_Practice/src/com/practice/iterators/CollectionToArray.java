package com.practice.iterators;

import java.util.ArrayList;

//	1:-		Object[] toArray()	//return object based on DataType,
			
//	2:-		T[] toArray(T[] arr);	

public class CollectionToArray {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList(10);
		l.add(1);
		l.add(2);
		Object []obj=l.toArray();
		
		for(Object print: obj) {
			System.out.println(print);
		}
		
		//Method 1
		
		
//		Integer arr[]=new Integer[l.size()];
//		arr=l.toArray(arr);
//		
//		for(Integer print: arr) {
//			System.out.println(print);
//		}		
		
		Integer []arr;
		arr=l.toArray(new Integer[0]);
		for(Integer print: arr) {
			System.out.println(print);
		
		
		
	}

		
		
	}
	
}
