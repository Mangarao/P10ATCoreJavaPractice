package com.deloitte.corejava.training.string;

public class PalindromeString {

	static boolean isPalindrome(String name) {
		return new StringBuilder(name).reverse().toString().equals(name);
	}
	
	static String reverse(String name) {
		char[] charArray = name.toCharArray();
		StringBuffer sb=new StringBuffer();
		for (int i = charArray.length-1; i>=0; i--) {
			sb.append(charArray[i]);
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		
		
		
		
		System.out.println(reverse("MADAM"));
		boolean palindrome = isPalindrome("MALAYALAM");
		System.out.println("Palindrome: " + palindrome);

	}

}
