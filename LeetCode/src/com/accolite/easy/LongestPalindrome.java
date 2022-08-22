package com.accolite.easy;

import java.util.HashSet;

/*
 https://leetcode.com/problems/longest-palindrome/
 
 Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 */
public class LongestPalindrome {
	
	public static void main(String[] args) {
		String s="abccccdd";
		int  count=longestPalindrome(s);
		System.out.println(count);
	}

	private static int longestPalindrome(String s) {
		if(s==null || s.length()==0)
			return 0;
		
		int count=0;
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			if(set.contains(s.charAt(i))) {
				set.remove(s.charAt(i));
				count++;
			}else {
				set.add(s.charAt(i));
			}
		}
		
		if(!set.isEmpty())
			return count*2+1;
		else
			return count*2;
	}

}
