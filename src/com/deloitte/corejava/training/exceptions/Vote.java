package com.deloitte.corejava.training.exceptions;

import java.util.Scanner;

public class Vote {
	
	public static boolean isEligibleForVote(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Ineligible for vote");
		}
		return true;
	}
	
	public static void main(String[] args) throws InvalidAgeException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
		int age = s.nextInt();
		boolean eligibleForVote=false;
		try {
			eligibleForVote = isEligibleForVote(age);
		} catch (ArithmeticException e) {
			System.out.println("Exeception occurred due to: "+e.getMessage());
		}
		
		System.out.println("Eligible for vote: "+eligibleForVote);
		
	}

}
