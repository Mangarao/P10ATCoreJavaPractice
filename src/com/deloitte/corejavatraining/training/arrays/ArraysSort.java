package com.deloitte.corejavatraining.training.arrays;

import java.util.Arrays;

public class ArraysSort {
	
	public static void main(String[] args) {
		String[] names= {"manga","mihi","aaru","siri"};
		Arrays.sort(names);
		for (String name : names) {
			System.out.println(name);
		}
	}

}
