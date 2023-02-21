package com.deloitte.corejava.training.exceptions;

public class TryMultiCatchEx {
	
	static void m1() {
		try {
			  double num[] = new double[5]; 
			  num[4] = 5 / 10;
			  String n=null;
			  System.out.println(n.length());

		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundException occurred due to: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.err.println("ArithmeticException occurred due to: " + e.getMessage());

		} finally {
			System.out.println("Finally is executed");
			return; //suppressing the exception
		}
	}

	public static void main(String[] args) {
		m1();
		System.out.println("Successfuly program completely executed");
	}

}
