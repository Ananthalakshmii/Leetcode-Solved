package com.accolite.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 https://leetcode.com/problems/partition-labels/
 
 You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.

Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.

Return a list of integers representing the size of these parts.
 */
public class PartitionLabels {
	public static void main(String[] args) {
		String s="ababcbacadefegdehijhklij";
		List<Integer> num=partitionLabels(s);
		System.out.println(num);
	}

	private static List<Integer> partitionLabels(String s) {
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i), i);
		}
		
		List<Integer> result=new ArrayList<>();
		int prev=-1;
		int max=0;
		
		for(int i=0;i<s.length();i++) {
			max=Math.max(max, map.get(s.charAt(i)));
			if(max==i) {//partition time
				result.add(max-prev);
				prev=max;
			}
		}
		
		return result;
	}

}
