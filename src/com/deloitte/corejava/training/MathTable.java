package com.deloitte.corejava.training;

public class MathTable {
	
	static void printTable(int num) {
		for (int i = 1; i <=10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, (num*i));
		}
	}
	
	public static void main(String[] args) {
		printTable(5);
		System.out.println();
		printTable(6);
	}

}
