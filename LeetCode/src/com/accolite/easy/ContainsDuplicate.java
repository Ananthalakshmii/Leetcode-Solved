package com.accolite.easy;
/*
 https://leetcode.com/problems/contains-duplicate/
 
 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */
import java.util.HashSet;

public class ContainsDuplicate {
	
	public static boolean containsDuplicate(int[] nums) {
        boolean flag=false;
        
        HashSet<Integer> set= new HashSet<Integer>();
        for(int i=0;i<nums.length;i++) {
        	if(set.contains(nums[i])) {
        		flag=true;
        	}
        	set.add(nums[i]);
        }
        return flag;
    }

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		boolean result=containsDuplicate(nums);
		System.out.println((result)?"Contains Duplicate elements- true":"Every element is distinct - false");

	}

}
