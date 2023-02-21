package com.deloitte.corejava.training;

public class PiramidEx {
	public static void main(String[] args) {
		char ch[]= {'G','O','O','G','L','E'};
		for (int i = 0; i <ch.length; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(ch[j]+"  ");
			}
			System.out.println();
			
		}
		
		System.out.println("Reverse piramid");
		
		for (int i = ch.length-1; i>=0; i--) {
			for (int j = 0; j <=i; j++) {
				System.out.print(ch[j]+"  ");
			}
			System.out.println();
		}
	}

}
