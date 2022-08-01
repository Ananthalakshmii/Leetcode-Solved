package com.accolite.medium;

import java.util.HashSet;

/*
 https://leetcode.com/problems/valid-sudoku/
 
 Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
 */
public class ValidSudoku {

	public static boolean isValidSudoku(char[][] board) {
	HashSet<String> set=new HashSet<String>();
	
	for(int i=0;i<9;i++) {
		for(int j=0;j<9;j++) {
			char value=board[i][j];
			if(value!='.') {
			if(!set.add(value+"found in row"+i) ||
					!set.add(value+"found in column"+j) ||
					!set.add(value+"found in box"+i/3+"-"+j/3))
				return false;
			}
		}
	}
	
	return true;
	}
	public static void main(String[] args) {
		char[][] board={{'5','3','.','.','7','.','.','.','.'}
						,{'6','.','.','1','9','5','.','.','.'}
						,{'.','9','8','.','.','.','.','6','.'}
						,{'8','.','.','.','6','.','.','.','3'}
						,{'4','.','.','8','.','3','.','.','1'}
						,{'7','.','.','.','2','.','.','.','6'}
						,{'.','6','.','.','.','.','2','8','.'}
						,{'.','.','.','4','1','9','.','.','5'}
						,{'.','.','.','.','8','.','.','7','9'}};
		boolean result=isValidSudoku(board);
		System.out.println(result);
	}

}
