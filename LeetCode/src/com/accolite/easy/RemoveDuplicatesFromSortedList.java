package com.accolite.easy;

/*
 https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 
 Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 */
public class RemoveDuplicatesFromSortedList {

	public static ListNode deleteDuplicates(ListNode head) {
		if(head==null)
			return null;
		ListNode list=head;
		
		while(list.next!=null) {
			if(list.value==list.next.value)
				list.next=list.next.next;
			else
				list=list.next;
		}
		
		return head;
    }
	public static void main(String[] args) {
		ListNode list=new ListNode(1); //from class LinkedListCycle
		list.next=new ListNode(1);
		list.next.next=new ListNode(2);
		ListNode result=deleteDuplicates(list);
		while(result!=null) {
			System.out.print(result.value+" ");
			result=result.next;
		}
	}

}
