package com.deloitte.corejava.training.oops;

 abstract class Vehicle{
	 
	 
	
	 final double MAX_LIMIT=10;
	
	public Vehicle() {
		System.out.println("Vehicle is createed");
	}
	
	public Vehicle(int speed) {
		System.out.println("Vehicle is createed, "+speed);
	}
	static void m1() {
		System.out.println("m1  of Vehicle");
	}
	 abstract void run();
	
}
public class Bike extends Vehicle {
		
	final double MAX_LIMIT=100;
	Bike(){
		super(90);
		System.out.println("Bike is created..");
	}
	
	static void m1() {
		System.out.println("m1  of Bike");
	}
	
	 void run() {
		System.out.println("Bike is running slowly...");
	}

	
	public static void main(String[] args) {
		Vehicle b=new Bike();
		b.run();
		System.out.println(b.MAX_LIMIT);
		
	}

}
