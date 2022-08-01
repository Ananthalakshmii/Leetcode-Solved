package com.accolite.easy;

import java.util.ArrayList;
import java.util.List;

/*
 https://leetcode.com/problems/pascals-triangle/
 
 Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it
 */
public class PascalsTriangle {

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result=new ArrayList<>();
        if(numRows<=0)
        	return result;
        List<Integer> pre=new ArrayList<Integer>();
        pre.add(1);
        result.add(pre);
        
        for(int i=2;i<=numRows;i++) {
        	List<Integer> cur= new ArrayList<Integer>();
        	
        	cur.add(1);
        	for(int j=0;j<pre.size()-1;j++) {
        		cur.add(pre.get(j)+pre.get(j+1));
        	}
        	cur.add(1);
        	result.add(cur);
        	
        	pre=cur;
        }
        
        return result;
    }

	public static void main(String[] args) {
		int numRows=5;
		List<List<Integer>> result=generate(numRows);
		System.out.print(result+" ");
	
	}

}
