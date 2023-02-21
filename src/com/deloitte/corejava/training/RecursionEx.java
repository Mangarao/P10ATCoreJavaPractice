package com.deloitte.corejava.training;

public class RecursionEx {
	
	static int counter=0;
	static void printName() {
		System.out.println("Manga");
		counter++;
		if(counter<=10) {
		printName(); 
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main method is executed...");
		main(new String[] {"Manga"});
	}

}
