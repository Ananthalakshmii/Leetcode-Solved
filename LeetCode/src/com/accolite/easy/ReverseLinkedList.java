package com.accolite.easy;

/*
 https://leetcode.com/problems/reverse-linked-list/
 
 Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class ReverseLinkedList {
	
	public static ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        
        while(curr!=null) {
        	ListNode next=curr.next;
        	curr.next=prev;
        	
        	prev=curr;
        	curr=next;
        }
		
		return prev;
    }

	public static void main(String[] args) {
		ListNode list=new ListNode(1); // from class LinkedListCycle
		list.next=new ListNode(2);
		list.next.next=new ListNode(3);
		list.next.next.next=new ListNode(4);
		list.next.next.next.next=new ListNode(5);
		
		ListNode result=reverseList(list);
		while(result!=null) {
			System.out.print(result.value+" ");
			result=result.next;
		}

	}

}
