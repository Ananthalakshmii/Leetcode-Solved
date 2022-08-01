package com.accolite.easy;

/*
 https://leetcode.com/problems/merge-sorted-array/
 
 You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, 
 representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 */
public class MergeSortedArray {
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
		 
		
		 int index1 =m-1;
		int index2= n-1;
		int index = m+n-1;
		
		while(index>=0) {
			if(index2<0 || (index1>=0 && nums1[index1]>nums2[index2]))
				nums1[index--]=nums1[index1--];
			else
				nums1[index--]=nums2[index2--];
		}
		 
		 /*  NOT WORKING FOR SOME CASES
		 int i,j;
		 for(i=0,j=0;i<=m+n-1 && j<n;) {
			 while(nums1[i]!=0) {
				 if(nums1[i]<nums2[j])
					 i++;
				 else {
					 int temp=nums2[j];
					 nums2[j]=nums1[i];
					 nums1[i]=temp;
					 i++;
				 }
			 }
			 nums1[i++]=nums2[j++];
		 }*/
		 
		
		 
	    }

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2= {2,5,6};
		int m=3,n=3;
		merge(nums1,m,nums2,n);
		for(int i=0;i<=m+n-1;i++)
			System.out.print(nums1[i]+" ");

	}

}


