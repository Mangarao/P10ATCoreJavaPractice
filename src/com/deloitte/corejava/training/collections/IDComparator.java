package com.deloitte.corejava.training.collections;

import java.util.Comparator;

import com.deloitte.corejava.training.oops.Student;

public class IDComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getId()==s2.getId()) {
			return 0;
		}else if(s1.getId()>s2.getId()) {
			return +1;
		}
		
		return -1;
	}

}
