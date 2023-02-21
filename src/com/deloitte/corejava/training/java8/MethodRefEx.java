package com.deloitte.corejava.training.java8;

import java.util.function.BiFunction;

public class MethodRefEx {

	public MethodRefEx() {
		System.out.println("Constructor is invoked");
	}

	public int sum(int num1, int num2) {
		return num1+num2;
	}
	public void doSay() {
		System.out.println("Hi, Good Morning");
	}

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> bi=new MethodRefEx()::sum;
		Integer res = bi.apply(10, 20);
		System.out.println("Sum: "+res);

	}

}
