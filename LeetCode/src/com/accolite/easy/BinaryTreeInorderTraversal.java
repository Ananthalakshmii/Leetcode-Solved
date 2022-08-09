package com.accolite.easy;

import java.util.ArrayList;
import java.util.List;
/*
 https://leetcode.com/problems/binary-tree-inorder-traversal/
 
 Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */
public class BinaryTreeInorderTraversal {

	public static void main(String[] args) {
		TreeNode node=new TreeNode(1);
		node.right=new TreeNode(2);
		node.right.left=new TreeNode(3);
		List<Integer> li=new ArrayList<Integer>();
		List<Integer> list=InOrderTraversal(li,node);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
	}

	private static List<Integer> InOrderTraversal(List<Integer> list, TreeNode node) {
		if(node==null) 
			return list;
		InOrderTraversal(list, node.left);
		list.add(node.val);
		InOrderTraversal(list, node.right);
		
		return list;
	}
}

