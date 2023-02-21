package com.deloitte.corejava.training;

public class PrimeNumber {

	static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for (int i = 2; i <=Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	
	static void printPrimes(int range) {
		for (int i = 2; i <=range; i++) {
			if(isPrime(i)) {
				System.out.print(i+"\s\s");
			}
		}
	}
	
	public static void main(String[] args) {
		printPrimes(1000);
	}

}
