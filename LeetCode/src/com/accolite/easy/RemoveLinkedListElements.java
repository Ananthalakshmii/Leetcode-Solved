package com.accolite.easy;

/*
 https://leetcode.com/problems/remove-linked-list-elements/
 
 Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 */
public class RemoveLinkedListElements {

	public static ListNode removeElements(ListNode head, int val) {
		if(head==null)
			return head;
		ListNode link=new ListNode();
		ListNode temp=link;
		link.next=head;
		 
		  while(link.next!=null) { 
			  if(link.next.value==val) { 
				  link.next=link.next.next;
			  }
			  else
			  link=link.next; 
			  
		  }
		  
		  return temp.next;
	}

	public static void main(String[] args) {
		ListNode list=new ListNode(1);
		list.next=new ListNode(2);
		list.next.next=new ListNode(6);
		list.next.next.next=new ListNode(3);
		list.next.next.next.next=new ListNode(4);
		list.next.next.next.next.next=new ListNode(5);
		list.next.next.next.next.next.next=new ListNode(6);
		
		ListNode result=removeElements(list, 6);
		while(result!=null) {
			System.out.print(result.value+" ");
			result=result.next;
		}

	}

}
