package com.accolite.easy;

import java.util.HashMap;

/*
 https://leetcode.com/problems/ransom-note/
 
 Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote
 */
public class RansomNote {
	
	public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map=new HashMap<Character, Integer>();
        for(int i=0;i<ransomNote.length();i++) {
        	map.put(ransomNote.charAt(i), map.getOrDefault(ransomNote.charAt(i), 0)+1);
        }
        
        for(int i=0;i<magazine.length();i++) {
        	if(map.containsKey(magazine.charAt(i)))
        		map.put(magazine.charAt(i), map.get(magazine.charAt(i))-1);
        }
        
        for(Character key: map.keySet())
        	if(map.get(key)>=1)
        		return false;
		
		return true;
    }

	public static void main(String[] args) {
		String ransomNote="aa";
		String magazine="aab";
		boolean flag=canConstruct(ransomNote, magazine);
		System.out.println(flag);
	}

}
