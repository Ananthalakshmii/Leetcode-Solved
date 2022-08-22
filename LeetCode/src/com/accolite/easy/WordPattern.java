package com.accolite.easy;

import java.util.HashMap;

/*
 https://leetcode.com/problems/word-pattern/
 
 Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 */
public class WordPattern {
	public static void main(String[] args) {
		String pattern="abba";
		String s="dog cat cat dog";
		boolean match=wordPatttern(pattern,s);
		System.out.println(match);
		System.out.println(wordPatttern("abba", "dog cat cat fish"));
		System.out.println(wordPatttern("abba", "dog dog dog dog"));
	}

	private static boolean wordPatttern(String pattern, String s) {
		HashMap<Character, String> map=new HashMap<>();
		String[] list=s.split(" ");
		if(list.length!=pattern.length())
			return false;
		for(int i=0;i<pattern.length();i++) {
			
			if(map.containsValue(list[i]) && !map.containsKey(pattern.charAt(i)))
				return false;
			else if(map.get(pattern.charAt(i))==null)
				map.put(pattern.charAt(i), list[i]);
			
			//System.out.println(map.containsKey(pattern.charAt(i))+" "+map.get(pattern.charAt(i)) +" "+ list[i]);
			else if( map.containsKey(pattern.charAt(i)) && !map.get(pattern.charAt(i)).equals(list[i])) 
				return false;
		}
		
		return true;
	}

}
