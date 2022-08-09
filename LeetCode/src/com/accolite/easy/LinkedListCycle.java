package com.accolite.easy;

import java.util.List;

/*
 https://leetcode.com/problems/linked-list-cycle/
 
 Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by 
continuously following the next pointer. Internally, pos is used to denote the index of the node 
that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.
 */
public class LinkedListCycle {
	public static boolean hasCycle(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;
       if(head==null) return false;
       while(fast.next!=null && fast.next.next!=null) {
    	   slow=slow.next;
    	   fast=fast.next.next;
    	   if(slow==fast)
    		   return true;
       }
       
		return false;
    }

	public static void main(String[] args) {
		ListNode list=new ListNode(3);
		ListNode list1 =new ListNode(2);
		list.next=list1;
		list.next.next=new ListNode(0);
		list.next.next.next=list1;
		System.out.println(hasCycle(list));
	}
}
class ListNode{
	int value;
	ListNode next;
	
	public ListNode() {
		
	}
	
	ListNode(int x){
		value=x;
		next=null;
	}
	
	ListNode(int x,ListNode next){
		this.value=x;
		this.next=next;
	}
}