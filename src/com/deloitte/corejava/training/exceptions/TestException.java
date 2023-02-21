package com.deloitte.corejava.training.exceptions;

public class TestException {

	public static void main(String[] args) {
		System.out.println("statement 1");
		System.out.println("statement 2");
		System.out.println("statement 3");
		System.out.println("statement 4");
		System.out.println("statement 5");
		
		try {
			int a=10/0;
		}catch(Exception e) {
			e.printStackTrace();
			System.err.println("Divided by zero calucation is not possible, Exception occured due to "+e.getMessage());
		}
		System.out.println("statement 6");
		System.out.println("statement 7");
		System.out.println("statement 8");
		System.out.println("statement 9");
		System.out.println("statement 10");
	}

}
