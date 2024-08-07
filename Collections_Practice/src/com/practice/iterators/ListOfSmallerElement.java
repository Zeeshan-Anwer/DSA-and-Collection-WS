package com.practice.iterators;

import java.util.ArrayList;
import java.util.ListIterator;
/*
 * Find all the elements less than 10
 */
public class ListOfSmallerElement {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList(12);
		al.add(3);
		al.add(1);
		al.add(5);
		al.add(2);
		al.add(60);
		al.add(70);
		int a=0;
		ListIterator itr=al.listIterator();
		while(itr.hasNext()) {
			a=(int)itr.next();
		//System.out.println(a);
		if(a<10)
			System.out.println(a);
	}
	}
}
