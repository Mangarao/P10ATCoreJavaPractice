package com.deloitte.corejava.training;

public class InstanceOfOperatorDemo {
	public static void main(String[] args) {
		//instanceof operator is used to check type of object...
		//applicable only on reference type (non-primitive types).
		//instanceof operator returns boolean value (either true or false)
		String name="Manga";
		System.out.println(name instanceof String);
		name=null;
		System.out.println(name instanceof String);
		String names[]= {"manga","mihi","aarohi"};
		//Object is super class for all the Java classes..
		//Object class can be referred for Child classes...
		System.out.println(names instanceof Object[]);
		
		float f=20+50%2*(10-2);
		System.out.println("Float result: "+f);
		
	}

}
