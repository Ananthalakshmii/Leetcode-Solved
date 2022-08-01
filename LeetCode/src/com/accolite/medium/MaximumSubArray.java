package com.accolite.medium;

/*
 https://leetcode.com/problems/maximum-subarray/
 
 Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.
 */
public class MaximumSubArray {
	
public static int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
        	sum= sum+nums[i];
        	max=Math.max(max, sum);
        	sum=Math.max(0, sum);
        }
        return max;
    }

public static void main(String[] args) {
	int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
	int sum = maxSubArray(nums);
	System.out.println(sum);
}

}
