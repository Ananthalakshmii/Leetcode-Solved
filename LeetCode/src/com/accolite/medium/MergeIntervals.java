package com.accolite.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 https://leetcode.com/problems/merge-intervals/
 
 Given an array of intervals where intervals[i] = [starti, endi],  merge all overlapping intervals, 
 and return an array of the non-overlapping intervals that cover all the intervals in the input.
 */
public class MergeIntervals {
	public static void main(String[] args) {
		int[][] intervals= {{1,3},{2,6},{8,10},{15,18}};
		int[][] result= merge(intervals);
		for(int[] i:result) {
			for(int j:i)
				System.out.print(j+" ");
			System.out.println();
		}
		
	}

	private static int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (a,b)->(a[0]-b[0]));
		
		List<int[]> answer=new LinkedList<>();
		answer.add(intervals[0]);
		
		for(int i=1;i<intervals.length;i++) {
			int[] current=intervals[i];
			int[] top=answer.get(answer.size()-1);
			if(top[1]>=current[0])
				top[1]=Math.max(top[1], current[1]);
			else
				answer.add(intervals[i]);
		}
		
		return answer.toArray(new int[0][0]);
		
	}

}
