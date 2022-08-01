package com.accolite.easy;

import java.util.HashMap;
/*
 https://leetcode.com/problems/first-unique-character-in-a-string/
 
 Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 */
public class FirstUniqueCharInAString {
	
	 public static int firstUniqChar(String str) {
		 int index=-1;
		 HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		 
		 for(int i=0;i<str.length();i++) {
			 if(map.containsKey(str.charAt(i)))
				 map.put(str.charAt(i), 2);
			 else
				 map.put(str.charAt(i), 1);
		 }
		 
		 for(int i=0;i<str.length();i++) {
			 if(map.get(str.charAt(i))==1)
				 return str.indexOf(str.charAt(i));
		 }
		 
		 
		 return index;
	        
	    }

	public static void main(String[] args) {
		String s="loveleetcode";
		int index=firstUniqChar(s);
		System.out.println(index);

	}

}
