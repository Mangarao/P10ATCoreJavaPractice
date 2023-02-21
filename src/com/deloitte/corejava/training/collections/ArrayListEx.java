package com.deloitte.corejava.training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.deloitte.corejava.training.oops.Student;

public class ArrayListEx {
	
	public static void main(String[] args) {
		List<Student> al=new ArrayList<Student>();
		al.add(new Student(104, "Manga"));
		al.add(new Student(102, "Dhoni"));
		al.add(new Student(101,"Kohli"));
		al.add(new Student(103,"Pandey"));
		System.out.println(al);
		Collections.sort(al, new NameComparator());
		Iterator iterator = al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Sorted records based on ID...");
		Collections.sort(al, new IDComparator());
		Iterator iterator1 = al.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		/*
		 * for (Object object : al) { System.out.println(object); }
		 */
		
	}

}
