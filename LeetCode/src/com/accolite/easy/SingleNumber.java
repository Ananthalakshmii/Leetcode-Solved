package com.accolite.easy;

/*
 https://leetcode.com/problems/single-number/
 
 Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
public class SingleNumber {
	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		int singleNum=singleNumber(nums);
		System.out.println(singleNum);
	}

	private static int singleNumber(int[] nums) {
		int xor=0;
		for(int i=0;i<nums.length;i++) {
			xor=xor^nums[i];
		}
		return xor;
	}

}
