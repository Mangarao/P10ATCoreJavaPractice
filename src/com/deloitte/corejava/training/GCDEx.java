package com.deloitte.corejava.training;

public class GCDEx {

	static int gcd2ndLogic(int num1, int num2) {
		return num1 * num2 / LCM.lcm(num1, num2);
	}

	static int gcd(int num1, int num2) {

		int min = Math.min(num1, num2);
		int gcd = 0;
		for (int i = min; i >= 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
				break;
			}
		}
		return gcd;

	}

	public static void main(String[] args) {
		int gcd = gcd2ndLogic(36, 24);
		System.out.println(gcd);
	}

}
