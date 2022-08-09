package com.accolite.easy;

import java.util.HashMap;
import java.util.Stack;

/*
 https://leetcode.com/problems/valid-parentheses/
 
 Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 */
public class ValidParentheses {

	public static boolean isValid(String s) {
	     HashMap<Character, Character> map=new HashMap<Character, Character>();
	     map.put('(', ')');
	     map.put('[', ']');
	     map.put('{', '}');
	     
	     Stack<Character> stack=new Stack<Character>();
	     for(int i=0;i<s.length();i++) {
	    	 char c= s.charAt(i);
	    	 
	    	 if(map.keySet().contains(c)) {
	    		 stack.push(c);
	    	 }else if(map.values().contains(c)) {
	    		 if(!stack.isEmpty() && map.get(stack.peek())==c)
	    			 stack.pop();
	    		 else
	    			 return false;
	    	 }
	     }
		
		return stack.isEmpty();
	 }
	
	public static void main(String[] args) {
		String s="()[]{}";
		boolean result=isValid(s);
		System.out.println(result?"valid parentheses":"not a valid parentheses");
	}
}
