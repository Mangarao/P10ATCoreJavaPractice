package com.deloitte.corejava.training.string;

public class StringBuilderDemo {
	
	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("Manga");
		StringBuilder sb2=new StringBuilder("Manga");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb2);
	}

}
