package com.accolite.medium;


/*
 https://leetcode.com/problems/sort-colors/
 
 Given an array nums with n objects colored red, white, or blue, sort them in-place 
so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, 
respectively.

You must solve this problem without using the library's sort function.
 */
public class SortColors {

	public static void main(String[] args) {
		int[] nums= {2,0,2,1,1,0};
		sortColors(nums);
		for(int i:nums)
			System.out.print(i+" ");
		System.out.println();
		
		int[] num1= {1,0};
		sortColors(num1);
		for(int i:num1)
			System.out.print(i+" ");
	}

	private static void sortColors(int[] nums) {
		if(nums==null)
			return;
		
		int[] countArray=new int[3];
		for(int i=0;i<nums.length;i++)
			countArray[nums[i]]++;
		
		int numCounter=0;
		int countCounter=0;
		while(countCounter<=2) {
			if(countArray[countCounter]!=0) {
				nums[numCounter]=countCounter;
				numCounter++;
				countArray[countCounter]--;
			}else
				countCounter++;
				
		}
	}
}
