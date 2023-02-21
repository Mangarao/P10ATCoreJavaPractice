package com.deloitte.corejava.training.oops;

public class WrapperEx {

	public static void main(String[] args) {
		int i = 10;
		Integer ij = i; // auto boxing
		ij = Integer.valueOf(i); // manual conversion

		Double d = 10.45d;
		double d1 = d; // auto unboxing
		double doubleValue = d.doubleValue();
	}

}
