package com.deloitte.corejava.training.java8;

import java.util.function.Predicate;

@FunctionalInterface
interface MyInterface {
	boolean isPalindrome(String name);
	default void m1() {
		System.out.println("M1 method");
	}
	
	static void m2() {
		System.out.println("Static method");
	}
}


public class LambdaExpression3 {
	
	public static void main(String[] args) {
		MyInterface m =	name -> name.equals(new StringBuffer(name).reverse().toString());
		boolean palindrome = m.isPalindrome("MALAYALAM");
		System.out.println(palindrome);
		m.m1();
		
		MyInterface.m2();
	}

}
