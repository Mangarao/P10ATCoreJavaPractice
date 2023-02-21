package com.deloitte.corejava.training.exceptions;

import java.util.Arrays;

public class TestAnagram {
	


	public boolean isAnagram(String word1, String word2) {
		//logic
		//Algorithm...
		//1. if the length is not equal, not anagram
		//2. sort the words
		//3. compare... if the both are equal, return true or false
		
		if(word1.length()!=word2.length()) {
			return false;
		}
		char[] ch1=word1.toUpperCase().toCharArray();
		char[] ch2=word2.toUpperCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.compare(ch1, ch2)==0?true:false;
	}

	public static void main(String[] args) {

		System.out.println(new TestAnagram().isAnagram("LISTEN", "SilENT"));
		System.out.println(new TestAnagram().isAnagram("MANGO", "MANGA"));

	}

}
