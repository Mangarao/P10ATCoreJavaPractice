package com.deloitte.corejava.training;

public class MethodOverloadingEx {
	static int sum(short num1, int num2) {
		return num1 + num2;

	}

	
	public static void main(String[] args) {
		short a=10;
		short s=20;
		sum(a, s);
		
	}
	
	public static void main(Integer[] args) {
		
	}

}
