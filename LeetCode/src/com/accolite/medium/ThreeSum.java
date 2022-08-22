package com.accolite.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 https://leetcode.com/problems/3sum/
 
 Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
 */
public class ThreeSum {
	public static void main(String[] args) {
		int[] nums= {-1,0,1,2-1,-4};
		List<List<Integer>> result=threeSum(nums);
		
		result.stream().flatMap(List::stream).forEach(num->System.out.print(num+" ")); //to print list<list<int>>
		
	}
	
	private static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		for(int i=0;i<nums.length;i++) {
			int left=i+1;
			int right=nums.length-1;
			
			if(i>0 && nums[i]==nums[i-1])
				continue;
			
			while(left<right) {
				
				if(right<nums.length-1 && nums[right]==nums[right+1]) {
					right--;
					continue;
				}
				
			int threeSum=nums[i]+nums[left]+nums[right];
			if(threeSum>0)
				right--;
			else if(threeSum<0)
				left++;
			else if(threeSum==0) {
				System.out.println("inside adding");
				ArrayList<Integer> list=new ArrayList<>();
				list.add(nums[i]);
				list.add(nums[left]);
				list.add(nums[right]);
				result.add(list);
				left++;
				right--;
			}
		}
			
		}
		return result;
	}

	
	//	[[-1,-1,2],[-1,0,1]] --prints correctly in leetcode
	//but in console it prints - -1 0 1 
}
