package com.accolite.easy;

import java.util.HashMap;

/*
 https://leetcode.com/problems/majority-element/
 
 Given an array nums of size n, return the majority element.

The majority element is the element that appears more than floor of n / 2 times. You may assume that the majority element always exists in the array.
 */
public class MajorityElement {
	public static void main(String[] args) {
		int[] nums= {2,2,1,1,1,2,2};
		int majority=majorityELement(nums);
		System.out.println(majority);
	}

	
	private static int majorityELement(int[] nums) {
		int majority=nums.length/2;
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
				map.put(nums[i], map.getOrDefault(nums[i],0)+1);
		}
		for(int i=0;i<nums.length;i++) {
			if(map.get(nums[i])>majority)
				return nums[i];
			
		}
		return majority;
	}

}
