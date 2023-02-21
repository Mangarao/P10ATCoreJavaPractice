package com.deloitte.corejava.training.oops;
interface Father{
	void m1();
}

interface Mother{
	void m1();
	
	
}
public class Child implements Father, Mother{

	@Override
	public void m1() {
		System.out.println("M1 method");
		
	}
	
	public static void main(String[] args) {
		Mother c=new Child();
		c.m1();
	}

}
