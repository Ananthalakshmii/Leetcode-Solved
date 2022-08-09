package com.accolite.easy;

/*
 https://leetcode.com/problems/search-in-a-binary-search-tree/
 
 
 You are given the root of a binary search tree (BST) and an integer val.

Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.
 */
public class SearchInABinarySearchTree {
	
	public static void main(String[] args) {
		TreeNode node=new TreeNode(4);
		node.left=new TreeNode(2);
		node.right=new TreeNode(7);
		node.left.left=new TreeNode(1);
		node.left.right=new TreeNode(3);
		
		int search=2;
		TreeNode result=searchBST(node,search);
		System.out.println(result.val+" "+result.left.val+" "+result.right.val);
	}

	private static TreeNode searchBST(TreeNode root, int val) {
		while(root!=null && root.val!=val) {
			root=root.val<val?root.right:root.left;
		}
		return root;
	}

}
