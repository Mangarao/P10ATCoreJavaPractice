package com.deloitte.corejava.training.oops;

class Employee{
	double salary=50000;
	
	void work() {
		System.out.println("Employee is working...");
	}
}

class SoftwareEngineer{
	
}

public class Programmer extends Employee{
	double  bonus=30000;

	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		p.work();
		System.out.println("Total net salary: "+(p.bonus+p.salary));
		

	}

}
