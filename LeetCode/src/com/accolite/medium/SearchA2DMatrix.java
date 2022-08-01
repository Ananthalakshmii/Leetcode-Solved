package com.accolite.medium;

/*
 https://leetcode.com/problems/search-a-2d-matrix/
 
 Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. 
 This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
 */
public class SearchA2DMatrix {
	
	public static boolean searchMatrix(int[][] matrix, int target) {
	    if(matrix==null || matrix.length==0 || matrix[0].length==0)
	    	return false;
	    
	    int row=matrix.length;
	    int col=matrix[0].length;
	    int start=0;
	    int end=row*col-1;
	    
	    while(start<=end) {
	    	int mid=(start+end)/2;
	    	int midX=mid/col;
	    	int midY=mid%col;
	    	
	    	if(matrix[midX][midY]==target)
	    		return true;
	    	else if(matrix[midX][midY]<target)
	    		start=mid+1;
	    	else if(matrix[midX][midY]>target)
	    		end=mid-1;
	    }
		
	    return false;
	}
	
	public static void main(String[] args) {
		int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target=3;
		boolean result=searchMatrix(matrix, target);
		System.out.println(result);
	}

}
