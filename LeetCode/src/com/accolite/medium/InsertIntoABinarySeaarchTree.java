package com.accolite.medium;

import com.accolite.medium.TreeNode;

/*
 https://leetcode.com/problems/insert-into-a-binary-search-tree/
 
 You are given the root node of a binary search tree (BST) and a value to insert into the tree. 
 Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.

Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them.
 */
public class InsertIntoABinarySeaarchTree {

	public static void main(String[] args) {
		TreeNode node=new TreeNode(4);
		node.left=new TreeNode(2);
		node.right=new TreeNode(7);
		node.left.left=new TreeNode(1);
		node.left.right=new TreeNode(3);
		
		int insert=5;
		TreeNode result=insertIntoBST(node,insert);
		levelOrderTraversal(result,0);
	}

	private static void levelOrderTraversal(TreeNode root, int level) {
		if(root==null)
			return;
		System.out.println(root.val);
		levelOrderTraversal(root.left, level+1);
		levelOrderTraversal(root.right, level+1);
		
	}

	private static TreeNode insertIntoBST(TreeNode root, int val) {
		if(root==null)
			return new TreeNode(val);
		if(root.val>val)
			 root.left=insertIntoBST(root.left, val);
		else
			root.right=insertIntoBST(root.right, val);
		return root;
	}

}
