package com.deloitte.corejava.training;

public class EvenOddNumberProgram {

	static boolean isEven(int num) {
		return num % 2 == 0;

	}

	static boolean isOdd(int num) {
		return num % 2 != 0;

	}

	public static void main(String[] args) {
		boolean odd = isOdd(10);
		System.out.println(odd);

		// print even numbers from 1 to 100
		for (int i = 2; i <= 100; i+=2) {
			System.out.println(i);

		}
	}

}
