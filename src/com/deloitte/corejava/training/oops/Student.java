package com.deloitte.corejava.training.oops;

import java.io.Serializable;

public class Student implements Cloneable, Serializable, Comparable<Student> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L; 
	
	private int id;
	private transient String name;
	private static String address;

	public Student() {
		this(101, "Manga");
		System.out.println("Default constructor is generated..");
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setStudent(int i, String n) {
		id = i;
		name = n;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void m1() {
		System.out.println("m1 method");
	}

	public void displayStudent() {
		System.out.println(id + " " + name);
		this.m1();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student(101, "Manga");
		/*
		 * s1.setId(103); s1.setName("Kohli");
		 */
		// s1.setStudent(101, "Manga");
		// System.out.println(s1.getId()+" "+s1.getName());
		System.out.println(s1);
		Student s2 = (Student) s1.clone();
		System.out.println(s2);
		// s2.setStudent(102, "Dhoni");

	}

	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " " + this.name;
	}
	
	@Override
	public int compareTo(Student stud) {
		
		return this.getName().compareTo(stud.getName());
		/*
		 * if(stud.getId()==this.getId()) { return 0; }else
		 * if(this.getId()>stud.getId()) { return +1; } return -1;
		 */
	}

}
