package com.accolite.easy;

import java.util.ArrayList;
import java.util.List;

/*
 https://leetcode.com/problems/invert-binary-tree/
 
 Given the root of a binary tree, invert the tree, and return its root.
 */

public class InvertBinaryTree {
	public static void main(String[] args) {
		TreeNode node=new TreeNode(4);
		node.left=new TreeNode(2);
		node.right=new TreeNode(7);
		node.left.left=new TreeNode(1);
		node.left.right=new TreeNode(3);
		node.right.left=new TreeNode(6);
		node.right.right=new TreeNode(9);
		
		
		List<Integer> li=new ArrayList<Integer>();
		TreeNode node1=invertBinaryTree(node);
		printNodes(node1);
	}

	private static void printNodes(TreeNode node1) {
		if(node1==null)
			return;
		System.out.println(node1.val);
		printNodes(node1.left);
		printNodes(node1.right);
		
	}

	private static TreeNode invertBinaryTree(TreeNode root) {
		if(root==null)
			return root;
		
		invertBinaryTree(root.left);
		invertBinaryTree(root.right);
		
		TreeNode temp=root.left;
		root.left=root.right;
		root.right=temp;
		
		return root;
	}
}
