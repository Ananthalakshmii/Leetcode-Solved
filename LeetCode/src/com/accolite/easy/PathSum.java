package com.accolite.easy;

/*
 https://leetcode.com/problems/path-sum/
 
 Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path 
 such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.
 */
public class PathSum {
	public static void main(String[] args) {
		TreeNode node=new TreeNode(5);
		node.left=new TreeNode(4);
		node.right=new TreeNode(8);
		node.left.left=new TreeNode(11);
		node.left.left.left=new TreeNode(7);
		node.left.left.right=new TreeNode(2);
		node.right.left=new TreeNode(13);
		node.right.right=new TreeNode(4);
		node.right.right.right=new TreeNode(1);
		
		int targetSum=22;
		boolean hasPath=hasPathSum(node,targetSum);
		System.out.println(hasPath?"has path sum":"does not have path sum");
	}

	private static boolean hasPathSum(TreeNode root, int targetSum) {
		if(root==null)
			return false;
		if(root.val==targetSum && (root.left==null && root.right==null))
			return true;
		
		return ((hasPathSum(root.left, targetSum-root.val)) || (hasPathSum(root.right, targetSum-root.val)));
	}

}
