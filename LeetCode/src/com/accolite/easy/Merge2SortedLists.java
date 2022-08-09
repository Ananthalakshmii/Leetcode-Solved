package com.accolite.easy;

/*
 https://leetcode.com/problems/merge-two-sorted-lists/
 
 You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
 */
public class Merge2SortedLists {
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)
        	return null;
        if(list1==null)
        	return list2;
        if(list2==null)
        	return list1;
        
        ListNode list=new ListNode(0); //from class LinkedListCycle
        ListNode head=list;
        
        while(list1!=null && list2!=null) {
        	if(list1.value < list2.value) {
        		head.next=list1;
        		head=head.next;
        		list1=list1.next;
        	}
        	else {
        		head.next=list2;
        		head=head.next;
        		list2=list2.next;
        	}
        }
        
        if(list1!=null)
        	head.next=list1;
        
        if(list2!=null)
        	head.next=list2;
        
        return list.next;
    }
	
	public static void main(String[] args) {
		ListNode list1=new ListNode(1);
		list1.next=new ListNode(2);
		list1.next.next=new ListNode(4);
		
		ListNode list2=new ListNode(1);
		list2.next=new ListNode(3);
		list2.next.next=new ListNode(4);
		
		ListNode result=mergeTwoLists(list1, list2);
		
		while(result!=null) {
			System.out.print(result.value+" ");
			result=result.next;
		}
	}
}
