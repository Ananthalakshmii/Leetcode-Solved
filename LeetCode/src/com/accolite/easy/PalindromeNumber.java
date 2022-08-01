package com.accolite.easy;

/*
 https://leetcode.com/problems/palindrome-number/
 
 Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward
 */
public class PalindromeNumber {
	
	 public static boolean isPalindrome(int x) {//x=12
	        boolean flag= false;
	        if(x<0)
	        	flag=false;
	        else {
	        	int rev=0;
	        	int div,mod;
	        	int num=x;
	        	while(num!=0) {
	        		rev=num%10 + (rev*10);
	        		num=num/10;
	        	}
	        	if(x==rev)
	        		flag=true;
	        }
	        
	        return flag;
	    }
	 
	 public static void main(String[] args) {
		 int x=121;
		 boolean result=isPalindrome(x);
		 System.out.println((result)?"is palindrome":"not a palindrome");
		 
		
	}

}
