package com.accolite.easy;

import java.util.HashSet;

/*
 https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
 
 Given the root of a Binary Search Tree and a target number k, return true 
 if there exist two elements in the BST such that their sum is equal to the given target.
 */
public class TwoSum4 {

	 
	public static void main(String[] args) {
		TreeNode node=new TreeNode(5);
		node.left=new TreeNode(3);
		node.right=new TreeNode(6);
		node.left.left=new TreeNode(2);
		node.left.right=new TreeNode(4);
		node.right.right=new TreeNode(7);
		
		int target=9;
		HashSet<Integer> set=new HashSet<Integer>();
		boolean result=findTarget(node,target,set);
		System.out.println(result?"has two elements":"does not exist");
	}

	
	
	private static boolean findTarget(TreeNode root, int k,HashSet<Integer> set) {
		
		if(root==null)
			return false;
		if(set.contains(k-root.val))
			return true;
		
		set.add(root.val);
		
		return findTarget(root.left, k, set) || findTarget(root.right, k, set);
	}
}
