package com.practice.iterators;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPrg {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set =new HashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			
				System.out.println(itr.next());
			}
		}
	}


