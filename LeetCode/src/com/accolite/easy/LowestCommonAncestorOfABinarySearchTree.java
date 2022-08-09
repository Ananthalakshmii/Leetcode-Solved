package com.accolite.easy;

/*
 https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 
 Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined 
between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 */
public class LowestCommonAncestorOfABinarySearchTree {
	
	public static void main(String[] args) {
		TreeNode node=new TreeNode(6);
		node.left=new TreeNode(2);
		node.right=new TreeNode(8);
		node.left.left=new TreeNode(0);
		node.left.right=new TreeNode(4);
		node.left.right.left=new TreeNode(3);
		node.left.right.right=new TreeNode(5);
		node.right.left=new TreeNode(7);
		node.right.right=new TreeNode(9);
		
		TreeNode result=lowestCommonAncestor(node,node.left.right.left,node.left.right.right); //3,5
		System.out.println(result.val);
		
	}

	private static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(p.val<root.val && q.val<root.val)
			return lowestCommonAncestor(root.left, p, q);
		else if(p.val>root.val && q.val>root.val)
			return lowestCommonAncestor(root.right, p, q);
		else
			return root;
	}

}
