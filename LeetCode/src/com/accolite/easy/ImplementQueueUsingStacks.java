package com.accolite.easy;

import java.util.Stack;

/*
 https://leetcode.com/problems/implement-queue-using-stacks/
 
 Implement a first in first out (FIFO) queue using only two stacks. 
 The implemented queue should support all the functions of a normal queue 
 (push, peek, pop, and empty).

Implement the MyQueue class
 */
public class ImplementQueueUsingStacks {
	
	Stack<Integer> first;
	Stack<Integer> second;
	
	public ImplementQueueUsingStacks() {
		first=new Stack<Integer>();
		second = new Stack<Integer>();
		
	}
    
    public void push(int x) {
        if(first.isEmpty()) {
        	first.push(x);
        }else {
        	while(!first.isEmpty())
        		second.push(first.pop());
        	
        	first.push(x);
        	
        	while(!second.isEmpty())
        		first.push(second.pop());
        }
    }
    
    public int pop() {
       return  first.pop();
    }
    
    public int peek() {
        return first.peek();
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
}
