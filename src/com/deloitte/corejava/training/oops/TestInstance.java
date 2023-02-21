package com.deloitte.corejava.training.oops;

public class TestInstance {
	int x ;
	public TestInstance() {
		x=20;
		System.out.println("Constructor is called "+x);
	}
	
	{
		x=10;
		System.out.println("Instance block "+x);
	}
	
	static{
		System.out.println("Static block");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		
		new TestInstance();
	}

}
