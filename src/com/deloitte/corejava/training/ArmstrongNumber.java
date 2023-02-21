package com.deloitte.corejava.training;

public class ArmstrongNumber {

	static boolean isArmstrong(int num) {
		int temp = num;
		int sum = 0;
		int rem = 0;
		while (num != 0) {
			rem = num % 10;
			sum += (rem * rem * rem);
			num = num / 10;
		}
	//	System.out.println("Sum of cubes of individual digits of the given number: " + sum);
		return temp == sum;
	}

	static void printArmstrong(int range) {
		for (int i = 100; i <= range; i++) {
			if (isArmstrong(i)) {
				System.out.print(i + "  ");
			}

		}
	}

	public static void main(String[] args) {
		boolean armstrong = isArmstrong(371);
		System.out.println("armstrong:  " + armstrong);
		printArmstrong(999);

	}

}
