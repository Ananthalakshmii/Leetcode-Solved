package com.accolite.easy;

import java.util.ArrayList;
import java.util.List;

/*
 https://leetcode.com/problems/pascals-triangle-ii/
 
 Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 */
public class PascalsTriangle2 {
	
	public static void main(String[] args) {
		int rowIndex=3;
		List<Integer> row=getRow(rowIndex);
		System.out.println(row);
		System.out.println(getRow(4));
	}

	private static List<Integer> getRow(int rowIndex) {
		List<Integer> row=new ArrayList<>();
		int val=1;
		for(int columnIndex=0;columnIndex<=rowIndex;columnIndex++) {
			row.add(val);
			val= (val*(rowIndex-columnIndex))/ (columnIndex+1);
		}
		return row;
	}

}
