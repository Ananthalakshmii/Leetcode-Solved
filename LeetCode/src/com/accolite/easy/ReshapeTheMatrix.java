package com.accolite.easy;

/*
 https://leetcode.com/problems/reshape-the-matrix/
 
 You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix
 */
public class ReshapeTheMatrix {

	 public static int[][] matrixReshape(int[][] mat, int r, int c) {
		 int rows=mat.length;
		 int cols=mat[0].length;
		 int k=0;
		 if(rows*cols != r*c)
			 return mat;
		 else {
		 int[][] result=new int[r][c];
		 for(int i=0;i<r;i++) {
			 for(int j=0;j<c;j++,k++) {
				 result[i][j]=mat[k/cols][k%cols];
			 }
		 }
		 return result;
		 }   
	    }
	 
	public static void main(String[] args) {
		int[][] nums= {{1,2},{3,4}};
		int r=1;
		int c=4;
		int[][] result=matrixReshape(nums, r, c);
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[0].length;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}

	}

}
