package com.deloitte.corejava.training.collections;

import java.util.Comparator;

import com.deloitte.corejava.training.oops.Student;

public class NameComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());

	};
}
