package com.deloitte.corejava.training;

public class ReverseOfNumber {
	static int reverse(int num) {
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		return rev;
	}
	
	static boolean isPalindrome(int num) {
		return num==reverse(num);
	}

	public static void main(String[] args) {
		int reverse = reverse(123);
		System.out.println("Reverse of the number: "+reverse);
		boolean palindrome = isPalindrome(123);
		System.out.println("Given number is palindrome: "+palindrome);
	}

}
