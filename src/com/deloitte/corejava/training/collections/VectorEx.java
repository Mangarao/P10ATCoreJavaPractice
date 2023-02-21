package com.deloitte.corejava.training.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
	
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("NTR");
		v.add("ANR");
		v.add("Krishna");
		v.add("Krishna raju");
		
		System.out.println(v);
		
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}

}
