package com.accolite.easy;

import java.util.ArrayList;
import java.util.List;
/*
 https://leetcode.com/problems/binary-tree-preorder-traversal/
 
 Given the root of a binary tree, return the preorder traversal of its nodes' values.
 */
public class BinaryTreePreorderTraversal {

	public static void main(String[] args) {
		TreeNode node=new TreeNode(1);
		node.right=new TreeNode(2);
		node.right.left=new TreeNode(3);
		List<Integer> li=new ArrayList<Integer>();
		List<Integer> list=postOrderTraversal(li,node);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
	}

	private static List<Integer> postOrderTraversal(List<Integer> list, TreeNode node) {
		if(node==null) 
			return list;
		postOrderTraversal(list, node.left);
		postOrderTraversal(list, node.right);
		list.add(node.val);
		
		return list;
	}
}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode() {
		
	}
	TreeNode(int val){
		this.val=val;
	}
	TreeNode(int val,TreeNode left, TreeNode right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
}