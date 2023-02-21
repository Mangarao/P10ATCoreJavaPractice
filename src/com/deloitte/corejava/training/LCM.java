package com.deloitte.corejava.training;

public class LCM {

	static int lcm(int num1, int num2) {
		int max = Math.max(num1, num2);
		while (true) {
			if (max % num1 == 0 && max % num2 == 0) {
				return max;
			} else {
				max++;
			}
		}

	}

	public static void main(String[] args) {
		int lcm = lcm(2, 7);
		System.out.println("LCM: " + lcm);
	}

}
