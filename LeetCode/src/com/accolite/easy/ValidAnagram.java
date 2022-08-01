package com.accolite.easy;

import java.util.HashMap;

/*
 https://leetcode.com/problems/valid-anagram/
 
 Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 */
public class ValidAnagram {
	 public static boolean isAnagram(String s, String t) {
	     if(s.length()!=t.length())
	    	 return false;
	     
	     HashMap<Character, Integer> map=new HashMap<Character, Integer>();
	     for(int i=0;i<s.length();i++) {
	    	 map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
	     }
	     
	     
	     
	     for(int i=0;i<t.length();i++) {
	    	 if(map.containsKey(t.charAt(i))) {
	    		 map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)-1);
	    		/* if(map.get(t.charAt(i))==1)
	    			 map.remove(t.charAt(i));
	    		 else
	    			 map.put(t.charAt(i),map.get(t.charAt(i))-1);*/
	    		 
	    	 }
	    	 else
	    		 return false;
	     }
	     
	     for(Character key: map.keySet())
	    	 if(map.get(key)>0)
	    		 return false;
		 
		 return true;
	    }

	public static void main(String[] args) {
		String s="anagram";
		String t="nagaram";
		boolean flag=isAnagram(s, t);
		System.out.println(flag);

	}

}
