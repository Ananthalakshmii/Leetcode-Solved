package com.accolite.medium;

/*
 https://leetcode.com/problems/rotate-image/
 
 You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 */
public class RotateImage {
	
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		for(int[] i:arr) {
			for(int j:i)
				System.out.print(j+" ");
			System.out.println();
		}
		rotate(arr);
		for(int[] i:arr) {
			for(int j:i)
				System.out.print(j+" ");
			System.out.println();
		}
		
	}

	public static void rotate(int[][] matrix) {
        int n = matrix.length;
        System.out.println(n);
        for(int i = 0; i < n/2; i++) {
            for(int j = i; j < n - 1 - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
        }
    }

}
