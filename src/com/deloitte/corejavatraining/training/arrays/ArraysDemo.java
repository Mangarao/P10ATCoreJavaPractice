package com.deloitte.corejavatraining.training.arrays;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int[] nums= new int[4]; nums[0]=10; nums[1]=20; nums[2]=30; nums[3]=40;
		 */
		
		int[] nums= {20,60,40,50,10,30};
		
		Arrays.sort(nums);
		
		/*
		 * for (int i = 0; i < nums.length; i++) { System.out.println(nums[i]);
		 * 
		 * }
		 */
		
		for (int i : nums) {
			System.out.println(i);
		}

	}

}
