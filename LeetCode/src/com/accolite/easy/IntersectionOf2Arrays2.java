package com.accolite.easy;

import java.util.ArrayList;
import java.util.Arrays;

/*
 https://leetcode.com/problems/intersection-of-two-arrays-ii/
 
 Given two integer arrays nums1 and nums2, return an array of their intersection. 
 Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 */
public class IntersectionOf2Arrays2 {
	
	public static int[] intersect(int[] nums1, int[] nums2) {
             
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list=new ArrayList<Integer>();
        int resultIndex=0,ptr1=0,ptr2=0;
        while(ptr1<nums1.length && ptr2<nums2.length) {
        	if(nums1[ptr1]<nums2[ptr2]) 
        		ptr1++;
        	else if(nums1[ptr1]>nums2[ptr2])
        		ptr2++;
        	else {
        		list.add(nums1[ptr1]);
        		ptr1++;
        		ptr2++;
        	}
        }
        int[] result=new int[list.size()];
        for(int num :list)
        	result[resultIndex++]=num;
        
        return result;
    }

	public static void main(String[] args) {
		int[] nums1= {4,9,5};
		int[] nums2= {9,4,9,8,4};
		int[] result=intersect(nums1, nums2);
		for(int i=0;i<result.length;i++)
			System.out.print(result[i]+" ");
		
	}
}
