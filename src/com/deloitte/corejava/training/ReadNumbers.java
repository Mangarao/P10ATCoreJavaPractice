package com.deloitte.corejava.training;

import java.util.Scanner;

public class ReadNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2");
		int num2 = sc.nextInt();
		System.out.println("Sum of two given no.s is.. "+(num1+num2));
		System.out.println("Subtraction of two given no.s is.. "+(num1-num2));
		System.out.println("Multiplication of two given no.s is.. "+(num1*num2));
		System.out.println("Division of two given no.s is.. "+(num1/num2));
		System.out.println("Modulus of two given no.s is.. "+(num1%num2));
	}

}
