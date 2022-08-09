package com.accolite.easy;

import java.util.ArrayList;
import java.util.List;

public class SymmetricTree {

	public static void main(String[] args) {
		TreeNode node=new TreeNode(1);
		node.left=new TreeNode(2);
		node.right=new TreeNode(2);
		node.left.left=new TreeNode(3);
		node.left.right=new TreeNode(4);
		node.right.left=new TreeNode(4);
		node.right.right=new TreeNode(3);

		boolean symmetric=isSymmetric(node);
		System.out.println(symmetric?"symmetric tree":"not a symmetric tree");
		
	}

	private static boolean isSymmetric(TreeNode root) {
		if(root==null)
			return true;
		return isSymmetric(root.left,root.right);
	}

	private static boolean isSymmetric(TreeNode left, TreeNode right) {
		if(left==null && right==null)
			return true;
		else if(left==null || right==null)
			return false;
		
		if(left.val!=right.val)
			return false;
		
		if(!isSymmetric(left.left, right.right))
			return false;
		if(!isSymmetric(left.right, right.left))
			return false;
		
		return true;
	}
}
