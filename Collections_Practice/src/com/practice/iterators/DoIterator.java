package com.practice.iterators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DoIterator {
	
	public static void main(String[] args) {
		
		Collection col=new ArrayList();
		col.add(1);
		col.add(2);
		col.add(3);
		col.add(4);
		col.add(5);
		col.add(6);
		removeElements(col);
	}
	
	public static void removeElements(Collection<Integer> col) {
		
		Iterator itr=col.iterator();
		while(itr.hasNext()) {
			int a=(int)itr.next();
			if(a%2!=0)
				itr.remove();
			
		}
	}


}
