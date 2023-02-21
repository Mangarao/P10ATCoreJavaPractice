package com.deloitte.corejava.training.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ParallelStream {
	
	public static void main(String[] args) {
		int sum = IntStream.range(1, 101).parallel().sum();
		System.out.println(sum);
		
		int sum2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10).parallelStream().mapToInt(Integer::valueOf).sum();
		System.out.println(sum2);
	}

}
