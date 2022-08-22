package com.accolite.easy;

/*
 https://leetcode.com/problems/add-strings/
 
 Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
 */
public class AddStrings {
	
	public static void main(String[] args) {
		String num1="11", num2="123";
		String result=addStrings(num1,num2);
		System.out.println(result);
	}

	private static String addStrings(String num1, String num2) {
		StringBuilder str=new StringBuilder();
		int len1=num1.length()-1;
		int len2=num2.length()-1;
		int carry=0;
		
		while(len1>=0 || len2>=0) {
			int sum=carry;
			if(len1>=0)
				sum= sum+ num1.charAt(len1--) -'0';
			if(len2>=0)
				sum=sum+ num2.charAt(len2--) - '0';
			str.append(sum%10);
			carry=sum/10;
		}
		if(carry>0)
			str.append(carry);
		return str.reverse().toString();
	}

}
