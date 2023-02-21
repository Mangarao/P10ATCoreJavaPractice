package com.deloitte.corejava.training.java8;

import java.util.function.BiFunction;


public class LambdaExpression2 {

	public static void main(String[] args) {
		BiFunction<Integer,Integer, Long> ai = (a, b) ->  (long) a + b;
		long sum = ai.apply(10, 20);
		System.out.println(sum);
	}

}
