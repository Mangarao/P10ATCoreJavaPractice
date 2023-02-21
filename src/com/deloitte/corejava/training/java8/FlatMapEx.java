package com.deloitte.corejava.training.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx {
	
	public static void main(String[] args) {
		  List<List<Integer>> nestedNumbers = Arrays.asList(
			        Arrays.asList(1, 2, 3),
			        Arrays.asList(1, 5, 6),
			        Arrays.asList(7, 8, 9)
			    );
		  
		    List<Integer> flatNumbers = nestedNumbers.stream()
		            .flatMap(list -> list.stream())
		            .collect(Collectors.toList());
		        System.out.println("Flat Numbers: " + flatNumbers);


	}

}
