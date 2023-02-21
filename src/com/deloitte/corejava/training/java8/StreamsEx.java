package com.deloitte.corejava.training.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class StreamsEx {
	
	public static void main(String[] args) {
		int sum = IntStream.range(1,5).sum();
		System.out.println("Sum is: "+sum);
		List<String> namesList=new ArrayList<>();
		namesList.add("Manga");
		namesList.add("Dhoni");
		namesList.add("Kohli");
		namesList.add("Karthik");
		namesList.stream().filter(name -> name.startsWith("K")).sorted().findFirst().ifPresent(System.out::println);
		
		  OptionalDouble average = Arrays.stream(new int[] {1,2,3}).map(j->j*10).average();
		System.out.println(average.getAsDouble());
		
		Integer reduce = Arrays.asList(1,2,3).stream().reduce(0, (a,b)-> a*b );
		System.out.println(reduce);
		
		}

}
