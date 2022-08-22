package com.accolite.medium;

/*
 https://leetcode.com/problems/spiral-matrix-ii/
 
 Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
 */
public class SpiralMatrix2 {
	public static void main(String[] args) {
		int n=3;
		int[][] result=generateMatrix(n);
		for(int[] i:result) {
			for(int j:i)
				System.out.print(j+" ");
			System.out.println();
		}
	}

	private static int[][] generateMatrix(int n) {
		int top=0,bottom=n-1;
		int left=0,right=n-1;
		int total=n*n;
		int num=1;
		int[][] result=new int[n][n];
		
		while(num<=total) {
			for(int i=left;i<=right;i++) {
				result[top][i]=num++;
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				result[i][right]=num++;
			}
			right--;
			for(int i=right;i>=left;i--) {
				result[bottom][i]=num++;
			}
			bottom--;
			for(int i=bottom;i>=top;i--) {
				result[i][left]=num++;
			}
			left++;
			
		}
		return result;
	}

}
