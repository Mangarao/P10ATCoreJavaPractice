package com.deloitte.corejava.training;

import java.util.Scanner;

public class GradeEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your grade");
		char ch = sc.next().toUpperCase().charAt(0);
		switch (ch) {
		case 'A', 'a':
			System.out.println("Excellent");
			break;
		case 'B', 'C', 'b', 'c':
			System.out.println("Good");
			break;
		case 'D', 'd':
			System.out.println("Pass");
			break;
		case 'E', 'e':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid character");

		}
	}
}
