package com.deloitte.corejava.training;

import java.util.GregorianCalendar;

public class LeapYearEx {
	
	static boolean isLeapYear2ndLogic(int year) {
		GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
		return cal.isLeapYear(year);
	}

	static boolean isLeapYear(int year) {
		if (year % 400 == 0 || (year % 4 == 0 & year % 100 != 0)) {
			return true;
		}
		return false;
	}

	static void printLeapYears(int startRange, int endRange) {
		for (int i = startRange; i <=endRange; i++) {
			if(isLeapYear2ndLogic(i)) {
				System.out.print(i+" ");
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		boolean leapYear = isLeapYear2ndLogic(2024);
		System.out.println(leapYear);
		printLeapYears(2000,2100);
		
		
	}

}
