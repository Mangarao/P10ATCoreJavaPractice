package com.deloitte.corejava.training.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Manga");
		ll.add("Manga");
		ll.add("Dhoni");
		ll.add("Sachin");
		
		System.out.println(ll);
		
		ListIterator<String> li = ll.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("Backward direciton");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}


}
