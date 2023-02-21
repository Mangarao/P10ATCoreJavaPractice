package com.deloitte.corejava.training;

/**
 * 
 * @author MangaRao
 * @since 2023
 * @version 1.0
 * This is class to demonstrate CommandLine arguments and Varargs demo
 *
 */
public class CommandLineArgsDemo {
	
	/**
	 * PI value is declared  as it is constant to use it in application
	 */
	private  final static double PI=3.14;
	
	//varargs.. 
	
	//WAP to print sum of the array elements
	//vararg feature got added in Java 5
	//it is flexible approach.. so that one method can accept 0 or more values
	//vararg declaration should be last argument in the method signature
	
	/**
	 * this method is for calculating sum of given numbers and to return result...
	 * @param name
	 * @param f
	 * @param nums
	 * @return int
	 */
	static int getSumOfArrayElements(String name, float f,  int... nums) {
		int sum=0;
		/*
		 * Iterating the input values using foreach
		 * and adding all the numbers
		 */
		for (int i : nums) { 
			sum+=i;
		}
		return sum;
		
	}
	
	public static void main(String... input) {
		int sum = getSumOfArrayElements("Manga", 10.20f, 10,20,30,40);
		System.out.println(sum);
		int sum1 = getSumOfArrayElements("Manga", 10.20f, 10,20);
		System.out.println(sum1);
	}

}
