package com.practice.iterators;

import java.util.ArrayList;
import java.util.ListIterator;

public class DoListIterator {
	/*	Method of Iterator
	 * 	next()
	 *  hasNext()
	 * 	remove()
	 * 
	 * 	Additional Methods for ListIterator
	 * 
	 * 	hasPrevious()
	 * 	previous()
	 * 	add()
	 *  set()
	 *  nextIndex()
	 *  previousIndex()
	 */
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList<>();
		
		al.add(2);
		al.add(4);
		al.add(6);
		al.add(7);
		al.add(4);
		al.add(2);
		
		ListIterator listItr=al.listIterator();
		while(listItr.hasNext()) {
			int a=(int)listItr.next();
			listItr.set(a*2);
		//	listItr.add(5);
			System.out.println("Next Index: "+listItr.nextIndex());
			System.out.println(a);
		}
		ListIterator listItr1=al.listIterator(al.size());
		
		while(listItr1.hasPrevious()) {
			int b=(int) listItr1.previous();
			System.out.println(b);
		}
	}

}
