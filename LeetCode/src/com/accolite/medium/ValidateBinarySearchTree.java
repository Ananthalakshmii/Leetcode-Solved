package com.accolite.medium;

import java.util.List;

/*
 https://leetcode.com/problems/validate-binary-search-tree/
 
 Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 */
public class ValidateBinarySearchTree {
	public static void main(String[] args) {
		TreeNode node=new TreeNode(5);
		node.left=new TreeNode(1);
		node.right=new TreeNode(4);
		node.right.left=new TreeNode(3);
		node.right.right=new TreeNode(6);
		
		boolean result=isValidBST(node);
		System.out.println(result?"is a valid BST":"not a valid BST");
	}

	private static boolean isValidBST(TreeNode root) {
		return isValidBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}

	private static boolean isValidBST(TreeNode root, int minValue, int maxValue) {
		if(root==null)
			return true;
		if(root.val<=minValue || root.val>=maxValue)
			return false;
		return ((isValidBST(root.left, minValue, root.val)) && (isValidBST(root.right,root.val,maxValue)));
	}

}
