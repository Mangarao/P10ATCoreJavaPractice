package com.deloitte.corejava.training;

import java.util.Scanner;

public class ReadUserName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String uname = sc.nextLine();
		System.out.println("Hello, "+uname);

	}

}
