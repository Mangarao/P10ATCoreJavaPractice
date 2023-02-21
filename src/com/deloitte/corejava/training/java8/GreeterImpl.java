package com.deloitte.corejava.training.java8;

@FunctionalInterface
interface Greeter {
	public abstract void greet();
	
}

public class GreeterImpl {
	public static void main(String[] args) {
		Greeter g = () -> {
			System.out.println("Hello world");
			System.out.println("Welcome to Java 8 Features");
			
		};
		g.greet();
	}

}
