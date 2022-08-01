package com.accolite.easy;

import java.util.HashMap;

/*
 https://leetcode.com/problems/two-sum/
 
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */
public class TwoSum {
	 public static int[] twoSum(int[] nums, int target) {
	        
		 	int[] result= {-1,-1};
	       HashMap<Integer, Integer> hash=new HashMap<Integer, Integer>();
	       
	       for(int i=0;i<nums.length;i++) {
	    	   Integer diff=(Integer)target-nums[i];
	    	   if(hash.containsKey(diff)) {
	    		   result[0]=hash.get(diff);
	    		   result[1]=i;
	    		   return result;
	    	   }
	    	   hash.put(nums[i],i);
	       }
	        
			return result;
	    }
	 
	 public static void main(String[] args) {
		int[] nums= {2,7,11,15};
		int target=9;
		int[] result=twoSum(nums,target);
		System.out.println(result[0]+" "+result[1]);
	}

}
