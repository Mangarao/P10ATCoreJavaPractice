package com.deloitte.corejava.training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckVowels {
	
	static boolean containsVowelLogic2(String name) {
		Pattern pattern = Pattern.compile("[AEIOUaeiou]");
		Matcher matcher = pattern.matcher(name);
		return matcher.find();
	}

	static boolean containsVowel(String name) {
		name = name.toUpperCase();
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I' || name.charAt(i) == 'O'
					|| name.charAt(i) == 'U') {
				return true;
			}
		}

		return false;
	}
	


	
	
	public static void main(String[] args) {
		boolean containsVowel = containsVowelLogic2("KCR");
		System.out.println("containsVowel " + containsVowel);

	}

}
