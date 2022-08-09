package com.accolite.easy;

import java.util.List;

import com.accolite.easy.TreeNode;

/*
 https://leetcode.com/problems/maximum-depth-of-binary-tree/
 
 Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */

public class MaximumDepthOfBinaryTree {
	
	public static void main(String[] args) {
		TreeNode node=new TreeNode(3);
		node.left=new TreeNode(9);
		node.right=new TreeNode(20);
		node.right.left=new TreeNode(15);
		node.right.right=new TreeNode(7);
		
		int depth=maxDepth(node);
		System.out.println(depth);
		
	}

	private static int maxDepth(TreeNode root) {
		if(root==null)
			return 0;
		int leftDepth=maxDepth(root.left);
		int RightDepth=maxDepth(root.right);
		
		int depth=Math.max(leftDepth, RightDepth);
		return depth+1;
	}

}
