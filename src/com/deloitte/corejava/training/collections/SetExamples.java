package com.deloitte.corejava.training.collections;

import java.util.TreeSet;

public class SetExamples {
	
	public static void main(String[] args) {
		TreeSet<String> s=new TreeSet<String>();
		s.add("Mihi");
		s.add("Mihi");
		s.add("Aarohi");
		//s.add(null);
		System.out.println(s);
	}

}
