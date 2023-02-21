package com.deloitte.corejava.training;

public class SwapProgram {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Before swapping");
		System.out.println("a= " + a + "b= " + b);

		// here logic
		// 1. using third variable
		/*
		 * int temp = a; b = a; a = temp;
		 */

		// 2. without using third variable
		b = (a+b) - (a=b);
		System.out.println("After swapping");
		System.out.println("a= " + a + "b= " + b);

	}

}
