package com.deloitte.corejava.training;

public  class CounterEx {
	
	static class A{
		int i;
		void m1() {
			System.out.println("inner class method..");
		}
	}
	
	private static int x;
	public static void main(String[] args) {
		System.out.println("main method code is executed");
		
	}
	
	static{
		x=10;
		System.out.println("Static block: "+x);
	}

}
