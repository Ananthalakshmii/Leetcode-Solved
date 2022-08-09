package com.accolite.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 https://leetcode.com/problems/binary-tree-level-order-traversal/
 
 Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 */
public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		TreeNode node=new TreeNode(3);
		node.left=new TreeNode(9);
		node.right=new TreeNode(20);
		node.right.left=new TreeNode(15);
		node.right.right=new TreeNode(7);
		
		List<List<Integer>> list=levelOrderTraversal(node);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" ");
	}

	private static List<List<Integer>> levelOrderTraversal( TreeNode node) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		levelOrder(list,node,0);
		return list;
	}

	private static void levelOrder(List<List<Integer>> list, TreeNode node, int level) {
		if(node==null)
			return;
		//System.out.println(level+" "+list.size());
		if(level>=list.size())
			list.add(new LinkedList<Integer>());
		list.get(level).add(node.val);
		levelOrder(list, node.left, level+1);
		levelOrder(list, node.right, level+1);
		
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